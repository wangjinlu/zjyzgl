package com.wonders.zjyzgl.chartered.entity;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.math.BigInteger;
import java.sql.Timestamp;


/**
 * The persistent class for the admission_chartered_info database table.
 * 
 */
@Entity
@Table(name="admission_chartered_info")
public class AdmissionCharteredInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	private String guid;

	private String bcbzpid;

	private int bclx;

	private Timestamp bzpfzsj;

	private String bzph;

	private Timestamp bzpjz;

	private Timestamp bzpks;

	private int bzplx;

	private String bzpzt;

	private String cldj;

	private BigInteger clid;

	private int cllx;

	private int clzw;

	private String cph;

	@Column(name="CRT_DATE")
	private Timestamp crtDate;

	@Column(name="CRT_ID")
	private String crtId;

	private String fzjg;

	private int jlzt;

	private int jyqy;

	private int jzlx;

	@Column(name="ma_id")
	private String maId;

	private String memo;

	private int pzlx;

	private String qdds;

	private String qdsf;

	private String qdxzc;

	private String qdxzdm;

	private String qdxzmc;

	private int qzlx;

	private int removed;

	private String slbh;

	@Column(name="ST_DATE")
	private Timestamp stDate;

	private String syyy;

	@Column(name="UPD_DATE")
	private Timestamp updDate;

	@Column(name="UPD_ID")
	private String updId;

	private Timestamp xkzmyxjz;

	private Timestamp xkzmyxqs;

	private String ydxzc;

	private String ydxzdm;

	private String ydxzmc;

	private String ygjgmc;

	private BigInteger yhid;

	private String zdds;

	private String zdsf;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getBcbzpid() {
		return this.bcbzpid;
	}

	public void setBcbzpid(String bcbzpid) {
		this.bcbzpid = bcbzpid;
	}

	public int getBclx() {
		return this.bclx;
	}

	public void setBclx(int bclx) {
		this.bclx = bclx;
	}

	public Timestamp getBzpfzsj() {
		return this.bzpfzsj;
	}

	public void setBzpfzsj(Timestamp bzpfzsj) {
		this.bzpfzsj = bzpfzsj;
	}

	public String getBzph() {
		return this.bzph;
	}

	public void setBzph(String bzph) {
		this.bzph = bzph;
	}

	public Timestamp getBzpjz() {
		return this.bzpjz;
	}

	public void setBzpjz(Timestamp bzpjz) {
		this.bzpjz = bzpjz;
	}

	public Timestamp getBzpks() {
		return this.bzpks;
	}

	public void setBzpks(Timestamp bzpks) {
		this.bzpks = bzpks;
	}

	public int getBzplx() {
		return this.bzplx;
	}

	public void setBzplx(int bzplx) {
		this.bzplx = bzplx;
	}

	public String getBzpzt() {
		return this.bzpzt;
	}

	public void setBzpzt(String bzpzt) {
		this.bzpzt = bzpzt;
	}

	public String getCldj() {
		return this.cldj;
	}

	public void setCldj(String cldj) {
		this.cldj = cldj;
	}

	public BigInteger getClid() {
		return this.clid;
	}

	public void setClid(BigInteger clid) {
		this.clid = clid;
	}

	public int getCllx() {
		return this.cllx;
	}

	public void setCllx(int cllx) {
		this.cllx = cllx;
	}

	public int getClzw() {
		return this.clzw;
	}

	public void setClzw(int clzw) {
		this.clzw = clzw;
	}

	public String getCph() {
		return this.cph;
	}

	public void setCph(String cph) {
		this.cph = cph;
	}

	public Timestamp getCrtDate() {
		return this.crtDate;
	}

	public void setCrtDate(Timestamp crtDate) {
		this.crtDate = crtDate;
	}

	public String getCrtId() {
		return this.crtId;
	}

	public void setCrtId(String crtId) {
		this.crtId = crtId;
	}

	public String getFzjg() {
		return this.fzjg;
	}

	public void setFzjg(String fzjg) {
		this.fzjg = fzjg;
	}

	public int getJlzt() {
		return this.jlzt;
	}

	public void setJlzt(int jlzt) {
		this.jlzt = jlzt;
	}

	public int getJyqy() {
		return this.jyqy;
	}

	public void setJyqy(int jyqy) {
		this.jyqy = jyqy;
	}

	public int getJzlx() {
		return this.jzlx;
	}

	public void setJzlx(int jzlx) {
		this.jzlx = jzlx;
	}

	public String getMaId() {
		return this.maId;
	}

	public void setMaId(String maId) {
		this.maId = maId;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public int getPzlx() {
		return this.pzlx;
	}

	public void setPzlx(int pzlx) {
		this.pzlx = pzlx;
	}

	public String getQdds() {
		return this.qdds;
	}

	public void setQdds(String qdds) {
		this.qdds = qdds;
	}

	public String getQdsf() {
		return this.qdsf;
	}

	public void setQdsf(String qdsf) {
		this.qdsf = qdsf;
	}

	public String getQdxzc() {
		return this.qdxzc;
	}

	public void setQdxzc(String qdxzc) {
		this.qdxzc = qdxzc;
	}

	public String getQdxzdm() {
		return this.qdxzdm;
	}

	public void setQdxzdm(String qdxzdm) {
		this.qdxzdm = qdxzdm;
	}

	public String getQdxzmc() {
		return this.qdxzmc;
	}

	public void setQdxzmc(String qdxzmc) {
		this.qdxzmc = qdxzmc;
	}

	public int getQzlx() {
		return this.qzlx;
	}

	public void setQzlx(int qzlx) {
		this.qzlx = qzlx;
	}

	public int getRemoved() {
		return this.removed;
	}

	public void setRemoved(int removed) {
		this.removed = removed;
	}

	public String getSlbh() {
		return this.slbh;
	}

	public void setSlbh(String slbh) {
		this.slbh = slbh;
	}

	public Timestamp getStDate() {
		return this.stDate;
	}

	public void setStDate(Timestamp stDate) {
		this.stDate = stDate;
	}

	public String getSyyy() {
		return this.syyy;
	}

	public void setSyyy(String syyy) {
		this.syyy = syyy;
	}

	public Timestamp getUpdDate() {
		return this.updDate;
	}

	public void setUpdDate(Timestamp updDate) {
		this.updDate = updDate;
	}

	public String getUpdId() {
		return this.updId;
	}

	public void setUpdId(String updId) {
		this.updId = updId;
	}

	public Timestamp getXkzmyxjz() {
		return this.xkzmyxjz;
	}

	public void setXkzmyxjz(Timestamp xkzmyxjz) {
		this.xkzmyxjz = xkzmyxjz;
	}

	public Timestamp getXkzmyxqs() {
		return this.xkzmyxqs;
	}

	public void setXkzmyxqs(Timestamp xkzmyxqs) {
		this.xkzmyxqs = xkzmyxqs;
	}

	public String getYdxzc() {
		return this.ydxzc;
	}

	public void setYdxzc(String ydxzc) {
		this.ydxzc = ydxzc;
	}

	public String getYdxzdm() {
		return this.ydxzdm;
	}

	public void setYdxzdm(String ydxzdm) {
		this.ydxzdm = ydxzdm;
	}

	public String getYdxzmc() {
		return this.ydxzmc;
	}

	public void setYdxzmc(String ydxzmc) {
		this.ydxzmc = ydxzmc;
	}

	public String getYgjgmc() {
		return this.ygjgmc;
	}

	public void setYgjgmc(String ygjgmc) {
		this.ygjgmc = ygjgmc;
	}

	public BigInteger getYhid() {
		return this.yhid;
	}

	public void setYhid(BigInteger yhid) {
		this.yhid = yhid;
	}

	public String getZdds() {
		return this.zdds;
	}

	public void setZdds(String zdds) {
		this.zdds = zdds;
	}

	public String getZdsf() {
		return this.zdsf;
	}

	public void setZdsf(String zdsf) {
		this.zdsf = zdsf;
	}

}