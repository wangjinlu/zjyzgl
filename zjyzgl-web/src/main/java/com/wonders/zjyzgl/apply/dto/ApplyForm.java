/**
 * 
 */
package com.wonders.zjyzgl.apply.dto;

import com.wonders.zjyzgl.apply.entity.MatterApplyInfo;
import com.wonders.zjyzgl.chartered.entity.AdmissionCharteredInfo;

/**
 * @author Shen
 *
 */
public class ApplyForm {
	private MatterApplyInfo matterApplyInfo;
	private AdmissionCharteredInfo admissionCharteredInfo;
	public MatterApplyInfo getMatterApplyInfo() {
		return matterApplyInfo;
	}
	public void setMatterApplyInfo(MatterApplyInfo matterApplyInfo) {
		this.matterApplyInfo = matterApplyInfo;
	}
	public AdmissionCharteredInfo getAdmissionCharteredInfo() {
		return admissionCharteredInfo;
	}
	public void setAdmissionCharteredInfo(
			AdmissionCharteredInfo admissionCharteredInfo) {
		this.admissionCharteredInfo = admissionCharteredInfo;
	}
	
}
