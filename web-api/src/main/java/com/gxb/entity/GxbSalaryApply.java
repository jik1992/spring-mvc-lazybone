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
 * 申请表
 *
 */
@TableName(value = "gxb_salary_apply")
public class GxbSalaryApply implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 主键 */
	@TableId(type = IdType.AUTO)
	private String id;

	/**  */
	private String applyno;

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
	private Date applydate;

	/**  */
	private Integer applynum;

	/**  */
	private String applytype;

	/**  */
	private String calrule;

	/**  */
	private BigDecimal amount;

	/**  */
	private BigDecimal totalamount;

	/**  */
	private String applyuserid;

	/** 是否已确认(1:已确认 0:未确认) */
	private String status;

	/** 是否excel导入申请：0否 1是 */
	private String isexcelapply;

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

	public String getApplyno() {
		return this.applyno;
	}

	public void setApplyno(String applyno) {
		this.applyno = applyno;
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

	public Date getApplydate() {
		return this.applydate;
	}

	public void setApplydate(Date applydate) {
		this.applydate = applydate;
	}

	public Integer getApplynum() {
		return this.applynum;
	}

	public void setApplynum(Integer applynum) {
		this.applynum = applynum;
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

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getTotalamount() {
		return this.totalamount;
	}

	public void setTotalamount(BigDecimal totalamount) {
		this.totalamount = totalamount;
	}

	public String getApplyuserid() {
		return this.applyuserid;
	}

	public void setApplyuserid(String applyuserid) {
		this.applyuserid = applyuserid;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getIsexcelapply() {
		return this.isexcelapply;
	}

	public void setIsexcelapply(String isexcelapply) {
		this.isexcelapply = isexcelapply;
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
