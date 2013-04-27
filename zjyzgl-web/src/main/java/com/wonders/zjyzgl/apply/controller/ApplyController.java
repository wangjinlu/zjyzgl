/**
 * 
 */
package com.wonders.zjyzgl.apply.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wonders.zjyzgl.apply.entity.MatterApplyInfo;
import com.wonders.zjyzgl.apply.repository.ApplyRepository;
import com.wonders.zjyzgl.core.controller.AbstractBaseController;
import com.wonders.zjyzgl.core.repository.MyRepository;

/**
 * @author Shen
 *
 */
@Controller
@RequestMapping("apply")
public class ApplyController extends
		AbstractBaseController<MatterApplyInfo, String> {
	@Inject
	private ApplyRepository applyRepository;
	@Override
	public MyRepository<MatterApplyInfo, String> getRepository()
	{
		return this.applyRepository;
	}

}
