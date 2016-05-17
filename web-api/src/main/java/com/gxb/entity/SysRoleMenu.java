package com.gxb.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 角色-菜单
 *
 */
@TableName(value = "sys_role_menu")
public class SysRoleMenu implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 角色编号 */
	@TableId(value = "role_id", type = IdType.AUTO)
	private String roleId;

	/** 菜单编号 */
	@TableId(value = "menu_id", type = IdType.AUTO)
	private String menuId;

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

}
