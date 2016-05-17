package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 企业用户表
 *
 */
@TableName(value = "gxb_company")
public class GxbCompany implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** ID */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 企业编码 */
	private String companycode;

	/** 企业名称 */
	private String companyname;

	/** 企业头像 */
	private String headimg;

	/** 法人代表 */
	private String corporation;

	/** 法人代表联系手机 */
	private String corphone;

	/** 企业联系人 */
	private String linkman;

	/** 企业联系人手机号 */
	private String linkmanphone;

	/** 省份 */
	private String proviceid;

	/** 城市 */
	private String cityid;

	/** 地区 */
	private String areaid;

	/** 企业详细地址 */
	private String address;

	/** 营业执照注册号 */
	private String businesslicensenum;

	/** 营业执照扫描附件 */
	private String businesslicensescan;

	/** 状态(1:正常 0:锁定) */
	private String status;

	/** 快捷通登录账户 */
	private String kjtaccountid;

	/** 快捷通商户号 */
	private String kjtpartnerid;

	/** 工资发放通道:0银联 1快捷通 */
	private String paytype;

	/** 创建者 */
	@TableField(value = "create_by")
	private String createBy;

	/** 创建时间 */
	@TableField(value = "create_date")
	private Date createDate;

	/** 更新者 */
	@TableField(value = "update_by")
	private String updateBy;

	/** 更新时间 */
	@TableField(value = "update_date")
	private Date updateDate;

	/** 备注 */
	private String remarks;

	/** 状态（0：正常，1：已删除） */
	@TableField(value = "del_flag")
	private String delFlag;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanycode() {
		return this.companycode;
	}

	public void setCompanycode(String companycode) {
		this.companycode = companycode;
	}

	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getHeadimg() {
		return this.headimg;
	}

	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}

	public String getCorporation() {
		return this.corporation;
	}

	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}

	public String getCorphone() {
		return this.corphone;
	}

	public void setCorphone(String corphone) {
		this.corphone = corphone;
	}

	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public String getLinkmanphone() {
		return this.linkmanphone;
	}

	public void setLinkmanphone(String linkmanphone) {
		this.linkmanphone = linkmanphone;
	}

	public String getProviceid() {
		return this.proviceid;
	}

	public void setProviceid(String proviceid) {
		this.proviceid = proviceid;
	}

	public String getCityid() {
		return this.cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	public String getAreaid() {
		return this.areaid;
	}

	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusinesslicensenum() {
		return this.businesslicensenum;
	}

	public void setBusinesslicensenum(String businesslicensenum) {
		this.businesslicensenum = businesslicensenum;
	}

	public String getBusinesslicensescan() {
		return this.businesslicensescan;
	}

	public void setBusinesslicensescan(String businesslicensescan) {
		this.businesslicensescan = businesslicensescan;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getKjtaccountid() {
		return this.kjtaccountid;
	}

	public void setKjtaccountid(String kjtaccountid) {
		this.kjtaccountid = kjtaccountid;
	}

	public String getKjtpartnerid() {
		return this.kjtpartnerid;
	}

	public void setKjtpartnerid(String kjtpartnerid) {
		this.kjtpartnerid = kjtpartnerid;
	}

	public String getPaytype() {
		return this.paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

}
