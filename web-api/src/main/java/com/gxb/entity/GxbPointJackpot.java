package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 中奖记录信息表
 *
 */
@TableName(value = "gxb_point_jackpot")
public class GxbPointJackpot implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 用户ID */
	private Integer userid;

	/** 参与活动ID */
	private Integer actid;

	/** 手机号 */
	private String mobile;

	/** 奖品名称 */
	private String gifnm;

	/** 奖品ID */
	private Integer gifid;

	/** 奖品类型 */
	private Integer giftype;

	/** 奖品等级 */
	private Integer giflevel;

	/** 奖品数量 */
	private Integer gifnum;

	/** 是否导出 （0：导出，1：未导出） */
	private Integer isdoc;

	/** 导出时间 */
	private Date docdt;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getActid() {
		return this.actid;
	}

	public void setActid(Integer actid) {
		this.actid = actid;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGifnm() {
		return this.gifnm;
	}

	public void setGifnm(String gifnm) {
		this.gifnm = gifnm;
	}

	public Integer getGifid() {
		return this.gifid;
	}

	public void setGifid(Integer gifid) {
		this.gifid = gifid;
	}

	public Integer getGiftype() {
		return this.giftype;
	}

	public void setGiftype(Integer giftype) {
		this.giftype = giftype;
	}

	public Integer getGiflevel() {
		return this.giflevel;
	}

	public void setGiflevel(Integer giflevel) {
		this.giflevel = giflevel;
	}

	public Integer getGifnum() {
		return this.gifnum;
	}

	public void setGifnum(Integer gifnum) {
		this.gifnum = gifnum;
	}

	public Integer getIsdoc() {
		return this.isdoc;
	}

	public void setIsdoc(Integer isdoc) {
		this.isdoc = isdoc;
	}

	public Date getDocdt() {
		return this.docdt;
	}

	public void setDocdt(Date docdt) {
		this.docdt = docdt;
	}

}
