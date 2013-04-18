package com.wonders.zjyzgl.core.repository

import javax.persistence.EntityManager
import javax.persistence.TypedQuery
import javax.persistence.criteria.CriteriaQuery

import org.apache.commons.lang3.StringUtils
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.jpa.repository.query.QueryUtils
import org.springframework.data.jpa.repository.support.SimpleJpaRepository

class MyRepositoryImpl<T, ID extends Serializable> 
		extends SimpleJpaRepository<T, ID> implements MyRepository<T, ID> {
			
	private final Class<T> domainClass
	private final EntityManager entityManager
	
	// There are two constructors to choose from, either can be used.
	MyRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager)
		
		// This is the recommended method for accessing inherited class dependencies.
		this.domainClass = domainClass
		this.entityManager = entityManager
	}

	@Override
	Page<T> findAll(Map params, Pageable pageable) {
		def query = getQuery(params, pageable?.sort)
		!pageable ? new PageImpl<T>(query.resultList) : readPage(query, pageable, params)
	}
	
	private TypedQuery<T> getQuery(Map params, Sort sort) {
		
		def builder = entityManager.criteriaBuilder
		def query = builder.createQuery(domainClass)
		
		def root = query.from(domainClass)
		query.select(root)
		
		applyParamsToCriteria(params, query)
 
		if (sort) {
			query.orderBy(QueryUtils.toOrders(sort, root, builder))
		}
 
		entityManager.createQuery(query)
	}
	
	private TypedQuery<Long> getCountQuery(Map params) {
		
		def builder = entityManager.criteriaBuilder
		def query = builder.createQuery(Long.class)
		
		def root = query.from(domainClass)
		
		applyParamsToCriteria(params, query)
 
		if (query.isDistinct()) {
			query.select(builder.countDistinct(root))
		} else {
			query.select(builder.count(root))
		}
 
		entityManager.createQuery(query)
	}
	
	private void applyParamsToCriteria(Map params, CriteriaQuery query) {
 
		def builder = entityManager.criteriaBuilder
		def root = query.roots[0]
	
		def predicates = []
		params.each { k, v ->
			
			def prop = StringUtils.substringBefore(k, '_')
			def oper = StringUtils.substringAfter(k, '_')
			
			predicates << builder."$oper"(root.get(prop), v)
		}
		
		query.where(predicates)
	}
	
	private Page<T> readPage(TypedQuery<T> query, Pageable pageable, Map params) {
		
		query.firstResult = pageable.offset
		query.maxResults = pageable.pageSize
		
		def total = QueryUtils.executeCountQuery(getCountQuery(params))
		def content = total > pageable.offset ? query.resultList : []
 
		new PageImpl<T>(content, pageable, total)
	}

}
