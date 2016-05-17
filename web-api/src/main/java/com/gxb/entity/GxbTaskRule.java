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
@TableName(value = "gxb_task_rule")
public class GxbTaskRule implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 每个规则的固定ID，用于调用\n */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 用于描述整个规则的有效期范围
 */
	@TableField(value = "valid_date")
	private Date validDate;

	/**  */
	@TableField(value = "rule_action")
	private String ruleAction;

	/**  */
	@TableField(value = "user_condition_id")
	private Integer userConditionId;

	/**  */
	@TableField(value = "sys_condition_id")
	private Integer sysConditionId;

	/**  */
	@TableField(value = "del_flag")
	private Integer delFlag;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getValidDate() {
		return this.validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public String getRuleAction() {
		return this.ruleAction;
	}

	public void setRuleAction(String ruleAction) {
		this.ruleAction = ruleAction;
	}

	public Integer getUserConditionId() {
		return this.userConditionId;
	}

	public void setUserConditionId(Integer userConditionId) {
		this.userConditionId = userConditionId;
	}

	public Integer getSysConditionId() {
		return this.sysConditionId;
	}

	public void setSysConditionId(Integer sysConditionId) {
		this.sysConditionId = sysConditionId;
	}

	public Integer getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

}
