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
@TableName(value = "gxb_event")
public class GxbEvent implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** id */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 1 页面加载;2 点击注册按键; 3 注册成功; 4 点击下载按钮 */
	private String eventtype;

	/** 事件时间 */
	private Date eventtime;

	/** 事件来源1:app 2:web 3:h5 */
	private String eventfrom;

	/** 设备类型 */
	private String devicetype;

	/** 系统版本 */
	private String sysversion;

	/** 设备型号 */
	private String model;

	/** 浏览器 */
	private String browser;

	/** 浏览器版本 */
	private String browserversion;

	/** 邀请码 */
	private String reconum;

	/** 扩展字段 */
	private String extension;

	/** 备注 */
	private String remark;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventtype() {
		return this.eventtype;
	}

	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}

	public Date getEventtime() {
		return this.eventtime;
	}

	public void setEventtime(Date eventtime) {
		this.eventtime = eventtime;
	}

	public String getEventfrom() {
		return this.eventfrom;
	}

	public void setEventfrom(String eventfrom) {
		this.eventfrom = eventfrom;
	}

	public String getDevicetype() {
		return this.devicetype;
	}

	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}

	public String getSysversion() {
		return this.sysversion;
	}

	public void setSysversion(String sysversion) {
		this.sysversion = sysversion;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrowser() {
		return this.browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getBrowserversion() {
		return this.browserversion;
	}

	public void setBrowserversion(String browserversion) {
		this.browserversion = browserversion;
	}

	public String getReconum() {
		return this.reconum;
	}

	public void setReconum(String reconum) {
		this.reconum = reconum;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}
