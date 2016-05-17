package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 工作信息表
 *
 */
@TableName(value = "gxb_job_info")
public class GxbJobInfo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 标题 */
	private String title;

	/** 工种类型 */
	private String jobtype;

	/** 有无带班经验(0:无 1:有) */
	private String hasexperies;

	/** 招聘数量 */
	private Integer hiring;

	/** 年龄范围 */
	private String agetype;

	/** 计价方式(1:点工 2:包工) */
	private String calculateway;

	/** 待遇类型(1:面议 2:自定义) */
	private String treatmenttype;

	/** 待遇 */
	private Integer treatment;

	/** 福利 */
	private String welfare;

	/** 省份ID */
	private String proviceid;

	/** 城市ID */
	private String cityid;

	/** 区域ID */
	private String areaid;

	/** 经度坐标 */
	private String positionx;

	/** 纬度坐标 */
	private String positiony;

	/** 工作地点 */
	private String address;

	/** 手机号 */
	private String mobile;

	/** 发布人ID */
	private String publisher;

	/** 浏览数 */
	private Integer viewcount;

	/** 应用code */
	private String appcode;

	/** 应用版本 */
	private String appversion;

	/** 设备型号 */
	private String devicetype;

	/** 设备模型 */
	private String devicemodel;

	/** 手机型号 */
	private String sys;

	/** 系统版本 */
	private String sysversion;

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

	/** 删除标记（0：发布中，1：已删除，2：禁用） */
	@TableField(value = "del_flag")
	private String delFlag;

	/** 是否急招(1:是 0:否) */
	private String ishiring;

	/** 工作时间 */
	private String worktime;

	/** 优先录取条件 */
	private String priority;

	/** 工作经验 */
	private String workexper;

	/** (0:非工信保认证,1:工信保认证) */
	private String isauth;

	/** 发布渠道（1：APP端发布，2：后台发布） */
	private String type;

	/** 感兴趣数量 */
	private Integer interestcount;

	/** 考虑数量 */
	private Integer thinkcount;

	/** 企业ID */
	private String companyid;

	/**  */
	private String ispushwechat;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getJobtype() {
		return this.jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public String getHasexperies() {
		return this.hasexperies;
	}

	public void setHasexperies(String hasexperies) {
		this.hasexperies = hasexperies;
	}

	public Integer getHiring() {
		return this.hiring;
	}

	public void setHiring(Integer hiring) {
		this.hiring = hiring;
	}

	public String getAgetype() {
		return this.agetype;
	}

	public void setAgetype(String agetype) {
		this.agetype = agetype;
	}

	public String getCalculateway() {
		return this.calculateway;
	}

	public void setCalculateway(String calculateway) {
		this.calculateway = calculateway;
	}

	public String getTreatmenttype() {
		return this.treatmenttype;
	}

	public void setTreatmenttype(String treatmenttype) {
		this.treatmenttype = treatmenttype;
	}

	public Integer getTreatment() {
		return this.treatment;
	}

	public void setTreatment(Integer treatment) {
		this.treatment = treatment;
	}

	public String getWelfare() {
		return this.welfare;
	}

	public void setWelfare(String welfare) {
		this.welfare = welfare;
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

	public String getPositionx() {
		return this.positionx;
	}

	public void setPositionx(String positionx) {
		this.positionx = positionx;
	}

	public String getPositiony() {
		return this.positiony;
	}

	public void setPositiony(String positiony) {
		this.positiony = positiony;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getViewcount() {
		return this.viewcount;
	}

	public void setViewcount(Integer viewcount) {
		this.viewcount = viewcount;
	}

	public String getAppcode() {
		return this.appcode;
	}

	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}

	public String getAppversion() {
		return this.appversion;
	}

	public void setAppversion(String appversion) {
		this.appversion = appversion;
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

	public String getSys() {
		return this.sys;
	}

	public void setSys(String sys) {
		this.sys = sys;
	}

	public String getSysversion() {
		return this.sysversion;
	}

	public void setSysversion(String sysversion) {
		this.sysversion = sysversion;
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

	public String getIshiring() {
		return this.ishiring;
	}

	public void setIshiring(String ishiring) {
		this.ishiring = ishiring;
	}

	public String getWorktime() {
		return this.worktime;
	}

	public void setWorktime(String worktime) {
		this.worktime = worktime;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getWorkexper() {
		return this.workexper;
	}

	public void setWorkexper(String workexper) {
		this.workexper = workexper;
	}

	public String getIsauth() {
		return this.isauth;
	}

	public void setIsauth(String isauth) {
		this.isauth = isauth;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getInterestcount() {
		return this.interestcount;
	}

	public void setInterestcount(Integer interestcount) {
		this.interestcount = interestcount;
	}

	public Integer getThinkcount() {
		return this.thinkcount;
	}

	public void setThinkcount(Integer thinkcount) {
		this.thinkcount = thinkcount;
	}

	public String getCompanyid() {
		return this.companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getIspushwechat() {
		return this.ispushwechat;
	}

	public void setIspushwechat(String ispushwechat) {
		this.ispushwechat = ispushwechat;
	}

}
