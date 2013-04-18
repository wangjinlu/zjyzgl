package com.wonders.zjyzgl.core.jackson

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module

class HibernateAwareObjectMapper extends ObjectMapper {
	
	HibernateAwareObjectMapper() {
		this.registerModule(new Hibernate4Module())
	}

}
