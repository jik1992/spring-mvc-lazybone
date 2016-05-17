package com.gxb.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 *
 * 实际工资发放明细表
 *
 */
@TableName(value = "gxb_user_salary_real_detail")
public class GxbUserSalaryRealDetail implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/**  */
	@TableId(type = IdType.AUTO)
	private String id;

	/**  */
	private String applyid;

	/**  */
	private String applydetailid;

	/** 企业用户ID */
	private String companyid;

	/** 项目ID */
	private String projectid;

	/**  */
	private String projectname;

	/** 班组ID */
	private String groupid;

	/**  */
	private String groupname;

	/**  */
	private Integer pmuserid;

	/**  */
	private String pmname;

	/**  */
	private Integer groupleader;

	/**  */
	private String groupleadername;

	/** 记工负责人ID */
	private Integer recorder;

	/**  */
	private String recordername;

	/** 工资发放ID */
	private String salaryid;

	/** 发放工资月份 */
	private String salarymonth;

	/** 工人ID */
	private Integer worker;

	/**  */
	private String workername;

	/**  */
	private String jobtype;

	/**  */
	private String payer;

	/**  */
	private String payercard;

	/**  */
	private String content;

	/**  */
	private Date paydate;

	/** 实际薪水 */
	private Double salary;

	/** 收款方银行名称 */
	private String bankname;

	/** 收款方卡号 */
	private String cardno;

	/** 收款状态(0:交易中 1:已完成 2:失败) */
	private String status;

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

	/** 应发薪水 */
	private Double totalsalary;

	/** 剩余薪水 */
	private Double restsalary;

	/** 开始日期 */
	private String startdate;

	/** 结束日期 */
	private String enddate;

	/** 实际发月份 */
	private String paymonth;

	/** 交易流水号 */
	private String outtradeno;

	/** 银联返回的交易编号 */
	private String orderno;

	/** 代付系统交易流水号 */
	private String paysernumber;

	/** 批次号 */
	private String batchno;

	/** 是否对账 */
	private String isrec;

	/** 申请金额 */
	private Double applysalary;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplyid() {
		return this.applyid;
	}

	public void setApplyid(String applyid) {
		this.applyid = applyid;
	}

	public String getApplydetailid() {
		return this.applydetailid;
	}

	public void setApplydetailid(String applydetailid) {
		this.applydetailid = applydetailid;
	}

	public String getCompanyid() {
		return this.companyid;
	}

	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}

	public String getProjectid() {
		return this.projectid;
	}

	public void setProjectid(String projectid) {
		this.projectid = projectid;
	}

	public String getProjectname() {
		return this.projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getGroupid() {
		return this.groupid;
	}

	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}

	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public Integer getPmuserid() {
		return this.pmuserid;
	}

	public void setPmuserid(Integer pmuserid) {
		this.pmuserid = pmuserid;
	}

	public String getPmname() {
		return this.pmname;
	}

	public void setPmname(String pmname) {
		this.pmname = pmname;
	}

	public Integer getGroupleader() {
		return this.groupleader;
	}

	public void setGroupleader(Integer groupleader) {
		this.groupleader = groupleader;
	}

	public String getGroupleadername() {
		return this.groupleadername;
	}

	public void setGroupleadername(String groupleadername) {
		this.groupleadername = groupleadername;
	}

	public Integer getRecorder() {
		return this.recorder;
	}

	public void setRecorder(Integer recorder) {
		this.recorder = recorder;
	}

	public String getRecordername() {
		return this.recordername;
	}

	public void setRecordername(String recordername) {
		this.recordername = recordername;
	}

	public String getSalaryid() {
		return this.salaryid;
	}

	public void setSalaryid(String salaryid) {
		this.salaryid = salaryid;
	}

	public String getSalarymonth() {
		return this.salarymonth;
	}

	public void setSalarymonth(String salarymonth) {
		this.salarymonth = salarymonth;
	}

	public Integer getWorker() {
		return this.worker;
	}

	public void setWorker(Integer worker) {
		this.worker = worker;
	}

	public String getWorkername() {
		return this.workername;
	}

	public void setWorkername(String workername) {
		this.workername = workername;
	}

	public String getJobtype() {
		return this.jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public String getPayer() {
		return this.payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public String getPayercard() {
		return this.payercard;
	}

	public void setPayercard(String payercard) {
		this.payercard = payercard;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPaydate() {
		return this.paydate;
	}

	public void setPaydate(Date paydate) {
		this.paydate = paydate;
	}

	public Double getSalary() {
		return this.salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getBankname() {
		return this.bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getCardno() {
		return this.cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Double getTotalsalary() {
		return this.totalsalary;
	}

	public void setTotalsalary(Double totalsalary) {
		this.totalsalary = totalsalary;
	}

	public Double getRestsalary() {
		return this.restsalary;
	}

	public void setRestsalary(Double restsalary) {
		this.restsalary = restsalary;
	}

	public String getStartdate() {
		return this.startdate;
	}

	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}

	public String getEnddate() {
		return this.enddate;
	}

	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}

	public String getPaymonth() {
		return this.paymonth;
	}

	public void setPaymonth(String paymonth) {
		this.paymonth = paymonth;
	}

	public String getOuttradeno() {
		return this.outtradeno;
	}

	public void setOuttradeno(String outtradeno) {
		this.outtradeno = outtradeno;
	}

	public String getOrderno() {
		return this.orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public String getPaysernumber() {
		return this.paysernumber;
	}

	public void setPaysernumber(String paysernumber) {
		this.paysernumber = paysernumber;
	}

	public String getBatchno() {
		return this.batchno;
	}

	public void setBatchno(String batchno) {
		this.batchno = batchno;
	}

	public String getIsrec() {
		return this.isrec;
	}

	public void setIsrec(String isrec) {
		this.isrec = isrec;
	}

	public Double getApplysalary() {
		return this.applysalary;
	}

	public void setApplysalary(Double applysalary) {
		this.applysalary = applysalary;
	}

}
