package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 用户班组关联表
 *
 */
@TableName(value = "gxb_group_user")
public class GxbGroupUser implements Serializable {

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

	/** 班组ID */
	private String groupid;

	/** 工人ID */
	private Integer worker;

	/** 工人姓名 */
	private String workername;

	/** 工种 */
	private String jobtype;

	/** 进入班组时间 */
	private Date startdate;

	/** 离开班组时间 */
	private Date enddate;

	/** 岗位状态(1:在岗 2:离职 0:导入待岗) */
	private String status;

	/** 单价(元) */
	private Integer price;

	/** 操作类型 */
	private String oprtype;

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

	/** 工人手机号 */
	private String workermobile;

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

	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
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

	public String getJobtype() {
		return this.jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getOprtype() {
		return this.oprtype;
	}

	public void setOprtype(String oprtype) {
		this.oprtype = oprtype;
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

	public String getWorkermobile() {
		return this.workermobile;
	}

	public void setWorkermobile(String workermobile) {
		this.workermobile = workermobile;
	}

}
