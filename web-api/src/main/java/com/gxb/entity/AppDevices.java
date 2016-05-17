package com.gxb.entity;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 *
 *
 *
 */
@TableName(value = "app_devices")
public class AppDevices implements Serializable {

  @TableField(exist = false)
  private static final long serialVersionUID = 1L;

  /**  */
  @TableId(type = IdType.AUTO)
  private String identifier;

  /**
   * 设备类型
   */
  private String devicetype;

  /**
   * 设备型号
   */
  private String devicemodel;

  /**
   * 系统
   */
  private String sys;

  /**
   * 系统版本
   */
  private String sysversion;

  /**  */
  private String firstuse;

  /**  */
  private String latestuse;

  /**  */
  private Integer usetimes;

  /**  */
  private String isenable;

  /**  */
  private String remark;

  public String getidentifier() {
    return this.identifier;
  }

  public void setidentifier(String identifier) {
    this.identifier = identifier;
  }

  public String getDevicetype() {
    return this.devicetype;
  }

  public void setDevicetype(String devicetype) {
    this.devicetype = devicetype;
  }

  public String getDevicemodel() {
    return this.devicemodel;
  }

  public void setDevicemodel(String devicemodel) {
    this.devicemodel = devicemodel;
  }

  public String getSys() {
    return this.sys;
  }

  public void setSys(String sys) {
    this.sys = sys;
  }

  public String getSysversion() {
    return this.sysversion;
  }

  public void setSysversion(String sysversion) {
    this.sysversion = sysversion;
  }

  public String getFirstuse() {
    return this.firstuse;
  }

  public void setFirstuse(String firstuse) {
    this.firstuse = firstuse;
  }

  public String getLatestuse() {
    return this.latestuse;
  }

  public void setLatestuse(String latestuse) {
    this.latestuse = latestuse;
  }

  public Integer getUsetimes() {
    return this.usetimes;
  }

  public void setUsetimes(Integer usetimes) {
    this.usetimes = usetimes;
  }

  public String getIsenable() {
    return this.isenable;
  }

  public void setIsenable(String isenable) {
    this.isenable = isenable;
  }

  public String getRemark() {
    return this.remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
