package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 工程班组表
 *
 */
@TableName(value = "gxb_project_group")
public class GxbProjectGroup implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 企业用户ID */
	private String companyid;

	/** 项目ID */
	private String projectid;

	/** 花名册ID */
	private String rosterid;

	/** 班组名称 */
	private String groupname;

	/** 班组长ID */
	private Integer groupleader;

	/** 班组长姓名 */
	private String groupleadername;

	/** 班组长身份证号码 */
	private String groupleaderidno;

	/** 记工负责人ID */
	private Integer recorder;

	/** 记工负责人姓名 */
	private String recordername;

	/** 记工负责人身份证号码 */
	private String recorderidno;

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

	/** 记工负责人手机号 */
	private String recordermobile;

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

	public String getRosterid() {
		return this.rosterid;
	}

	public void setRosterid(String rosterid) {
		this.rosterid = rosterid;
	}

	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public Integer getGroupleader() {
		return this.groupleader;
	}

	public void setGroupleader(Integer groupleader) {
		this.groupleader = groupleader;
	}

	public String getGroupleadername() {
		return this.groupleadername;
	}

	public void setGroupleadername(String groupleadername) {
		this.groupleadername = groupleadername;
	}

	public String getGroupleaderidno() {
		return this.groupleaderidno;
	}

	public void setGroupleaderidno(String groupleaderidno) {
		this.groupleaderidno = groupleaderidno;
	}

	public Integer getRecorder() {
		return this.recorder;
	}

	public void setRecorder(Integer recorder) {
		this.recorder = recorder;
	}

	public String getRecordername() {
		return this.recordername;
	}

	public void setRecordername(String recordername) {
		this.recordername = recordername;
	}

	public String getRecorderidno() {
		return this.recorderidno;
	}

	public void setRecorderidno(String recorderidno) {
		this.recorderidno = recorderidno;
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

	public String getRecordermobile() {
		return this.recordermobile;
	}

	public void setRecordermobile(String recordermobile) {
		this.recordermobile = recordermobile;
	}

}
