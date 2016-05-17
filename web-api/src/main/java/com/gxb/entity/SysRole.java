package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 角色表
 *
 */
@TableName(value = "sys_role")
public class SysRole implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 编号 */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 归属机构 */
	@TableField(value = "office_id")
	private String officeId;

	/** 角色名称 */
	private String name;

	/** 英文名称 */
	private String enname;

	/** 角色类型 */
	@TableField(value = "role_type")
	private String roleType;

	/** 数据范围 */
	@TableField(value = "data_scope")
	private String dataScope;

	/** 是否系统数据 */
	@TableField(value = "is_sys")
	private String isSys;

	/** 是否可用 */
	private String useable;

	/** 应用类型 */
	private String applytype;

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

	/** 删除标记 */
	@TableField(value = "del_flag")
	private String delFlag;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnname() {
		return this.enname;
	}

	public void setEnname(String enname) {
		this.enname = enname;
	}

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	public String getDataScope() {
		return this.dataScope;
	}

	public void setDataScope(String dataScope) {
		this.dataScope = dataScope;
	}

	public String getIsSys() {
		return this.isSys;
	}

	public void setIsSys(String isSys) {
		this.isSys = isSys;
	}

	public String getUseable() {
		return this.useable;
	}

	public void setUseable(String useable) {
		this.useable = useable;
	}

	public String getApplytype() {
		return this.applytype;
	}

	public void setApplytype(String applytype) {
		this.applytype = applytype;
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

}
