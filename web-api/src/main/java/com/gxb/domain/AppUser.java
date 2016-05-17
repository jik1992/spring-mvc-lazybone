package com.gxb.domain;

import java.io.Serializable;
import java.util.Date;

public class AppUser implements Serializable {

  private String id;

  private Integer userid;

  private String usertype;

  private String password;

  private String username;

  private String nickname;

  private String realname;

  private String jobtype;

  private String jobstatus;

  private String workexper;

  private Integer age;

  private String thirdid;

  private String headimg;

  private String gender;

  private String birthday;

  private String email;

  private String mobile;

  private String phone;

  private String weibo;

  private String proviceid;

  private String cityid;

  private String areaid;

  private String reconum;

  private Integer jfcount;

  private String companyname;

  private String address;

  private String status;

  private Date regdate;

  private String comefrom;

  private String level;

  private Date latestlogin;

  private String identitycard;

  private String deviceidentifier;

  private String appcode;

  private String appversion;

  private String devicetype;

  private String devicemodel;

  private String sys;

  private String sysversion;

  private String createBy;

  private Date createDate;

  private String updateBy;

  private Date updateDate;

  private String delFlag;

  private String userlevel;

  private String iscertification;

  private Date certifidate;

  private String ispwd;

  private String remarks;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id == null ? null : id.trim();
  }

  public Integer getUserid() {
    return userid;
  }

  public void setUserid(Integer userid) {
    this.userid = userid;
  }

  public String getUsertype() {
    return usertype;
  }

  public void setUsertype(String usertype) {
    this.usertype = usertype == null ? null : usertype.trim();
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password == null ? null : password.trim();
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username == null ? null : username.trim();
  }

  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname == null ? null : nickname.trim();
  }

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname == null ? null : realname.trim();
  }

  public String getJobtype() {
    return jobtype;
  }

  public void setJobtype(String jobtype) {
    this.jobtype = jobtype == null ? null : jobtype.trim();
  }

  public String getJobstatus() {
    return jobstatus;
  }

  public void setJobstatus(String jobstatus) {
    this.jobstatus = jobstatus == null ? null : jobstatus.trim();
  }

  public String getWorkexper() {
    return workexper;
  }

  public void setWorkexper(String workexper) {
    this.workexper = workexper == null ? null : workexper.trim();
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getThirdid() {
    return thirdid;
  }

  public void setThirdid(String thirdid) {
    this.thirdid = thirdid == null ? null : thirdid.trim();
  }

  public String getHeadimg() {
    return headimg;
  }

  public void setHeadimg(String headimg) {
    this.headimg = headimg == null ? null : headimg.trim();
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender == null ? null : gender.trim();
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday == null ? null : birthday.trim();
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email == null ? null : email.trim();
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile == null ? null : mobile.trim();
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone == null ? null : phone.trim();
  }

  public String getWeibo() {
    return weibo;
  }

  public void setWeibo(String weibo) {
    this.weibo = weibo == null ? null : weibo.trim();
  }

  public String getProviceid() {
    return proviceid;
  }

  public void setProviceid(String proviceid) {
    this.proviceid = proviceid == null ? null : proviceid.trim();
  }

  public String getCityid() {
    return cityid;
  }

  public void setCityid(String cityid) {
    this.cityid = cityid == null ? null : cityid.trim();
  }

  public String getAreaid() {
    return areaid;
  }

  public void setAreaid(String areaid) {
    this.areaid = areaid == null ? null : areaid.trim();
  }

  public String getReconum() {
    return reconum;
  }

  public void setReconum(String reconum) {
    this.reconum = reconum == null ? null : reconum.trim();
  }

  public Integer getJfcount() {
    return jfcount;
  }

  public void setJfcount(Integer jfcount) {
    this.jfcount = jfcount;
  }

  public String getCompanyname() {
    return companyname;
  }

  public void setCompanyname(String companyname) {
    this.companyname = companyname == null ? null : companyname.trim();
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address == null ? null : address.trim();
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status == null ? null : status.trim();
  }

  public Date getRegdate() {
    return regdate;
  }

  public void setRegdate(Date regdate) {
    this.regdate = regdate;
  }

  public String getComefrom() {
    return comefrom;
  }

  public void setComefrom(String comefrom) {
    this.comefrom = comefrom == null ? null : comefrom.trim();
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level == null ? null : level.trim();
  }

  public Date getLatestlogin() {
    return latestlogin;
  }

  public void setLatestlogin(Date latestlogin) {
    this.latestlogin = latestlogin;
  }

  public String getIdentitycard() {
    return identitycard;
  }

  public void setIdentitycard(String identitycard) {
    this.identitycard = identitycard == null ? null : identitycard.trim();
  }

  public String getDeviceidentifier() {
    return deviceidentifier;
  }

  public void setDeviceidentifier(String deviceidentifier) {
    this.deviceidentifier = deviceidentifier == null ? null : deviceidentifier.trim();
  }

  public String getAppcode() {
    return appcode;
  }

  public void setAppcode(String appcode) {
    this.appcode = appcode == null ? null : appcode.trim();
  }

  public String getAppversion() {
    return appversion;
  }

  public void setAppversion(String appversion) {
    this.appversion = appversion == null ? null : appversion.trim();
  }

  public String getDevicetype() {
    return devicetype;
  }

  public void setDevicetype(String devicetype) {
    this.devicetype = devicetype == null ? null : devicetype.trim();
  }

  public String getDevicemodel() {
    return devicemodel;
  }

  public void setDevicemodel(String devicemodel) {
    this.devicemodel = devicemodel == null ? null : devicemodel.trim();
  }

  public String getSys() {
    return sys;
  }

  public void setSys(String sys) {
    this.sys = sys == null ? null : sys.trim();
  }

  public String getSysversion() {
    return sysversion;
  }

  public void setSysversion(String sysversion) {
    this.sysversion = sysversion == null ? null : sysversion.trim();
  }

  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy == null ? null : createBy.trim();
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy == null ? null : updateBy.trim();
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public String getDelFlag() {
    return delFlag;
  }

  public void setDelFlag(String delFlag) {
    this.delFlag = delFlag == null ? null : delFlag.trim();
  }

  public String getUserlevel() {
    return userlevel;
  }

  public void setUserlevel(String userlevel) {
    this.userlevel = userlevel == null ? null : userlevel.trim();
  }

  public String getIscertification() {
    return iscertification;
  }

  public void setIscertification(String iscertification) {
    this.iscertification = iscertification == null ? null : iscertification.trim();
  }

  public Date getCertifidate() {
    return certifidate;
  }

  public void setCertifidate(Date certifidate) {
    this.certifidate = certifidate;
  }

  public String getIspwd() {
    return ispwd;
  }

  public void setIspwd(String ispwd) {
    this.ispwd = ispwd == null ? null : ispwd.trim();
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks == null ? null : remarks.trim();
  }
}