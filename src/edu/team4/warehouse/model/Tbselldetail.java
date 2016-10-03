package edu.team4.warehouse.model;

/**
 * Tbselldetail entity. @author MyEclipse Persistence Tools
 */

public class Tbselldetail implements java.io.Serializable {

	// Fields

	private Integer sedId;
	private Integer semId;
	private String sedNo;
	private String sedGid;
	private Float sedUprice;
	private Integer sedNumber;
	private Integer sedState;

	// Constructors

	/** default constructor */
	public Tbselldetail() {
	}

	/** minimal constructor */
	public Tbselldetail(String sedNo, String sedGid, Float sedUprice,
			Integer sedNumber, Integer sedState) {
		this.sedNo = sedNo;
		this.sedGid = sedGid;
		this.sedUprice = sedUprice;
		this.sedNumber = sedNumber;
		this.sedState = sedState;
	}

	/** full constructor */
	public Tbselldetail(Integer semId, String sedNo, String sedGid,
			Float sedUprice, Integer sedNumber, Integer sedState) {
		this.semId = semId;
		this.sedNo = sedNo;
		this.sedGid = sedGid;
		this.sedUprice = sedUprice;
		this.sedNumber = sedNumber;
		this.sedState = sedState;
	}

	// Property accessors

	public Integer getSedId() {
		return this.sedId;
	}

	public void setSedId(Integer sedId) {
		this.sedId = sedId;
	}

	public Integer getSemId() {
		return this.semId;
	}

	public void setSemId(Integer semId) {
		this.semId = semId;
	}

	public String getSedNo() {
		return this.sedNo;
	}

	public void setSedNo(String sedNo) {
		this.sedNo = sedNo;
	}

	public String getSedGid() {
		return this.sedGid;
	}

	public void setSedGid(String sedGid) {
		this.sedGid = sedGid;
	}

	public Float getSedUprice() {
		return this.sedUprice;
	}

	public void setSedUprice(Float sedUprice) {
		this.sedUprice = sedUprice;
	}

	public Integer getSedNumber() {
		return this.sedNumber;
	}

	public void setSedNumber(Integer sedNumber) {
		this.sedNumber = sedNumber;
	}

	public Integer getSedState() {
		return this.sedState;
	}

	public void setSedState(Integer sedState) {
		this.sedState = sedState;
	}

}