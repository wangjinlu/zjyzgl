/**
 * 
 */
package com.wonders.zjyzgl.apply.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wonders.zjyzgl.apply.dto.ApplyForm;
import com.wonders.zjyzgl.apply.entity.MatterApplyInfo;
import com.wonders.zjyzgl.apply.repository.ApplyRepository;
import com.wonders.zjyzgl.apply.service.ApplyService;
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
	
	@Inject
	private ApplyService applyService;

	@Override
	public MyRepository<MatterApplyInfo, String> getRepository() {
		return this.applyRepository;
	}

	@RequestMapping(params = "method=save", method = RequestMethod.POST)
	public @ResponseBody
	void addApplyAndChartered(ApplyForm form) {
		System.out.println("form"+form.getAdmissionCharteredInfo());
		this.applyService.addMatterApplyInfo(form.getMatterApplyInfo(), form.getAdmissionCharteredInfo());
	}
}
