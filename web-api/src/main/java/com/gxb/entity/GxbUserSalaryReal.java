package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 实际工资发放表
 *
 */
@TableName(value = "gxb_user_salary_real")
public class GxbUserSalaryReal implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/**  */
	private String applyid;

	/** 企业用户ID */
	private String companyid;

	/** 项目ID */
	private String projectid;

	/**  */
	private String projectname;

	/** 班组ID */
	private String groupid;

	/**  */
	private String groupname;

	/**  */
	private Integer pmuserid;

	/**  */
	private String pmname;

	/**  */
	private Integer groupleader;

	/**  */
	private String groupleadername;

	/** 记工负责人ID */
	private Integer recorder;

	/**  */
	private String recordername;

	/** 发放日期 */
	private Date paydate;

	/** 发放工资月份 */
	private String salarymonth;

	/** 发放金额 */
	private Double salary;

	/** 付款方 */
	private String payer;

	/** 付款方卡号 */
	private String payercard;

	/** 收款方 */
	private String receiver;

	/** 收支类型(1:理财) */
	private String paytype;

	/** 备注 */
	private String remark;

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

	/** 收款状态(0:交易中 1:已完成 2:失败) */
	private String status;

	/** 批次号 */
	private String batchno;

	/** 是否对账 */
	private String isrec;

	/** 申请金额 */
	private Double applysalary;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplyid() {
		return this.applyid;
	}

	public void setApplyid(String applyid) {
		this.applyid = applyid;
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

	public String getProjectname() {
		return this.projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public Integer getPmuserid() {
		return this.pmuserid;
	}

	public void setPmuserid(Integer pmuserid) {
		this.pmuserid = pmuserid;
	}

	public String getPmname() {
		return this.pmname;
	}

	public void setPmname(String pmname) {
		this.pmname = pmname;
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

	public Date getPaydate() {
		return this.paydate;
	}

	public void setPaydate(Date paydate) {
		this.paydate = paydate;
	}

	public String getSalarymonth() {
		return this.salarymonth;
	}

	public void setSalarymonth(String salarymonth) {
		this.salarymonth = salarymonth;
	}

	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getPayer() {
		return this.payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getPayercard() {
		return this.payercard;
	}

	public void setPayercard(String payercard) {
		this.payercard = payercard;
	}

	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getPaytype() {
		return this.paytype;
	}

	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBatchno() {
		return this.batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	public String getIsrec() {
		return this.isrec;
	}

	public void setIsrec(String isrec) {
		this.isrec = isrec;
	}

	public Double getApplysalary() {
		return this.applysalary;
	}

	public void setApplysalary(Double applysalary) {
		this.applysalary = applysalary;
	}

}
