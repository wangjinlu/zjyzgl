package com.wonders.zjyzgl.enterprise.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the Enterprise_base_info database table.
 * 
 */
@Entity
@Table(name="enterprise_base_info")
public class Eterprise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String address;

	@Column(name="agent_addr")
	private String agentAddr;

	@Column(name="agent_id")
	private String agentId;

	@Column(name="agent_name")
	private String agentName;

	@Column(name="agent_tel")
	private String agentTel;

	private String biz_depart;

	private Timestamp biz_pridate;

	private String bizLicense;

	@Column(name="busi_memo")
	private String busiMemo;

	@Column(name="busi_mode")
	private String busiMode;

	@Column(name="busi_quali")
	private String busiQuali;

	@Column(name="busi_scope")
	private String busiScope;

	@Column(name="busi_status")
	private int busiStatus;

	@Column(name="check_status")
	private String checkStatus;

	private String city;

	@Column(name="crt_date")
	private Timestamp crtDate;

	@Column(name="crt_person")
	private String crtPerson;

	private String dealer;

	private String dealer_Mobile;

	private String district;

	private int drivertrain;

	@Column(name="drivertrain_check")
	private Timestamp drivertrainCheck;

	@Column(name="econ_type")
	private String econType;

	private String email;

	private String fax;

	@Column(name="file_number")
	private String fileNumber;

	private int freight;

	@Column(name="freight_check")
	private Timestamp freightCheck;

	private int level;

	@Column(name="license_key")
	private String licenseKey;

	@Column(name="license_num")
	private String licenseNum;

	private String manager;

	private String manager_Mobile;

	private String memo;

	@Column(name="memo_01")
	private BigInteger memo01;

	@Column(name="memo_02")
	private Timestamp memo02;

	@Column(name="memo_03")
	private String memo03;

	@Column(name="memo_04")
	private String memo04;

	private String name;

	@Column(name="organ_code")
	private String organCode;

	private BigInteger parentID;

	private int passenger;

	@Column(name="passenger_check")
	private Timestamp passengerCheck;

	private Timestamp print_Date;

	private String province;

	private double regCapital;

	private Timestamp regDate;

	private int removed;

	private int repair;

	@Column(name="repair_check")
	private Timestamp repairCheck;

	@Column(name="repres_id")
	private String represId;

	@Column(name="repres_name")
	private String represName;

	private String shortName;

	private int status;

	private int taxi;

	@Column(name="taxi_check")
	private Timestamp taxiCheck;

	private String taxReg;

	private String tel;

	@Column(name="upd_date")
	private Timestamp updDate;

	@Column(name="upd_person")
	private String updPerson;

	@Column(name="valid_date_begin")
	private Timestamp validDateBegin;

	@Column(name="valid_date_end")
	private Timestamp validDateEnd;

	private String zip_Code;

	public Eterprise() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAgentAddr() {
		return this.agentAddr;
	}

	public void setAgentAddr(String agentAddr) {
		this.agentAddr = agentAddr;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return this.agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentTel() {
		return this.agentTel;
	}

	public void setAgentTel(String agentTel) {
		this.agentTel = agentTel;
	}

	public String getBiz_depart() {
		return this.biz_depart;
	}

	public void setBiz_depart(String biz_depart) {
		this.biz_depart = biz_depart;
	}

	public Timestamp getBiz_pridate() {
		return this.biz_pridate;
	}

	public void setBiz_pridate(Timestamp biz_pridate) {
		this.biz_pridate = biz_pridate;
	}

	public String getBizLicense() {
		return this.bizLicense;
	}

	public void setBizLicense(String bizLicense) {
		this.bizLicense = bizLicense;
	}

	public String getBusiMemo() {
		return this.busiMemo;
	}

	public void setBusiMemo(String busiMemo) {
		this.busiMemo = busiMemo;
	}

	public String getBusiMode() {
		return this.busiMode;
	}

	public void setBusiMode(String busiMode) {
		this.busiMode = busiMode;
	}

	public String getBusiQuali() {
		return this.busiQuali;
	}

	public void setBusiQuali(String busiQuali) {
		this.busiQuali = busiQuali;
	}

	public String getBusiScope() {
		return this.busiScope;
	}

	public void setBusiScope(String busiScope) {
		this.busiScope = busiScope;
	}

	public int getBusiStatus() {
		return this.busiStatus;
	}

	public void setBusiStatus(int busiStatus) {
		this.busiStatus = busiStatus;
	}

	public String getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getDealer() {
		return this.dealer;
	}

	public void setDealer(String dealer) {
		this.dealer = dealer;
	}

	public String getDealer_Mobile() {
		return this.dealer_Mobile;
	}

	public void setDealer_Mobile(String dealer_Mobile) {
		this.dealer_Mobile = dealer_Mobile;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getDrivertrain() {
		return this.drivertrain;
	}

	public void setDrivertrain(int drivertrain) {
		this.drivertrain = drivertrain;
	}

	public Timestamp getDrivertrainCheck() {
		return this.drivertrainCheck;
	}

	public void setDrivertrainCheck(Timestamp drivertrainCheck) {
		this.drivertrainCheck = drivertrainCheck;
	}

	public String getEconType() {
		return this.econType;
	}

	public void setEconType(String econType) {
		this.econType = econType;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFileNumber() {
		return this.fileNumber;
	}

	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}

	public int getFreight() {
		return this.freight;
	}

	public void setFreight(int freight) {
		this.freight = freight;
	}

	public Timestamp getFreightCheck() {
		return this.freightCheck;
	}

	public void setFreightCheck(Timestamp freightCheck) {
		this.freightCheck = freightCheck;
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getLicenseKey() {
		return this.licenseKey;
	}

	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

	public String getLicenseNum() {
		return this.licenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getManager_Mobile() {
		return this.manager_Mobile;
	}

	public void setManager_Mobile(String manager_Mobile) {
		this.manager_Mobile = manager_Mobile;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public BigInteger getMemo01() {
		return this.memo01;
	}

	public void setMemo01(BigInteger memo01) {
		this.memo01 = memo01;
	}

	public Timestamp getMemo02() {
		return this.memo02;
	}

	public void setMemo02(Timestamp memo02) {
		this.memo02 = memo02;
	}

	public String getMemo03() {
		return this.memo03;
	}

	public void setMemo03(String memo03) {
		this.memo03 = memo03;
	}

	public String getMemo04() {
		return this.memo04;
	}

	public void setMemo04(String memo04) {
		this.memo04 = memo04;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrganCode() {
		return this.organCode;
	}

	public void setOrganCode(String organCode) {
		this.organCode = organCode;
	}

	public BigInteger getParentID() {
		return this.parentID;
	}

	public void setParentID(BigInteger parentID) {
		this.parentID = parentID;
	}

	public int getPassenger() {
		return this.passenger;
	}

	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}

	public Timestamp getPassengerCheck() {
		return this.passengerCheck;
	}

	public void setPassengerCheck(Timestamp passengerCheck) {
		this.passengerCheck = passengerCheck;
	}

	public Timestamp getPrint_Date() {
		return this.print_Date;
	}

	public void setPrint_Date(Timestamp print_Date) {
		this.print_Date = print_Date;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public double getRegCapital() {
		return this.regCapital;
	}

	public void setRegCapital(double regCapital) {
		this.regCapital = regCapital;
	}

	public Timestamp getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public int getRemoved() {
		return this.removed;
	}

	public void setRemoved(int removed) {
		this.removed = removed;
	}

	public int getRepair() {
		return this.repair;
	}

	public void setRepair(int repair) {
		this.repair = repair;
	}

	public Timestamp getRepairCheck() {
		return this.repairCheck;
	}

	public void setRepairCheck(Timestamp repairCheck) {
		this.repairCheck = repairCheck;
	}

	public String getRepresId() {
		return this.represId;
	}

	public void setRepresId(String represId) {
		this.represId = represId;
	}

	public String getRepresName() {
		return this.represName;
	}

	public void setRepresName(String represName) {
		this.represName = represName;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTaxi() {
		return this.taxi;
	}

	public void setTaxi(int taxi) {
		this.taxi = taxi;
	}

	public Timestamp getTaxiCheck() {
		return this.taxiCheck;
	}

	public void setTaxiCheck(Timestamp taxiCheck) {
		this.taxiCheck = taxiCheck;
	}

	public String getTaxReg() {
		return this.taxReg;
	}

	public void setTaxReg(String taxReg) {
		this.taxReg = taxReg;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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

	public Timestamp getValidDateBegin() {
		return this.validDateBegin;
	}

	public void setValidDateBegin(Timestamp validDateBegin) {
		this.validDateBegin = validDateBegin;
	}

	public Timestamp getValidDateEnd() {
		return this.validDateEnd;
	}

	public void setValidDateEnd(Timestamp validDateEnd) {
		this.validDateEnd = validDateEnd;
	}

	public String getZip_Code() {
		return this.zip_Code;
	}

	public void setZip_Code(String zip_Code) {
		this.zip_Code = zip_Code;
	}
}