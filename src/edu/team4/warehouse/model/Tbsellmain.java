package edu.team4.warehouse.model;

import java.sql.Timestamp;

/**
 * Tbsellmain entity. @author MyEclipse Persistence Tools
 */

public class Tbsellmain implements java.io.Serializable {

	// Fields

	private Integer semId;
	private String semNo;
	private Float semSum;
	private String semReceive;
	private String semSname;
	private Timestamp semDate;
	private String semUser;
	private String semCalculate;
	private Integer semState;

	// Constructors

	/** default constructor */
	public Tbsellmain() {
	}

	/** minimal constructor */
	public Tbsellmain(String semNo, Float semSum, String semSname,
			Timestamp semDate, String semUser, String semCalculate,
			Integer semState) {
		this.semNo = semNo;
		this.semSum = semSum;
		this.semSname = semSname;
		this.semDate = semDate;
		this.semUser = semUser;
		this.semCalculate = semCalculate;
		this.semState = semState;
	}

	/** full constructor */
	public Tbsellmain(String semNo, Float semSum, String semReceive,
			String semSname, Timestamp semDate, String semUser,
			String semCalculate, Integer semState) {
		this.semNo = semNo;
		this.semSum = semSum;
		this.semReceive = semReceive;
		this.semSname = semSname;
		this.semDate = semDate;
		this.semUser = semUser;
		this.semCalculate = semCalculate;
		this.semState = semState;
	}

	// Property accessors

	public Integer getSemId() {
		return this.semId;
	}

	public void setSemId(Integer semId) {
		this.semId = semId;
	}

	public String getSemNo() {
		return this.semNo;
	}

	public void setSemNo(String semNo) {
		this.semNo = semNo;
	}

	public Float getSemSum() {
		return this.semSum;
	}

	public void setSemSum(Float semSum) {
		this.semSum = semSum;
	}

	public String getSemReceive() {
		return this.semReceive;
	}

	public void setSemReceive(String semReceive) {
		this.semReceive = semReceive;
	}

	public String getSemSname() {
		return this.semSname;
	}

	public void setSemSname(String semSname) {
		this.semSname = semSname;
	}

	public Timestamp getSemDate() {
		return this.semDate;
	}

	public void setSemDate(Timestamp semDate) {
		this.semDate = semDate;
	}

	public String getSemUser() {
		return this.semUser;
	}

	public void setSemUser(String semUser) {
		this.semUser = semUser;
	}

	public String getSemCalculate() {
		return this.semCalculate;
	}

	public void setSemCalculate(String semCalculate) {
		this.semCalculate = semCalculate;
	}

	public Integer getSemState() {
		return this.semState;
	}

	public void setSemState(Integer semState) {
		this.semState = semState;
	}

}