package com.wonders.zjyzgl.apply.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wonders.zjyzgl.apply.entity.MatterApplyInfo;
import com.wonders.zjyzgl.apply.repository.ApplyRepository;
import com.wonders.zjyzgl.chartered.entity.AdmissionCharteredInfo;
import com.wonders.zjyzgl.chartered.repository.CharteredRepository;

@Service
public class ApplyService {
	@Inject
	private ApplyRepository applyRepository;
	@Inject 
	private CharteredRepository charteredRepository;
	/**
	 * 登记一条许可登记事项
	 * @param matterApplyInfo 许可登记事项
	 * @param admissionCharteredInfo  受理包车信息
	 */
	@Transactional
	public void addMatterApplyInfo(MatterApplyInfo matterApplyInfo,AdmissionCharteredInfo admissionCharteredInfo)throws Exception
	{
		this.applyRepository.saveAndFlush(matterApplyInfo);
		this.charteredRepository.saveAndFlush(admissionCharteredInfo);
	}
}
