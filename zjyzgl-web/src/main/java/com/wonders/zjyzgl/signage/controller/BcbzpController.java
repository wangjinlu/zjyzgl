package com.wonders.zjyzgl.signage.controller;

import javax.inject.Inject;

import com.wonders.zjyzgl.core.controller.AbstractBaseController;
import com.wonders.zjyzgl.core.repository.MyRepository;
import com.wonders.zjyzgl.signage.entity.YwBcbzp;
import com.wonders.zjyzgl.signage.repository.BcbzpRepository;

public class BcbzpController extends AbstractBaseController<YwBcbzp, String> {
	@Inject
	private BcbzpRepository bcbzpRepository;
	@Override
	public MyRepository<YwBcbzp, String> getRepository() {
		return this.bcbzpRepository;
	}
}
