package com.wonders.zjyzgl.core.repository

import javax.persistence.EntityManager

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.support.SimpleJpaRepository

class MyRepositoryImpl<T, ID extends Serializable> 
		extends SimpleJpaRepository<T, ID> implements MyRepository<T, ID> {
			
	private final Class<T> domainClass
	private final EntityManager entityManager
	
	MyRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);
		
		this.domainClass = domainClass
		this.entityManager = entityManager
	}

	@Override
	public Page<T> findAll(Map params, Pageable pageable) {
		println params
		println pageable
	}

}
