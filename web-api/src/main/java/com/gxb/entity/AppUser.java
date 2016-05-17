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
@TableName(value = "app_user")
public class AppUser implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/**  */
	private Integer userid;

	/** 用户类型(1:工人 2:记工 4:班组长 5:项目经理) */
	private String usertype;

	/** 登录密码 */
	private String password;

	/** 登录账号 */
	private String username;

	/** 昵称 */
	private String nickname;

	/** 姓名 */
	private String realname;

	/** 工种 */
	private String jobtype;

	/** 求职状态 */
	private String jobstatus;

	/** 工作经验 */
	private String workexper;

	/** 年龄 */
	private Integer age;

	/** 第三方账号 */
	private String thirdid;

	/** 头像 */
	private String headimg;

	/** 性别 */
	private String gender;

	/** 出生日期 */
	private String birthday;

	/** 邮箱 */
	private String email;

	/** 手机号 */
	private String mobile;

	/** 电话 */
	private String phone;

	/** 微博 */
	private String weibo;

	/** 省份 */
	private String proviceid;

	/** 城市 */
	private String cityid;

	/** 地区 */
	private String areaid;

	/** 推荐码 */
	private String reconum;

	/** 积分数 */
	private Integer jfcount;

	/** 公司名称 */
	private String companyname;

	/** 地址 */
	private String address;

	/** 状态(1:正常 0:锁定) */
	private String status;

	/** 注册日期 */
	private Date regdate;

	/** 用户来源（1：APP,2：WEB） */
	private String comefrom;

	/** 等级 */
	private String level;

	/** 最近登录时间 */
	private Date latestlogin;

	/** 身份证 */
	private String identitycard;

	/** 设备编号 */
	private String deviceidentifier;

	/** 所属APP */
	private String appcode;

	/**  */
	private String appversion;

	/** 设备型号 */
	private String devicetype;

	/** 设备模型 */
	private String devicemodel;

	/** 手机型号 */
	private String sys;

	/** 系统版本 */
	private String sysversion;

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

	/** 描述 */
	private String remarks;

	/**  */
	@TableField(value = "del_flag")
	private String delFlag;

	/** 用户等级 */
	private String userlevel;

	/** 是否实名认证 */
	private String iscertification;

	/** 认证日期 */
	private Date certifidate;

	/** 登录密码0未设置 1已设置 */
	private String ispwd;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getJobtype() {
		return this.jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public String getJobstatus() {
		return this.jobstatus;
	}

	public void setJobstatus(String jobstatus) {
		this.jobstatus = jobstatus;
	}

	public String getWorkexper() {
		return this.workexper;
	}

	public void setWorkexper(String workexper) {
		this.workexper = workexper;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getThirdid() {
		return this.thirdid;
	}

	public void setThirdid(String thirdid) {
		this.thirdid = thirdid;
	}

	public String getHeadimg() {
		return this.headimg;
	}

	public void setHeadimg(String headimg) {
		this.headimg = headimg;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWeibo() {
		return this.weibo;
	}

	public void setWeibo(String weibo) {
		this.weibo = weibo;
	}

	public String getProviceid() {
		return this.proviceid;
	}

	public void setProviceid(String proviceid) {
		this.proviceid = proviceid;
	}

	public String getCityid() {
		return this.cityid;
	}

	public void setCityid(String cityid) {
		this.cityid = cityid;
	}

	public String getAreaid() {
		return this.areaid;
	}

	public void setAreaid(String areaid) {
		this.areaid = areaid;
	}

	public String getReconum() {
		return this.reconum;
	}

	public void setReconum(String reconum) {
		this.reconum = reconum;
	}

	public Integer getJfcount() {
		return this.jfcount;
	}

	public void setJfcount(Integer jfcount) {
		this.jfcount = jfcount;
	}

	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getRegdate() {
		return this.regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getComefrom() {
		return this.comefrom;
	}

	public void setComefrom(String comefrom) {
		this.comefrom = comefrom;
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public Date getLatestlogin() {
		return this.latestlogin;
	}

	public void setLatestlogin(Date latestlogin) {
		this.latestlogin = latestlogin;
	}

	public String getIdentitycard() {
		return this.identitycard;
	}

	public void setIdentitycard(String identitycard) {
		this.identitycard = identitycard;
	}

	public String getDeviceidentifier() {
		return this.deviceidentifier;
	}

	public void setDeviceidentifier(String deviceidentifier) {
		this.deviceidentifier = deviceidentifier;
	}

	public String getAppcode() {
		return this.appcode;
	}

	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}

	public String getAppversion() {
		return this.appversion;
	}

	public void setAppversion(String appversion) {
		this.appversion = appversion;
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

	public String getUserlevel() {
		return this.userlevel;
	}

	public void setUserlevel(String userlevel) {
		this.userlevel = userlevel;
	}

	public String getIscertification() {
		return this.iscertification;
	}

	public void setIscertification(String iscertification) {
		this.iscertification = iscertification;
	}

	public Date getCertifidate() {
		return this.certifidate;
	}

	public void setCertifidate(Date certifidate) {
		this.certifidate = certifidate;
	}

	public String getIspwd() {
		return this.ispwd;
	}

	public void setIspwd(String ispwd) {
		this.ispwd = ispwd;
	}

}
