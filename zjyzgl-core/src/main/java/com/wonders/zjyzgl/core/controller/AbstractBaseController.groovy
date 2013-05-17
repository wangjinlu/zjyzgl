package com.wonders.zjyzgl.core.controller

import org.apache.commons.lang3.StringUtils
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

import com.wonders.zjyzgl.core.dto.Pagination
import com.wonders.zjyzgl.core.repository.MyRepository

abstract class AbstractBaseController<T, ID extends Serializable> {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	abstract MyRepository<T, ID> getRepository()
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody Pagination<T> findAll(@RequestParam Map params, 
		@RequestParam(defaultValue = "1") int page, 
		@RequestParam(defaultValue = "10") int rows) {
		
		def filters = getSearchParams(params)
		def p = getRepository().findAll(filters, new PageRequest(page - 1, rows))
		
		new Pagination<T>([total: p.totalElements, rows: p.content])
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	@ResponseBody T findOne(@PathVariable ID id) {
		getRepository().findOne(id)
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.POST)
	@ResponseBody T add(T entity) {
		getRepository().save(entity)
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.PUT)
	@ResponseBody T modify(T entity) {
		getRepository().save(entity)
	}
	 
	@RequestMapping(value = "{id}", method = RequestMethod.DELETE)
	@ResponseBody void delete(@PathVariable ID id) {
		getRepository().delete(id)
	}
	
	protected Map<String, Object> getSearchParams(Map<String, ?> params) {
		def filters = [:]
		for (String key : params.keySet()) {
			if (StringUtils.startsWith(key, "search_")) {
				String name = StringUtils.substringAfter(key, "search_")
				Object value = params.get(key) 
				if (value) {
					filters.put(name, value)
				}
			}
		}
		filters
	}

}
