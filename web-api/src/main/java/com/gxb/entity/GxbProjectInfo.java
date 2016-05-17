package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 工程信息表
 *
 */
@TableName(value = "gxb_project_info")
public class GxbProjectInfo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 企业ID */
	private String companyid;

	/** 企业部门id */
	private String officeid;

	/** 工程名称 */
	private String name;

	/** 项目经理 */
	private String pmname;

	/** 项目经理联系方式 */
	private String pmmobile;

	/** 项目经理身份证 */
	private String pmidcard;

	/** 项目经理ID */
	private Integer pmid;

	/** 省份ID */
	private String proviceid;

	/** 城市ID */
	private String cityid;

	/** 地区ID */
	private String areaid;

	/** 工程地址 */
	private String address;

	/**  */
	private String lng;

	/**  */
	private String lat;

	/** 图标 */
	private String icon;

	/** 工资结算日 */
	private String settledate;

	/** 工程开始时间 */
	private Date startdate;

	/** 工程结束时间 */
	private Date enddate;

	/**  */
	private String isfocuson;

	/** 工程状态(0:未开工 1:已开工 2:已竣工) */
	private String status;

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

	/** 备注信息 */
	private String remarks;

	/** 删除标记 */
	@TableField(value = "del_flag")
	private String delFlag;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyid() {
		return this.companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getOfficeid() {
		return this.officeid;
	}

	public void setOfficeid(String officeid) {
		this.officeid = officeid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPmname() {
		return this.pmname;
	}

	public void setPmname(String pmname) {
		this.pmname = pmname;
	}

	public String getPmmobile() {
		return this.pmmobile;
	}

	public void setPmmobile(String pmmobile) {
		this.pmmobile = pmmobile;
	}

	public String getPmidcard() {
		return this.pmidcard;
	}

	public void setPmidcard(String pmidcard) {
		this.pmidcard = pmidcard;
	}

	public Integer getPmid() {
		return this.pmid;
	}

	public void setPmid(Integer pmid) {
		this.pmid = pmid;
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

	public String getLng() {
		return this.lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

	public String getLat() {
		return this.lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getSettledate() {
		return this.settledate;
	}

	public void setSettledate(String settledate) {
		this.settledate = settledate;
	}

	public Date getStartdate() {
		return this.startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return this.enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public String getIsfocuson() {
		return this.isfocuson;
	}

	public void setIsfocuson(String isfocuson) {
		this.isfocuson = isfocuson;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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
