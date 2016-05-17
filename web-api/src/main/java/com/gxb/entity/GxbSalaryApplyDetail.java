package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 
 *
 */
@TableName(value = "gxb_salary_apply_detail")
public class GxbSalaryApplyDetail implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/**  */
	private String applyid;

	/**  */
	private String companyid;

	/**  */
	private String projectid;

	/**  */
	private String projectname;

	/**  */
	private String address;

	/**  */
	private String pmuserid;

	/**  */
	private String pmname;

	/**  */
	private String groupid;

	/**  */
	private String groupname;

	/**  */
	private Integer groupleader;

	/**  */
	private String groupleadername;

	/**  */
	private Integer recorder;

	/**  */
	private String recordername;

	/**  */
	private String worker;

	/**  */
	private String workername;

	/**  */
	private String jobtype;

	/**  */
	private Date applydate;

	/**  */
	private BigDecimal yfamount;

	/**  */
	private BigDecimal applyamount;

	/**  */
	private BigDecimal sfamount;

	/**  */
	private String applytype;

	/**  */
	private String calrule;

	/**  */
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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPmuserid() {
		return this.pmuserid;
	}

	public void setPmuserid(String pmuserid) {
		this.pmuserid = pmuserid;
	}

	public String getPmname() {
		return this.pmname;
	}

	public void setPmname(String pmname) {
		this.pmname = pmname;
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

	public String getWorker() {
		return this.worker;
	}

	public void setWorker(String worker) {
		this.worker = worker;
	}

	public String getWorkername() {
		return this.workername;
	}

	public void setWorkername(String workername) {
		this.workername = workername;
	}

	public String getJobtype() {
		return this.jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public Date getApplydate() {
		return this.applydate;
	}

	public void setApplydate(Date applydate) {
		this.applydate = applydate;
	}

	public BigDecimal getYfamount() {
		return this.yfamount;
	}

	public void setYfamount(BigDecimal yfamount) {
		this.yfamount = yfamount;
	}

	public BigDecimal getApplyamount() {
		return this.applyamount;
	}

	public void setApplyamount(BigDecimal applyamount) {
		this.applyamount = applyamount;
	}

	public BigDecimal getSfamount() {
		return this.sfamount;
	}

	public void setSfamount(BigDecimal sfamount) {
		this.sfamount = sfamount;
	}

	public String getApplytype() {
		return this.applytype;
	}

	public void setApplytype(String applytype) {
		this.applytype = applytype;
	}

	public String getCalrule() {
		return this.calrule;
	}

	public void setCalrule(String calrule) {
		this.calrule = calrule;
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
