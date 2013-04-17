package com.wonders.zjyzgl.core.repository

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

interface MyRepository<T, ID extends Serializable> extends JpaRepository<T, ID> {
	
	Page<T> findAll(Map params, Pageable pageable)

}
