package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 对账表
 *
 */
@TableName(value = "gxb_agencypay_trans")
public class GxbAgencypayTrans implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 主键 */
	@TableId(type = IdType.AUTO)
	private String id;

	/**  */
	private String salaryid;

	/**  */
	private String salarydetailid;

	/** 清算日期 */
	private String qsdate;

	/** 商户号 */
	private String shcode;

	/** 商户名称 */
	private String shname;

	/** 交易来源 */
	private String transsource;

	/** 卡号 */
	private String cardno;

	/** 户名 */
	private String accountname;

	/**  */
	private BigDecimal salary;

	/** 身份证号 */
	private String identitycard;

	/**  */
	private String paysernumber;

	/**  */
	private BigDecimal poundage;

	/** 反馈码 */
	private String jsckh;

	/**  */
	private String retnum;

	/**  */
	private String status;

	/** 交易时间 */
	private Date paydate;

	/** 用户ID */
	private Integer userid;

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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSalaryid() {
		return this.salaryid;
	}

	public void setSalaryid(String salaryid) {
		this.salaryid = salaryid;
	}

	public String getSalarydetailid() {
		return this.salarydetailid;
	}

	public void setSalarydetailid(String salarydetailid) {
		this.salarydetailid = salarydetailid;
	}

	public String getQsdate() {
		return this.qsdate;
	}

	public void setQsdate(String qsdate) {
		this.qsdate = qsdate;
	}

	public String getShcode() {
		return this.shcode;
	}

	public void setShcode(String shcode) {
		this.shcode = shcode;
	}

	public String getShname() {
		return this.shname;
	}

	public void setShname(String shname) {
		this.shname = shname;
	}

	public String getTranssource() {
		return this.transsource;
	}

	public void setTranssource(String transsource) {
		this.transsource = transsource;
	}

	public String getCardno() {
		return this.cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getAccountname() {
		return this.accountname;
	}

	public void setAccountname(String accountname) {
		this.accountname = accountname;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getIdentitycard() {
		return this.identitycard;
	}

	public void setIdentitycard(String identitycard) {
		this.identitycard = identitycard;
	}

	public String getPaysernumber() {
		return this.paysernumber;
	}

	public void setPaysernumber(String paysernumber) {
		this.paysernumber = paysernumber;
	}

	public BigDecimal getPoundage() {
		return this.poundage;
	}

	public void setPoundage(BigDecimal poundage) {
		this.poundage = poundage;
	}

	public String getJsckh() {
		return this.jsckh;
	}

	public void setJsckh(String jsckh) {
		this.jsckh = jsckh;
	}

	public String getRetnum() {
		return this.retnum;
	}

	public void setRetnum(String retnum) {
		this.retnum = retnum;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getPaydate() {
		return this.paydate;
	}

	public void setPaydate(Date paydate) {
		this.paydate = paydate;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
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
