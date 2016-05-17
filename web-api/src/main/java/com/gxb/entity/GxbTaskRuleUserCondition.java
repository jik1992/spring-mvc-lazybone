package com.gxb.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 
 *
 */
@TableName(value = "gxb_task_rule_user_condition")
public class GxbTaskRuleUserCondition implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 每个规则的固定ID，用于调用\n */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 规则中文名称，用于后台人工识别规则 */
	private String name;

	/** 对于单个用户生效的规则（可能由某个单项功能触发的任务规则）\n */
	@TableField(value = "condition_user_id")
	private Integer conditionUserId;

	/**  */
	@TableField(value = "condition_role")
	private Integer conditionRole;

	/**  */
	@TableField(value = "condition_level")
	private Integer conditionLevel;

	/**  */
	@TableField(value = "condition_is_bind_pay")
	private Integer conditionIsBindPay;

	/**  */
	@TableField(value = "condition_is_real_name")
	private Integer conditionIsRealName;

	/**  */
	@TableField(value = "del_flag")
	private Integer delFlag;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getConditionUserId() {
		return this.conditionUserId;
	}

	public void setConditionUserId(Integer conditionUserId) {
		this.conditionUserId = conditionUserId;
	}

	public Integer getConditionRole() {
		return this.conditionRole;
	}

	public void setConditionRole(Integer conditionRole) {
		this.conditionRole = conditionRole;
	}

	public Integer getConditionLevel() {
		return this.conditionLevel;
	}

	public void setConditionLevel(Integer conditionLevel) {
		this.conditionLevel = conditionLevel;
	}

	public Integer getConditionIsBindPay() {
		return this.conditionIsBindPay;
	}

	public void setConditionIsBindPay(Integer conditionIsBindPay) {
		this.conditionIsBindPay = conditionIsBindPay;
	}

	public Integer getConditionIsRealName() {
		return this.conditionIsRealName;
	}

	public void setConditionIsRealName(Integer conditionIsRealName) {
		this.conditionIsRealName = conditionIsRealName;
	}

	public Integer getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

}
