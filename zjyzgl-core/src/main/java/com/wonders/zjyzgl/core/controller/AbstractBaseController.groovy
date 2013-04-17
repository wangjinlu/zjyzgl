package com.wonders.zjyzgl.core.controller

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

import com.wonders.zjyzgl.core.repository.MyRepository

abstract class AbstractBaseController<T, ID extends Serializable> {
	
	abstract MyRepository<T, ID> getRepository()
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody Page<T> findAll(@RequestParam Map params, Pageable pageable) {
		getRepository().findAll(params, pageable)
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody T findOne(@PathVariable ID id) {
		getRepository().findOne(id)
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseBody String delete(@PathVariable ID id) {
		getRepository().delete(id)
		'{success: true}'
	}

}
