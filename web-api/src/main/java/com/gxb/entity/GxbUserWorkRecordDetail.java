package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 记工记录明细表
 *
 */
@TableName(value = "gxb_user_work_record_detail")
public class GxbUserWorkRecordDetail implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 企业用户ID */
	private String companyid;

	/** 项目ID */
	private String projectid;

	/** 班组ID */
	private String groupid;

	/** 记工负责人ID */
	private Integer recorder;

	/** 工人ID */
	private Integer worker;

	/** 姓名 */
	private String workername;

	/** 记工开始时间 */
	private Date starttime;

	/** 记工结束时间 */
	private Date endtime;

	/** 记工日期 */
	private Date recorddate;

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

	/** 是否提醒(0:未提醒 1:已提醒) */
	private String remindstatus;

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

	public String getProjectid() {
		return this.projectid;
	}

	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}

	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public Integer getRecorder() {
		return this.recorder;
	}

	public void setRecorder(Integer recorder) {
		this.recorder = recorder;
	}

	public Integer getWorker() {
		return this.worker;
	}

	public void setWorker(Integer worker) {
		this.worker = worker;
	}

	public String getWorkername() {
		return this.workername;
	}

	public void setWorkername(String workername) {
		this.workername = workername;
	}

	public Date getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return this.endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public Date getRecorddate() {
		return this.recorddate;
	}

	public void setRecorddate(Date recorddate) {
		this.recorddate = recorddate;
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

	public String getRemindstatus() {
		return this.remindstatus;
	}

	public void setRemindstatus(String remindstatus) {
		this.remindstatus = remindstatus;
	}

}
