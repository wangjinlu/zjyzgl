package com.wonders.zjyzgl.signage.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wonders.zjyzgl.core.controller.AbstractBaseController;
import com.wonders.zjyzgl.core.repository.MyRepository;
import com.wonders.zjyzgl.signage.entity.YwBcbzp;
import com.wonders.zjyzgl.signage.repository.BcbzpRepository;

@Controller
@RequestMapping("bcbzp")
public class BcbzpController extends AbstractBaseController<YwBcbzp, String> {
	@Inject
	private BcbzpRepository bcbzpRepository;

	@Override
	public MyRepository<YwBcbzp, String> getRepository() {
		return this.bcbzpRepository;
		// return this.userRepository;
	}
}
