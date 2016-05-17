package com.gxb.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 用户-角色
 *
 */
@TableName(value = "sys_user_role")
public class SysUserRole implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 用户编号 */
	@TableId(value = "user_id", type = IdType.AUTO)
	private String userId;

	/** 角色编号 */
	@TableId(value = "role_id", type = IdType.AUTO)
	private String roleId;

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

}
