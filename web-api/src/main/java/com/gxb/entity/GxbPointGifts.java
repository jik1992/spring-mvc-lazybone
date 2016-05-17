package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 积分抽奖活动表
 *
 */
@TableName(value = "gxb_point_gifts")
public class GxbPointGifts implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/** 活动ID */
	private Integer actid;

	/** 奖品名称 */
	private String gifnm;

	/** 奖品类型 */
	private Integer giftype;

	/** 奖品数量 */
	private Integer gifnum;

	/** 奖品等级 */
	private Integer giflevel;

	/** 中奖概率 */
	private Integer lottpro;

	/** 月上限次数 */
	private Integer mlimit;

	/** 日上限次数 */
	private Integer dlimit;

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

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getActid() {
		return this.actid;
	}

	public void setActid(Integer actid) {
		this.actid = actid;
	}

	public String getGifnm() {
		return this.gifnm;
	}

	public void setGifnm(String gifnm) {
		this.gifnm = gifnm;
	}

	public Integer getGiftype() {
		return this.giftype;
	}

	public void setGiftype(Integer giftype) {
		this.giftype = giftype;
	}

	public Integer getGifnum() {
		return this.gifnum;
	}

	public void setGifnum(Integer gifnum) {
		this.gifnum = gifnum;
	}

	public Integer getGiflevel() {
		return this.giflevel;
	}

	public void setGiflevel(Integer giflevel) {
		this.giflevel = giflevel;
	}

	public Integer getLottpro() {
		return this.lottpro;
	}

	public void setLottpro(Integer lottpro) {
		this.lottpro = lottpro;
	}

	public Integer getMlimit() {
		return this.mlimit;
	}

	public void setMlimit(Integer mlimit) {
		this.mlimit = mlimit;
	}

	public Integer getDlimit() {
		return this.dlimit;
	}

	public void setDlimit(Integer dlimit) {
		this.dlimit = dlimit;
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
