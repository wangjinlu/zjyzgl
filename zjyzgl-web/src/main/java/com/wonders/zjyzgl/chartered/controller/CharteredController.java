package com.wonders.zjyzgl.chartered.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wonders.zjyzgl.chartered.entity.AdmissionCharteredInfo;
import com.wonders.zjyzgl.chartered.repository.CharteredRepository;
import com.wonders.zjyzgl.core.controller.AbstractBaseController;
import com.wonders.zjyzgl.core.repository.MyRepository;
@Service
@RequestMapping("chartered")
public class CharteredController extends AbstractBaseController<AdmissionCharteredInfo, String> {
	@Inject
	private CharteredRepository charterRepository;
	@Override
	public MyRepository<AdmissionCharteredInfo, String> getRepository() {
		return this.charterRepository;
	}
}
