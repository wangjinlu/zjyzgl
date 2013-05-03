package com.wonders.zjyzgl.apply.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the matters_apply_info database table.
 * 
 */
@Entity
@Table(name = "matters_apply_info")
public class MatterApplyInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String guid;

	@Column(name = "adms_num")
	private String admsNum;

	@Column(name = "agent_id_num")
	private String agentIdNum;

	@Column(name = "agent_name")
	private String agentName;

	@Column(name = "agent_tel_num")
	private String agentTelNum;

	@Column(name = "aply_code")
	private String aplyCode;

	@Column(name = "aply_name")
	private String aplyName;

	@Column(name = "aplyer_addr")
	private String aplyerAddr;

	@Column(name = "aplyer_name")
	private String aplyerName;

	@Column(name = "aplyer_tel_num")
	private String aplyerTelNum;

	@Column(name = "crt_date")
	private Timestamp crtDate;

	@Column(name = "crt_person")
	private String crtPerson;

	@Column(name = "expired_date")
	private Timestamp expiredDate;

	@Column(name = "has_csign")
	private int hasCsign;

	@Column(name = "has_latters")
	private int hasLatters;

	@Column(name = "item_id")
	private String itemId;

	@Column(name = "licen_num")
	private String licenNum;

	@Column(name = "matt_num")
	private String mattNum;

	@Column(name = "organ_code")
	private String organCode;

	@Column(name = "proc_id")
	private String procId;

	private int removed;

	private String transactor;

	@Column(name = "upd_date")
	private Timestamp updDate;

	@Column(name = "upd_person")
	private String updPerson;
	
	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getAdmsNum() {
		return this.admsNum;
	}

	public void setAdmsNum(String admsNum) {
		this.admsNum = admsNum;
	}

	public String getAgentIdNum() {
		return this.agentIdNum;
	}

	public void setAgentIdNum(String agentIdNum) {
		this.agentIdNum = agentIdNum;
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentTelNum() {
		return this.agentTelNum;
	}

	public void setAgentTelNum(String agentTelNum) {
		this.agentTelNum = agentTelNum;
	}

	public String getAplyCode() {
		return this.aplyCode;
	}

	public void setAplyCode(String aplyCode) {
		this.aplyCode = aplyCode;
	}

	public String getAplyName() {
		return this.aplyName;
	}

	public void setAplyName(String aplyName) {
		this.aplyName = aplyName;
	}

	public String getAplyerAddr() {
		return this.aplyerAddr;
	}

	public void setAplyerAddr(String aplyerAddr) {
		this.aplyerAddr = aplyerAddr;
	}

	public String getAplyerName() {
		return this.aplyerName;
	}

	public void setAplyerName(String aplyerName) {
		this.aplyerName = aplyerName;
	}

	public String getAplyerTelNum() {
		return this.aplyerTelNum;
	}

	public void setAplyerTelNum(String aplyerTelNum) {
		this.aplyerTelNum = aplyerTelNum;
	}

	public Timestamp getCrtDate() {
		return this.crtDate;
	}

	public void setCrtDate(Timestamp crtDate) {
		this.crtDate = crtDate;
	}

	public String getCrtPerson() {
		return this.crtPerson;
	}

	public void setCrtPerson(String crtPerson) {
		this.crtPerson = crtPerson;
	}

	public Timestamp getExpiredDate() {
		return this.expiredDate;
	}

	public void setExpiredDate(Timestamp expiredDate) {
		this.expiredDate = expiredDate;
	}

	public int getHasCsign() {
		return this.hasCsign;
	}

	public void setHasCsign(int hasCsign) {
		this.hasCsign = hasCsign;
	}

	public int getHasLatters() {
		return this.hasLatters;
	}

	public void setHasLatters(int hasLatters) {
		this.hasLatters = hasLatters;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLicenNum() {
		return this.licenNum;
	}

	public void setLicenNum(String licenNum) {
		this.licenNum = licenNum;
	}

	public String getMattNum() {
		return this.mattNum;
	}

	public void setMattNum(String mattNum) {
		this.mattNum = mattNum;
	}

	public String getOrganCode() {
		return this.organCode;
	}

	public void setOrganCode(String organCode) {
		this.organCode = organCode;
	}

	public String getProcId() {
		return this.procId;
	}

	public void setProcId(String procId) {
		this.procId = procId;
	}

	public int getRemoved() {
		return this.removed;
	}

	public void setRemoved(int removed) {
		this.removed = removed;
	}

	public String getTransactor() {
		return this.transactor;
	}

	public void setTransactor(String transactor) {
		this.transactor = transactor;
	}

	public Timestamp getUpdDate() {
		return this.updDate;
	}

	public void setUpdDate(Timestamp updDate) {
		this.updDate = updDate;
	}

	public String getUpdPerson() {
		return this.updPerson;
	}

	public void setUpdPerson(String updPerson) {
		this.updPerson = updPerson;
	}

}