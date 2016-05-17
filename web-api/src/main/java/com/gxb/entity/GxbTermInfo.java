package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 队伍信息表
 *
 */
@TableName(value = "gxb_term_info")
public class GxbTermInfo implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 队伍名称 */
	private String termnm;

	/** 手机号 */
	private String mobile;

	/** 工人数量 */
	private Integer worknum;

	/** 工作年限 */
	private Integer workyear;

	/** 业务范围 */
	private String around;

	/** 服务区域 */
	private String addaround;

	/** 发布人ID */
	private String publisher;

	/** 浏览数 */
	private Integer viewcount;

	/** 是否推荐(1:是 2:否) */
	private String ishiring;

	/** 是否公开(1:是 0:否) */
	private String ispublic;

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

	/** (0:非工信保认证,1:工信保认证) */
	private String isauth;

	/** 发布渠道（1：APP端发布，2：后台发布） */
	private String type;

	/** 感兴趣数量 */
	private Integer interestcount;

	/** 举报数量 */
	private Integer reportcount;

	/** 考虑数量 */
	private Integer thinkcount;

	/** 企业ID */
	private String companyid;

	/** 用户ID */
	private String userid;

	/** 是否公开(1:是 0:否) */
	private String isweixin;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTermnm() {
		return this.termnm;
	}

	public void setTermnm(String termnm) {
		this.termnm = termnm;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Integer getWorknum() {
		return this.worknum;
	}

	public void setWorknum(Integer worknum) {
		this.worknum = worknum;
	}

	public Integer getWorkyear() {
		return this.workyear;
	}

	public void setWorkyear(Integer workyear) {
		this.workyear = workyear;
	}

	public String getAround() {
		return this.around;
	}

	public void setAround(String around) {
		this.around = around;
	}

	public String getAddaround() {
		return this.addaround;
	}

	public void setAddaround(String addaround) {
		this.addaround = addaround;
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

	public String getIshiring() {
		return this.ishiring;
	}

	public void setIshiring(String ishiring) {
		this.ishiring = ishiring;
	}

	public String getIspublic() {
		return this.ispublic;
	}

	public void setIspublic(String ispublic) {
		this.ispublic = ispublic;
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

	public Integer getReportcount() {
		return this.reportcount;
	}

	public void setReportcount(Integer reportcount) {
		this.reportcount = reportcount;
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

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getIsweixin() {
		return this.isweixin;
	}

	public void setIsweixin(String isweixin) {
		this.isweixin = isweixin;
	}

}
