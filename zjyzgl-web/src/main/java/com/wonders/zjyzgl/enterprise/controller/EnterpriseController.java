package com.wonders.zjyzgl.enterprise.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wonders.zjyzgl.core.controller.AbstractBaseController;
import com.wonders.zjyzgl.core.repository.MyRepository;
import com.wonders.zjyzgl.enterprise.entity.Eterprise;
import com.wonders.zjyzgl.enterprise.repository.EterpriseRepository;

@Controller
@RequestMapping("yh")
public class EnterpriseController extends AbstractBaseController<Eterprise, Long> {
	@Inject
	private EterpriseRepository eterpriseRepository;

	@Override
	public MyRepository<Eterprise, Long> getRepository() {
		return this.eterpriseRepository;
		// return this.userRepository;
	}
}
