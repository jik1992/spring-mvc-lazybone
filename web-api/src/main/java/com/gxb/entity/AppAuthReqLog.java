package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 实名认证请求记录表
 *
 */
@TableName(value = "app_auth_req_log")
public class AppAuthReqLog implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 请求参数 */
	private String reqdata;

	/** 返回参数 */
	private String responsedata;

	/** 类型(01:登录 02:姓名认证 03:银行卡认证) */
	private String reqtype;

	/** 备注 */
	private String remarks;

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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReqdata() {
		return this.reqdata;
	}

	public void setReqdata(String reqdata) {
		this.reqdata = reqdata;
	}

	public String getResponsedata() {
		return this.responsedata;
	}

	public void setResponsedata(String responsedata) {
		this.responsedata = responsedata;
	}

	public String getReqtype() {
		return this.reqtype;
	}

	public void setReqtype(String reqtype) {
		this.reqtype = reqtype;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

}
