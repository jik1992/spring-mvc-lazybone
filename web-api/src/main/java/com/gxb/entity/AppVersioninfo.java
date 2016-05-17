package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * APP版本信息表
 *
 */
@TableName(value = "app_versioninfo")
public class AppVersioninfo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** ID */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 版本号 */
	private String vcode;

	/** 版本名称 */
	private String vname;

	/** 安装包名称 */
	private String apkname;

	/** 适用平台（android和ios） */
	private String devicetype;

	/** 设备模型（phone和pad） */
	private String devicemodel;

	/** 下载地址 */
	private String updateurl;

	/** 是否最新版（0：否；1：是） */
	private String latestversion;

	/** 是否强制更新(0:否，1:是) */
	private String isqzgx;

	/** 描述 */
	private String descr;

	/** 状态 */
	private String status;

	/** 排序 */
	private String sort;

	/** 安装包url */
	private String apkurl;

	/** 安装包位置 */
	private String apksite;

	/** 类型（1：班组端，2：工人端） */
	private String type;

	/** 下载类型（1：URL下载，2：安装包下载） */
	private String downloadtype;

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

	public String getVcode() {
		return this.vcode;
	}

	public void setVcode(String vcode) {
		this.vcode = vcode;
	}

	public String getVname() {
		return this.vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getApkname() {
		return this.apkname;
	}

	public void setApkname(String apkname) {
		this.apkname = apkname;
	}

	public String getDevicetype() {
		return this.devicetype;
	}

	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}

	public String getDevicemodel() {
		return this.devicemodel;
	}

	public void setDevicemodel(String devicemodel) {
		this.devicemodel = devicemodel;
	}

	public String getUpdateurl() {
		return this.updateurl;
	}

	public void setUpdateurl(String updateurl) {
		this.updateurl = updateurl;
	}

	public String getLatestversion() {
		return this.latestversion;
	}

	public void setLatestversion(String latestversion) {
		this.latestversion = latestversion;
	}

	public String getIsqzgx() {
		return this.isqzgx;
	}

	public void setIsqzgx(String isqzgx) {
		this.isqzgx = isqzgx;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSort() {
		return this.sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getApkurl() {
		return this.apkurl;
	}

	public void setApkurl(String apkurl) {
		this.apkurl = apkurl;
	}

	public String getApksite() {
		return this.apksite;
	}

	public void setApksite(String apksite) {
		this.apksite = apksite;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDownloadtype() {
		return this.downloadtype;
	}

	public void setDownloadtype(String downloadtype) {
		this.downloadtype = downloadtype;
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
