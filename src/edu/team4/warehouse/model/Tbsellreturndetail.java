package edu.team4.warehouse.model;

/**
 * Tbsellreturndetail entity. @author MyEclipse Persistence Tools
 */

public class Tbsellreturndetail implements java.io.Serializable {

	// Fields

	private Integer srdId;
	private Integer srmId;
	private String srdNo;
	private String srdGid;
	private Float srdUprice;
	private Integer srdNumber;
	private Integer srdState;

	// Constructors

	/** default constructor */
	public Tbsellreturndetail() {
	}

	/** minimal constructor */
	public Tbsellreturndetail(String srdNo, String srdGid, Float srdUprice,
			Integer srdNumber, Integer srdState) {
		this.srdNo = srdNo;
		this.srdGid = srdGid;
		this.srdUprice = srdUprice;
		this.srdNumber = srdNumber;
		this.srdState = srdState;
	}

	/** full constructor */
	public Tbsellreturndetail(Integer srmId, String srdNo, String srdGid,
			Float srdUprice, Integer srdNumber, Integer srdState) {
		this.srmId = srmId;
		this.srdNo = srdNo;
		this.srdGid = srdGid;
		this.srdUprice = srdUprice;
		this.srdNumber = srdNumber;
		this.srdState = srdState;
	}

	// Property accessors

	public Integer getSrdId() {
		return this.srdId;
	}

	public void setSrdId(Integer srdId) {
		this.srdId = srdId;
	}

	public Integer getSrmId() {
		return this.srmId;
	}

	public void setSrmId(Integer srmId) {
		this.srmId = srmId;
	}

	public String getSrdNo() {
		return this.srdNo;
	}

	public void setSrdNo(String srdNo) {
		this.srdNo = srdNo;
	}

	public String getSrdGid() {
		return this.srdGid;
	}

	public void setSrdGid(String srdGid) {
		this.srdGid = srdGid;
	}

	public Float getSrdUprice() {
		return this.srdUprice;
	}

	public void setSrdUprice(Float srdUprice) {
		this.srdUprice = srdUprice;
	}

	public Integer getSrdNumber() {
		return this.srdNumber;
	}

	public void setSrdNumber(Integer srdNumber) {
		this.srdNumber = srdNumber;
	}

	public Integer getSrdState() {
		return this.srdState;
	}

	public void setSrdState(Integer srdState) {
		this.srdState = srdState;
	}

}