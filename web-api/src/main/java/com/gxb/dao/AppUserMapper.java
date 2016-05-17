package com.gxb.dao;

import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.gxb.domain.AppUser;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface AppUserMapper extends AutoMapper<AppUser> {

  List<AppUser> selectListRow(RowBounds pagination);


  @Delete({
      "delete from app_user",
      "where id = #{id,jdbcType=VARCHAR}"
  })
  int deleteByPrimaryKey(String id);

  @Insert({
      "insert into app_user (id, userid, ",
      "usertype, password, ",
      "username, nickname, ",
      "realname, jobtype, ",
      "jobstatus, workexper, ",
      "age, thirdid, headimg, ",
      "gender, birthday, ",
      "email, mobile, phone, ",
      "weibo, proviceid, ",
      "cityid, areaid, ",
      "reconum, jfcount, ",
      "companyname, address, ",
      "status, regdate, ",
      "comefrom, level, ",
      "latestlogin, identitycard, ",
      "deviceidentifier, appcode, ",
      "appversion, devicetype, ",
      "devicemodel, sys, ",
      "sysversion, create_by, ",
      "create_date, update_by, ",
      "update_date, del_flag, ",
      "userlevel, iscertification, ",
      "certifidate, ispwd, ",
      "remarks)",
      "values (#{id,jdbcType=VARCHAR}, #{userid,jdbcType=INTEGER}, ",
      "#{usertype,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
      "#{username,jdbcType=VARCHAR}, #{nickname,jdbcType=VARCHAR}, ",
      "#{realname,jdbcType=VARCHAR}, #{jobtype,jdbcType=VARCHAR}, ",
      "#{jobstatus,jdbcType=VARCHAR}, #{workexper,jdbcType=VARCHAR}, ",
      "#{age,jdbcType=INTEGER}, #{thirdid,jdbcType=VARCHAR}, #{headimg,jdbcType=VARCHAR}, ",
      "#{gender,jdbcType=VARCHAR}, #{birthday,jdbcType=VARCHAR}, ",
      "#{email,jdbcType=VARCHAR}, #{mobile,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, ",
      "#{weibo,jdbcType=VARCHAR}, #{proviceid,jdbcType=VARCHAR}, ",
      "#{cityid,jdbcType=VARCHAR}, #{areaid,jdbcType=VARCHAR}, ",
      "#{reconum,jdbcType=VARCHAR}, #{jfcount,jdbcType=INTEGER}, ",
      "#{companyname,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
      "#{status,jdbcType=VARCHAR}, #{regdate,jdbcType=TIMESTAMP}, ",
      "#{comefrom,jdbcType=VARCHAR}, #{level,jdbcType=VARCHAR}, ",
      "#{latestlogin,jdbcType=TIMESTAMP}, #{identitycard,jdbcType=VARCHAR}, ",
      "#{deviceidentifier,jdbcType=VARCHAR}, #{appcode,jdbcType=VARCHAR}, ",
      "#{appversion,jdbcType=VARCHAR}, #{devicetype,jdbcType=VARCHAR}, ",
      "#{devicemodel,jdbcType=VARCHAR}, #{sys,jdbcType=VARCHAR}, ",
      "#{sysversion,jdbcType=VARCHAR}, #{createBy,jdbcType=VARCHAR}, ",
      "#{createDate,jdbcType=TIMESTAMP}, #{updateBy,jdbcType=VARCHAR}, ",
      "#{updateDate,jdbcType=TIMESTAMP}, #{delFlag,jdbcType=CHAR}, ",
      "#{userlevel,jdbcType=VARCHAR}, #{iscertification,jdbcType=VARCHAR}, ",
      "#{certifidate,jdbcType=TIMESTAMP}, #{ispwd,jdbcType=CHAR}, ",
      "#{remarks,jdbcType=LONGVARCHAR})"
  })
  int insert(AppUser record);

  int insertSelective(AppUser record);

  @Select({
      "select",
      "id, userid, usertype, password, username, nickname, realname, jobtype, jobstatus, ",
      "workexper, age, thirdid, headimg, gender, birthday, email, mobile, phone, weibo, ",
      "proviceid, cityid, areaid, reconum, jfcount, companyname, address, status, regdate, ",
      "comefrom, level, latestlogin, identitycard, deviceidentifier, appcode, appversion, ",
      "devicetype, devicemodel, sys, sysversion, create_by, create_date, update_by, ",
      "update_date, del_flag, userlevel, iscertification, certifidate, ispwd, remarks",
      "from app_user",
      "where id = #{id,jdbcType=VARCHAR}"
  })
  @ResultMap("ResultMapWithBLOBs")
  AppUser selectByPrimaryKey(String id);

  int updateByPrimaryKeySelective(AppUser record);

  @Update({
      "update app_user",
      "set userid = #{userid,jdbcType=INTEGER},",
      "usertype = #{usertype,jdbcType=VARCHAR},",
      "password = #{password,jdbcType=VARCHAR},",
      "username = #{username,jdbcType=VARCHAR},",
      "nickname = #{nickname,jdbcType=VARCHAR},",
      "realname = #{realname,jdbcType=VARCHAR},",
      "jobtype = #{jobtype,jdbcType=VARCHAR},",
      "jobstatus = #{jobstatus,jdbcType=VARCHAR},",
      "workexper = #{workexper,jdbcType=VARCHAR},",
      "age = #{age,jdbcType=INTEGER},",
      "thirdid = #{thirdid,jdbcType=VARCHAR},",
      "headimg = #{headimg,jdbcType=VARCHAR},",
      "gender = #{gender,jdbcType=VARCHAR},",
      "birthday = #{birthday,jdbcType=VARCHAR},",
      "email = #{email,jdbcType=VARCHAR},",
      "mobile = #{mobile,jdbcType=VARCHAR},",
      "phone = #{phone,jdbcType=VARCHAR},",
      "weibo = #{weibo,jdbcType=VARCHAR},",
      "proviceid = #{proviceid,jdbcType=VARCHAR},",
      "cityid = #{cityid,jdbcType=VARCHAR},",
      "areaid = #{areaid,jdbcType=VARCHAR},",
      "reconum = #{reconum,jdbcType=VARCHAR},",
      "jfcount = #{jfcount,jdbcType=INTEGER},",
      "companyname = #{companyname,jdbcType=VARCHAR},",
      "address = #{address,jdbcType=VARCHAR},",
      "status = #{status,jdbcType=VARCHAR},",
      "regdate = #{regdate,jdbcType=TIMESTAMP},",
      "comefrom = #{comefrom,jdbcType=VARCHAR},",
      "level = #{level,jdbcType=VARCHAR},",
      "latestlogin = #{latestlogin,jdbcType=TIMESTAMP},",
      "identitycard = #{identitycard,jdbcType=VARCHAR},",
      "deviceidentifier = #{deviceidentifier,jdbcType=VARCHAR},",
      "appcode = #{appcode,jdbcType=VARCHAR},",
      "appversion = #{appversion,jdbcType=VARCHAR},",
      "devicetype = #{devicetype,jdbcType=VARCHAR},",
      "devicemodel = #{devicemodel,jdbcType=VARCHAR},",
      "sys = #{sys,jdbcType=VARCHAR},",
      "sysversion = #{sysversion,jdbcType=VARCHAR},",
      "create_by = #{createBy,jdbcType=VARCHAR},",
      "create_date = #{createDate,jdbcType=TIMESTAMP},",
      "update_by = #{updateBy,jdbcType=VARCHAR},",
      "update_date = #{updateDate,jdbcType=TIMESTAMP},",
      "del_flag = #{delFlag,jdbcType=CHAR},",
      "userlevel = #{userlevel,jdbcType=VARCHAR},",
      "iscertification = #{iscertification,jdbcType=VARCHAR},",
      "certifidate = #{certifidate,jdbcType=TIMESTAMP},",
      "ispwd = #{ispwd,jdbcType=CHAR},",
      "remarks = #{remarks,jdbcType=LONGVARCHAR}",
      "where id = #{id,jdbcType=VARCHAR}"
  })
  int updateByPrimaryKeyWithBLOBs(AppUser record);

  @Update({
      "update app_user",
      "set userid = #{userid,jdbcType=INTEGER},",
      "usertype = #{usertype,jdbcType=VARCHAR},",
      "password = #{password,jdbcType=VARCHAR},",
      "username = #{username,jdbcType=VARCHAR},",
      "nickname = #{nickname,jdbcType=VARCHAR},",
      "realname = #{realname,jdbcType=VARCHAR},",
      "jobtype = #{jobtype,jdbcType=VARCHAR},",
      "jobstatus = #{jobstatus,jdbcType=VARCHAR},",
      "workexper = #{workexper,jdbcType=VARCHAR},",
      "age = #{age,jdbcType=INTEGER},",
      "thirdid = #{thirdid,jdbcType=VARCHAR},",
      "headimg = #{headimg,jdbcType=VARCHAR},",
      "gender = #{gender,jdbcType=VARCHAR},",
      "birthday = #{birthday,jdbcType=VARCHAR},",
      "email = #{email,jdbcType=VARCHAR},",
      "mobile = #{mobile,jdbcType=VARCHAR},",
      "phone = #{phone,jdbcType=VARCHAR},",
      "weibo = #{weibo,jdbcType=VARCHAR},",
      "proviceid = #{proviceid,jdbcType=VARCHAR},",
      "cityid = #{cityid,jdbcType=VARCHAR},",
      "areaid = #{areaid,jdbcType=VARCHAR},",
      "reconum = #{reconum,jdbcType=VARCHAR},",
      "jfcount = #{jfcount,jdbcType=INTEGER},",
      "companyname = #{companyname,jdbcType=VARCHAR},",
      "address = #{address,jdbcType=VARCHAR},",
      "status = #{status,jdbcType=VARCHAR},",
      "regdate = #{regdate,jdbcType=TIMESTAMP},",
      "comefrom = #{comefrom,jdbcType=VARCHAR},",
      "level = #{level,jdbcType=VARCHAR},",
      "latestlogin = #{latestlogin,jdbcType=TIMESTAMP},",
      "identitycard = #{identitycard,jdbcType=VARCHAR},",
      "deviceidentifier = #{deviceidentifier,jdbcType=VARCHAR},",
      "appcode = #{appcode,jdbcType=VARCHAR},",
      "appversion = #{appversion,jdbcType=VARCHAR},",
      "devicetype = #{devicetype,jdbcType=VARCHAR},",
      "devicemodel = #{devicemodel,jdbcType=VARCHAR},",
      "sys = #{sys,jdbcType=VARCHAR},",
      "sysversion = #{sysversion,jdbcType=VARCHAR},",
      "create_by = #{createBy,jdbcType=VARCHAR},",
      "create_date = #{createDate,jdbcType=TIMESTAMP},",
      "update_by = #{updateBy,jdbcType=VARCHAR},",
      "update_date = #{updateDate,jdbcType=TIMESTAMP},",
      "del_flag = #{delFlag,jdbcType=CHAR},",
      "userlevel = #{userlevel,jdbcType=VARCHAR},",
      "iscertification = #{iscertification,jdbcType=VARCHAR},",
      "certifidate = #{certifidate,jdbcType=TIMESTAMP},",
      "ispwd = #{ispwd,jdbcType=CHAR}",
      "where id = #{id,jdbcType=VARCHAR}"
  })
  int updateByPrimaryKey(AppUser record);
}