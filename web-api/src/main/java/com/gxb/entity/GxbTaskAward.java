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
@TableName(value = "gxb_task_award")
public class GxbTaskAward implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**  */
	private Integer type;

	/**  */
	@TableField(value = "type1_is_incr")
	private Integer type1IsIncr;

	/**  */
	@TableField(value = "type1_num")
	private Integer type1Num;

	/**  */
	private String ladder;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getType1IsIncr() {
		return this.type1IsIncr;
	}

	public void setType1IsIncr(Integer type1IsIncr) {
		this.type1IsIncr = type1IsIncr;
	}

	public Integer getType1Num() {
		return this.type1Num;
	}

	public void setType1Num(Integer type1Num) {
		this.type1Num = type1Num;
	}

	public String getLadder() {
		return this.ladder;
	}

	public void setLadder(String ladder) {
		this.ladder = ladder;
	}

}
