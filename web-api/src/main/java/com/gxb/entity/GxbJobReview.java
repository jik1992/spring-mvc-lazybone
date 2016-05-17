package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 工信保工作信息审核状态表
 *
 */
@TableName(value = "gxb_job_review")
public class GxbJobReview implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** ID */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 工作ID */
	private String jobid;

	/** 是否审核通过 */
	private String isreview;

	/** 审核人员ID */
	private String checkerid;

	/** 创建时间 */
	@TableField(value = "create_date")
	private Date createDate;

	/** 修改时间 */
	@TableField(value = "update_date")
	private Date updateDate;

	/** 备注信息 */
	private String remarks;

	/** 删除标识 */
	@TableField(value = "del_flag")
	private String delFlag;

	/**  */
	private String isrecommend;

	/** 推荐时间 */
	@TableField(value = "recommend_date")
	private Date recommendDate;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJobid() {
		return this.jobid;
	}

	public void setJobid(String jobid) {
		this.jobid = jobid;
	}

	public String getIsreview() {
		return this.isreview;
	}

	public void setIsreview(String isreview) {
		this.isreview = isreview;
	}

	public String getCheckerid() {
		return this.checkerid;
	}

	public void setCheckerid(String checkerid) {
		this.checkerid = checkerid;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
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

	public String getIsrecommend() {
		return this.isrecommend;
	}

	public void setIsrecommend(String isrecommend) {
		this.isrecommend = isrecommend;
	}

	public Date getRecommendDate() {
		return this.recommendDate;
	}

	public void setRecommendDate(Date recommendDate) {
		this.recommendDate = recommendDate;
	}

}
