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
@TableName(value = "gxb_task_rule_sys_condition")
public class GxbTaskRuleSysCondition implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 每个规则的固定ID，用于调用\n */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 规则中文名称，用于后台人工识别规则 */
	private String name;

	/**  */
	@TableField(value = "rule_type_method")
	private Integer ruleTypeMethod;

	/**  */
	@TableField(value = "rule_method1")
	private Integer ruleMethod1;

	/**  */
	@TableField(value = "rule_method2")
	private Integer ruleMethod2;

	/**  */
	@TableField(value = "rule_method3")
	private Integer ruleMethod3;

	/**  */
	@TableField(value = "rule_method4")
	private Integer ruleMethod4;

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

	public Integer getRuleTypeMethod() {
		return this.ruleTypeMethod;
	}

	public void setRuleTypeMethod(Integer ruleTypeMethod) {
		this.ruleTypeMethod = ruleTypeMethod;
	}

	public Integer getRuleMethod1() {
		return this.ruleMethod1;
	}

	public void setRuleMethod1(Integer ruleMethod1) {
		this.ruleMethod1 = ruleMethod1;
	}

	public Integer getRuleMethod2() {
		return this.ruleMethod2;
	}

	public void setRuleMethod2(Integer ruleMethod2) {
		this.ruleMethod2 = ruleMethod2;
	}

	public Integer getRuleMethod3() {
		return this.ruleMethod3;
	}

	public void setRuleMethod3(Integer ruleMethod3) {
		this.ruleMethod3 = ruleMethod3;
	}

	public Integer getRuleMethod4() {
		return this.ruleMethod4;
	}

	public void setRuleMethod4(Integer ruleMethod4) {
		this.ruleMethod4 = ruleMethod4;
	}

	public Integer getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

}
