package edu.team4.warehouse.model;

/**
 * Tbstorereturndetail entity. @author MyEclipse Persistence Tools
 */

public class Tbstorereturndetail implements java.io.Serializable {

	// Fields

	private Integer rdId;
	private Integer rmId;
	private String rdNo;
	private String rdGid;
	private Float rdUprice;
	private Integer rdNumber;
	private Integer rdState;

	// Constructors

	/** default constructor */
	public Tbstorereturndetail() {
	}

	/** minimal constructor */
	public Tbstorereturndetail(String rdNo, String rdGid, Float rdUprice,
			Integer rdNumber, Integer rdState) {
		this.rdNo = rdNo;
		this.rdGid = rdGid;
		this.rdUprice = rdUprice;
		this.rdNumber = rdNumber;
		this.rdState = rdState;
	}

	/** full constructor */
	public Tbstorereturndetail(Integer rmId, String rdNo, String rdGid,
			Float rdUprice, Integer rdNumber, Integer rdState) {
		this.rmId = rmId;
		this.rdNo = rdNo;
		this.rdGid = rdGid;
		this.rdUprice = rdUprice;
		this.rdNumber = rdNumber;
		this.rdState = rdState;
	}

	// Property accessors

	public Integer getRdId() {
		return this.rdId;
	}

	public void setRdId(Integer rdId) {
		this.rdId = rdId;
	}

	public Integer getRmId() {
		return this.rmId;
	}

	public void setRmId(Integer rmId) {
		this.rmId = rmId;
	}

	public String getRdNo() {
		return this.rdNo;
	}

	public void setRdNo(String rdNo) {
		this.rdNo = rdNo;
	}

	public String getRdGid() {
		return this.rdGid;
	}

	public void setRdGid(String rdGid) {
		this.rdGid = rdGid;
	}

	public Float getRdUprice() {
		return this.rdUprice;
	}

	public void setRdUprice(Float rdUprice) {
		this.rdUprice = rdUprice;
	}

	public Integer getRdNumber() {
		return this.rdNumber;
	}

	public void setRdNumber(Integer rdNumber) {
		this.rdNumber = rdNumber;
	}

	public Integer getRdState() {
		return this.rdState;
	}

	public void setRdState(Integer rdState) {
		this.rdState = rdState;
	}

}