package edu.team4.warehouse.model;

/**
 * Tbgoodstype entity. @author MyEclipse Persistence Tools
 */

public class Tbgoodstype implements java.io.Serializable {

	// Fields

	private Integer gtId;
	private String gtName;
	private String gtDes;
	private Integer gtState;

	// Constructors

	/** default constructor */
	public Tbgoodstype() {
	}

	/** minimal constructor */
	public Tbgoodstype(String gtName, Integer gtState) {
		this.gtName = gtName;
		this.gtState = gtState;
	}

	/** full constructor */
	public Tbgoodstype(String gtName, String gtDes, Integer gtState) {
		this.gtName = gtName;
		this.gtDes = gtDes;
		this.gtState = gtState;
	}

	// Property accessors

	public Integer getGtId() {
		return this.gtId;
	}

	public void setGtId(Integer gtId) {
		this.gtId = gtId;
	}

	public String getGtName() {
		return this.gtName;
	}

	public void setGtName(String gtName) {
		this.gtName = gtName;
	}

	public String getGtDes() {
		return this.gtDes;
	}

	public void setGtDes(String gtDes) {
		this.gtDes = gtDes;
	}

	public Integer getGtState() {
		return this.gtState;
	}

	public void setGtState(Integer gtState) {
		this.gtState = gtState;
	}

}