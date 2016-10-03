package edu.team4.warehouse.model;

import java.sql.Timestamp;

/**
 * Tbsellreturnmain entity. @author MyEclipse Persistence Tools
 */

public class Tbsellreturnmain implements java.io.Serializable {

	// Fields

	private Integer srmId;
	private String srmNo;
	private Float srmSum;
	private String srmReceive;
	private String srmCname;
	private Timestamp srmDate;
	private String srmUser;
	private String srmCalculate;
	private Integer srmState;

	// Constructors

	/** default constructor */
	public Tbsellreturnmain() {
	}

	/** minimal constructor */
	public Tbsellreturnmain(String srmNo, Float srmSum, String srmCname,
			Timestamp srmDate, String srmUser, String srmCalculate,
			Integer srmState) {
		this.srmNo = srmNo;
		this.srmSum = srmSum;
		this.srmCname = srmCname;
		this.srmDate = srmDate;
		this.srmUser = srmUser;
		this.srmCalculate = srmCalculate;
		this.srmState = srmState;
	}

	/** full constructor */
	public Tbsellreturnmain(String srmNo, Float srmSum, String srmReceive,
			String srmCname, Timestamp srmDate, String srmUser,
			String srmCalculate, Integer srmState) {
		this.srmNo = srmNo;
		this.srmSum = srmSum;
		this.srmReceive = srmReceive;
		this.srmCname = srmCname;
		this.srmDate = srmDate;
		this.srmUser = srmUser;
		this.srmCalculate = srmCalculate;
		this.srmState = srmState;
	}

	// Property accessors

	public Integer getSrmId() {
		return this.srmId;
	}

	public void setSrmId(Integer srmId) {
		this.srmId = srmId;
	}

	public String getSrmNo() {
		return this.srmNo;
	}

	public void setSrmNo(String srmNo) {
		this.srmNo = srmNo;
	}

	public Float getSrmSum() {
		return this.srmSum;
	}

	public void setSrmSum(Float srmSum) {
		this.srmSum = srmSum;
	}

	public String getSrmReceive() {
		return this.srmReceive;
	}

	public void setSrmReceive(String srmReceive) {
		this.srmReceive = srmReceive;
	}

	public String getSrmCname() {
		return this.srmCname;
	}

	public void setSrmCname(String srmCname) {
		this.srmCname = srmCname;
	}

	public Timestamp getSrmDate() {
		return this.srmDate;
	}

	public void setSrmDate(Timestamp srmDate) {
		this.srmDate = srmDate;
	}

	public String getSrmUser() {
		return this.srmUser;
	}

	public void setSrmUser(String srmUser) {
		this.srmUser = srmUser;
	}

	public String getSrmCalculate() {
		return this.srmCalculate;
	}

	public void setSrmCalculate(String srmCalculate) {
		this.srmCalculate = srmCalculate;
	}

	public Integer getSrmState() {
		return this.srmState;
	}

	public void setSrmState(Integer srmState) {
		this.srmState = srmState;
	}

}