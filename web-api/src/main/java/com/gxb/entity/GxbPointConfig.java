package com.gxb.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 抽奖规则配置表
 *
 */
@TableName(value = "gxb_point_config")
public class GxbPointConfig implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/** 参与活动ID */
	private Integer actid;

	/** 积分消耗数 */
	private Integer deppoint;

	/** 抽奖次数 */
	private Integer depnum;

	/** 次数限制类型 */
	private Integer deptype;

	/** 删除标记 */
	@TableField(value = "del_flag")
	private String delFlag;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getActid() {
		return this.actid;
	}

	public void setActid(Integer actid) {
		this.actid = actid;
	}

	public Integer getDeppoint() {
		return this.deppoint;
	}

	public void setDeppoint(Integer deppoint) {
		this.deppoint = deppoint;
	}

	public Integer getDepnum() {
		return this.depnum;
	}

	public void setDepnum(Integer depnum) {
		this.depnum = depnum;
	}

	public Integer getDeptype() {
		return this.deptype;
	}

	public void setDeptype(Integer deptype) {
		this.deptype = deptype;
	}

	public String getDelFlag() {
		return this.delFlag;
	}

	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}

}
