package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 
 *
 */
@TableName(value = "app_bind")
public class AppBind implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** id */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 开放平台 :1 QQ 2微信 3新浪 */
	private String openplat;

	/** 开放平台唯一标识 */
	@TableId(type = IdType.AUTO)
	private String openid;

	/** 用户id */
	@TableId(type = IdType.AUTO)
	private String userid;

	/** 授权令牌 */
	@TableField(value = "access_token")
	private String accessToken;

	/** 有效期 */
	private String expiresin;

	/** 在授权自动续期步骤中，获取新的access_token时需要提供的参数 */
	@TableField(value = "refresh_token")
	private String refreshToken;

	/** 创建时间 */
	@TableField(value = "create_date")
	private Date createDate;

	/** 更新时间 */
	@TableField(value = "update_date")
	private Date updateDate;

	/** 删除标志 0 删除 1生效 */
	@TableField(value = "del_flag")
	private String delFlag;

	/** 备注 */
	private String remark;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOpenplat() {
		return this.openplat;
	}

	public void setOpenplat(String openplat) {
		this.openplat = openplat;
	}

	public String getOpenid() {
		return this.openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getExpiresin() {
		return this.expiresin;
	}

	public void setExpiresin(String expiresin) {
		this.expiresin = expiresin;
	}

	public String getRefreshToken() {
		return this.refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
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

	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
