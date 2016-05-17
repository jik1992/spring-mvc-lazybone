package com.gxb.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 角色-机构
 *
 */
@TableName(value = "sys_role_office")
public class SysRoleOffice implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 角色编号 */
	@TableId(value = "role_id", type = IdType.AUTO)
	private String roleId;

	/** 机构编号 */
	@TableId(value = "office_id", type = IdType.AUTO)
	private String officeId;

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

}
