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
@TableName(value = "gxb_kjt_notify")
public class GxbKjtNotify implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** id */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 快捷通异步通知id */
	private String notifyid;

	/** 通知类型 */
	private String notifytype;

	/** 字符集 */
	private String inputcharset;

	/** 签名 */
	private String sign;

	/** 签名类型 */
	private String signtype;

	/** 版本号 */
	private String version;

	/** 工信保订单号 */
	private String outertradeno;

	/** 快捷通订单号 */
	private String innertradeno;

	/** 转账金额 */
	private String withdrawalamount;

	/** 转账状态 */
	private String withdrawalstatus;

	/** 失败原因 */
	private String failreason;

	/** 转账时间 */
	private String gmtwithdrawal;

	/**  */
	@TableField(value = "create_date")
	private Date createDate;

	/**  */
	@TableField(value = "update_date")
	private Date updateDate;

	/**  */
	@TableField(value = "del_flag")
	private String delFlag;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNotifyid() {
		return this.notifyid;
	}

	public void setNotifyid(String notifyid) {
		this.notifyid = notifyid;
	}

	public String getNotifytype() {
		return this.notifytype;
	}

	public void setNotifytype(String notifytype) {
		this.notifytype = notifytype;
	}

	public String getInputcharset() {
		return this.inputcharset;
	}

	public void setInputcharset(String inputcharset) {
		this.inputcharset = inputcharset;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getSigntype() {
		return this.signtype;
	}

	public void setSigntype(String signtype) {
		this.signtype = signtype;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getOutertradeno() {
		return this.outertradeno;
	}

	public void setOutertradeno(String outertradeno) {
		this.outertradeno = outertradeno;
	}

	public String getInnertradeno() {
		return this.innertradeno;
	}

	public void setInnertradeno(String innertradeno) {
		this.innertradeno = innertradeno;
	}

	public String getWithdrawalamount() {
		return this.withdrawalamount;
	}

	public void setWithdrawalamount(String withdrawalamount) {
		this.withdrawalamount = withdrawalamount;
	}

	public String getWithdrawalstatus() {
		return this.withdrawalstatus;
	}

	public void setWithdrawalstatus(String withdrawalstatus) {
		this.withdrawalstatus = withdrawalstatus;
	}

	public String getFailreason() {
		return this.failreason;
	}

	public void setFailreason(String failreason) {
		this.failreason = failreason;
	}

	public String getGmtwithdrawal() {
		return this.gmtwithdrawal;
	}

	public void setGmtwithdrawal(String gmtwithdrawal) {
		this.gmtwithdrawal = gmtwithdrawal;
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

}
