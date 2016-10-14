package edu.team4.warehouse.model;

/**
 * Tbstoredetail entity. @author MyEclipse Persistence Tools
 */

public class Tbstoredetail implements java.io.Serializable {

	// Fields

	private Integer sdId;
	private Integer smIds;
	private String sdNo;
	private String sdGid;
	private Float sdUprice;
	private Integer sdNumber;
	private Integer sdState;

	// Constructors

	/** default constructor */
	public Tbstoredetail() {
	}

	/** full constructor */
	public Tbstoredetail(Integer smIds, String sdNo, String sdGid,
			Float sdUprice, Integer sdNumber, Integer sdState) {
		this.smIds = smIds;
		this.sdNo = sdNo;
		this.sdGid = sdGid;
		this.sdUprice = sdUprice;
		this.sdNumber = sdNumber;
		this.sdState = sdState;
	}

	// Property accessors

	public Integer getSdId() {
		return this.sdId;
	}

	public void setSdId(Integer sdId) {
		this.sdId = sdId;
	}

	public Integer getSmIds() {
		return this.smIds;
	}

	public void setSmIds(Integer smIds) {
		this.smIds = smIds;
	}

	public String getSdNo() {
		return this.sdNo;
	}

	public void setSdNo(String sdNo) {
		this.sdNo = sdNo;
	}

	public String getSdGid() {
		return this.sdGid;
	}

	public void setSdGid(String sdGid) {
		this.sdGid = sdGid;
	}

	public Float getSdUprice() {
		return this.sdUprice;
	}

	public void setSdUprice(Float sdUprice) {
		this.sdUprice = sdUprice;
	}

	public Integer getSdNumber() {
		return this.sdNumber;
	}

	public void setSdNumber(Integer sdNumber) {
		this.sdNumber = sdNumber;
	}

	public Integer getSdState() {
		return this.sdState;
	}

	public void setSdState(Integer sdState) {
		this.sdState = sdState;
	}

}