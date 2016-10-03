package edu.team4.warehouse.model;

/**
 * Tbuser entity. @author MyEclipse Persistence Tools
 */

public class Tbuser implements java.io.Serializable {

	// Fields

	private Integer UId;
	private String UUid;
	private String UPass;
	private String UName;
	private Integer USex;
	private Integer UAge;
	private String UTel;
	private Integer UState;

	// Constructors

	/** default constructor */
	public Tbuser() {
	}

	/** minimal constructor */
	public Tbuser(String UUid, String UPass, String UName, Integer UState) {
		this.UUid = UUid;
		this.UPass = UPass;
		this.UName = UName;
		this.UState = UState;
	}

	/** full constructor */
	public Tbuser(String UUid, String UPass, String UName, Integer USex,
			Integer UAge, String UTel, Integer UState) {
		this.UUid = UUid;
		this.UPass = UPass;
		this.UName = UName;
		this.USex = USex;
		this.UAge = UAge;
		this.UTel = UTel;
		this.UState = UState;
	}

	// Property accessors

	public Integer getUId() {
		return this.UId;
	}

	public void setUId(Integer UId) {
		this.UId = UId;
	}

	public String getUUid() {
		return this.UUid;
	}

	public void setUUid(String UUid) {
		this.UUid = UUid;
	}

	public String getUPass() {
		return this.UPass;
	}

	public void setUPass(String UPass) {
		this.UPass = UPass;
	}

	public String getUName() {
		return this.UName;
	}

	public void setUName(String UName) {
		this.UName = UName;
	}

	public Integer getUSex() {
		return this.USex;
	}

	public void setUSex(Integer USex) {
		this.USex = USex;
	}

	public Integer getUAge() {
		return this.UAge;
	}

	public void setUAge(Integer UAge) {
		this.UAge = UAge;
	}

	public String getUTel() {
		return this.UTel;
	}

	public void setUTel(String UTel) {
		this.UTel = UTel;
	}

	public Integer getUState() {
		return this.UState;
	}

	public void setUState(Integer UState) {
		this.UState = UState;
	}

}