package com.wonders.zjyzgl.apply.service;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wonders.zjyzgl.apply.entity.MatterApplyInfo;
import com.wonders.zjyzgl.apply.repository.ApplyRepository;
import com.wonders.zjyzgl.chartered.entity.AdmissionCharteredInfo;
import com.wonders.zjyzgl.chartered.repository.CharteredRepository;

@Service
public class ApplyService {
	
	Logger log = LoggerFactory.getLogger(ApplyService.class);
	
	@Inject
	private ApplyRepository applyRepository;
	
	@Inject
	private CharteredRepository charteredRepository;

	/**
	 * 登记一条许可登记事项
	 * 
	 * @param matterApplyInfo
	 *            许可登记事项
	 * @param admissionCharteredInfo
	 *            受理包车信息
	 */
	@Transactional
	public void addMatterApplyInfo(MatterApplyInfo matterApplyInfo,
			AdmissionCharteredInfo admissionCharteredInfo) {
		MatterApplyInfo rmatterApplyInfo=this.applyRepository.save(matterApplyInfo);
		System.out.println("rmatterApplyInfo"+admissionCharteredInfo);
		admissionCharteredInfo.setMaId(rmatterApplyInfo.getGuid());
		this.charteredRepository.save(admissionCharteredInfo);
	}
}
