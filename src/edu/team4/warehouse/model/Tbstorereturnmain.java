package edu.team4.warehouse.model;

import java.util.Date;

/**
 * Tbstorereturnmain entity. @author MyEclipse Persistence Tools
 */

public class Tbstorereturnmain implements java.io.Serializable {

	// Fields

	private Integer rmId;
	private Integer SId;
	private String rmNo;
	private Float rmSum;
	private String rmReceive;
	private String rmSname;
	private Date rmRedate;
	private String rmUser;
	private String rmCalculate;
	private Integer rmState;

	// Constructors

	/** default constructor */
	public Tbstorereturnmain() {
	}

	/** minimal constructor */
	public Tbstorereturnmain(String rmNo, Float rmSum, String rmSname,
			Date rmRedate, String rmUser, String rmCalculate, Integer rmState) {
		this.rmNo = rmNo;
		this.rmSum = rmSum;
		this.rmSname = rmSname;
		this.rmRedate = rmRedate;
		this.rmUser = rmUser;
		this.rmCalculate = rmCalculate;
		this.rmState = rmState;
	}

	/** full constructor */
	public Tbstorereturnmain(Integer SId, String rmNo, Float rmSum,
			String rmReceive, String rmSname, Date rmRedate, String rmUser,
			String rmCalculate, Integer rmState) {
		this.SId = SId;
		this.rmNo = rmNo;
		this.rmSum = rmSum;
		this.rmReceive = rmReceive;
		this.rmSname = rmSname;
		this.rmRedate = rmRedate;
		this.rmUser = rmUser;
		this.rmCalculate = rmCalculate;
		this.rmState = rmState;
	}

	// Property accessors

	public Integer getRmId() {
		return this.rmId;
	}

	public void setRmId(Integer rmId) {
		this.rmId = rmId;
	}

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public String getRmNo() {
		return this.rmNo;
	}

	public void setRmNo(String rmNo) {
		this.rmNo = rmNo;
	}

	public Float getRmSum() {
		return this.rmSum;
	}

	public void setRmSum(Float rmSum) {
		this.rmSum = rmSum;
	}

	public String getRmReceive() {
		return this.rmReceive;
	}

	public void setRmReceive(String rmReceive) {
		this.rmReceive = rmReceive;
	}

	public String getRmSname() {
		return this.rmSname;
	}

	public void setRmSname(String rmSname) {
		this.rmSname = rmSname;
	}

	public Date getRmRedate() {
		return this.rmRedate;
	}

	public void setRmRedate(Date rmRedate) {
		this.rmRedate = rmRedate;
	}

	public String getRmUser() {
		return this.rmUser;
	}

	public void setRmUser(String rmUser) {
		this.rmUser = rmUser;
	}

	public String getRmCalculate() {
		return this.rmCalculate;
	}

	public void setRmCalculate(String rmCalculate) {
		this.rmCalculate = rmCalculate;
	}

	public Integer getRmState() {
		return this.rmState;
	}

	public void setRmState(Integer rmState) {
		this.rmState = rmState;
	}

}