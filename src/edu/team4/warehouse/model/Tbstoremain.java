package edu.team4.warehouse.model;

import java.util.Date;

/**
 * Tbstoremain entity. @author MyEclipse Persistence Tools
 */

public class Tbstoremain implements java.io.Serializable {

	// Fields

	private Integer smIds;
	private Integer SId;
	private String smNo;
	private Float smSum;
	private String smReceive;
	private String smSname;
	private Date smStdate;
	private String smUser;
	private String smCalculate;
	private Integer smState;

	// Constructors

	/** default constructor */
	public Tbstoremain() {
	}

	/** full constructor */
	public Tbstoremain(Integer SId, String smNo, Float smSum, String smReceive,
			String smSname, Date smStdate, String smUser, String smCalculate,
			Integer smState) {
		this.SId = SId;
		this.smNo = smNo;
		this.smSum = smSum;
		this.smReceive = smReceive;
		this.smSname = smSname;
		this.smStdate = smStdate;
		this.smUser = smUser;
		this.smCalculate = smCalculate;
		this.smState = smState;
	}

	// Property accessors

	public Integer getSmIds() {
		return this.smIds;
	}

	public void setSmIds(Integer smIds) {
		this.smIds = smIds;
	}

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public String getSmNo() {
		return this.smNo;
	}

	public void setSmNo(String smNo) {
		this.smNo = smNo;
	}

	public Float getSmSum() {
		return this.smSum;
	}

	public void setSmSum(Float smSum) {
		this.smSum = smSum;
	}

	public String getSmReceive() {
		return this.smReceive;
	}

	public void setSmReceive(String smReceive) {
		this.smReceive = smReceive;
	}

	public String getSmSname() {
		return this.smSname;
	}

	public void setSmSname(String smSname) {
		this.smSname = smSname;
	}

	public Date getSmStdate() {
		return this.smStdate;
	}

	public void setSmStdate(Date smStdate) {
		this.smStdate = smStdate;
	}

	public String getSmUser() {
		return this.smUser;
	}

	public void setSmUser(String smUser) {
		this.smUser = smUser;
	}

	public String getSmCalculate() {
		return this.smCalculate;
	}

	public void setSmCalculate(String smCalculate) {
		this.smCalculate = smCalculate;
	}

	public Integer getSmState() {
		return this.smState;
	}

	public void setSmState(Integer smState) {
		this.smState = smState;
	}

}