package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 记工工时修改记录表
 *
 */
@TableName(value = "gxb_user_work_modify_record")
public class GxbUserWorkModifyRecord implements Serializable {

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

	/** 修改人 */
	private Integer modifyer;

	/** 记工负责人ID */
	private Integer recorder;

	/** 工人ID */
	private Integer worker;

	/** 原工作时间 */
	private Double oldworktime;

	/** 基础单价 */
	private Integer oldprice;

	/** 工作时间 */
	private Double newworktime;

	/** 修改金额 */
	private Double newprice;

	/** 记工日期 */
	private Date recorddate;

	/** 修改原因 */
	private String reason;

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

	/** 修改记录ID */
	private String recordid;

	/** 工人姓名 */
	private String workername;

	/** 实际修改金额 */
	private Double modifyprice;

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

	public Integer getModifyer() {
		return this.modifyer;
	}

	public void setModifyer(Integer modifyer) {
		this.modifyer = modifyer;
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

	public Double getOldworktime() {
		return this.oldworktime;
	}

	public void setOldworktime(Double oldworktime) {
		this.oldworktime = oldworktime;
	}

	public Integer getOldprice() {
		return this.oldprice;
	}

	public void setOldprice(Integer oldprice) {
		this.oldprice = oldprice;
	}

	public Double getNewworktime() {
		return this.newworktime;
	}

	public void setNewworktime(Double newworktime) {
		this.newworktime = newworktime;
	}

	public Double getNewprice() {
		return this.newprice;
	}

	public void setNewprice(Double newprice) {
		this.newprice = newprice;
	}

	public Date getRecorddate() {
		return this.recorddate;
	}

	public void setRecorddate(Date recorddate) {
		this.recorddate = recorddate;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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

	public String getRecordid() {
		return this.recordid;
	}

	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}

	public String getWorkername() {
		return this.workername;
	}

	public void setWorkername(String workername) {
		this.workername = workername;
	}

	public Double getModifyprice() {
		return this.modifyprice;
	}

	public void setModifyprice(Double modifyprice) {
		this.modifyprice = modifyprice;
	}

}
