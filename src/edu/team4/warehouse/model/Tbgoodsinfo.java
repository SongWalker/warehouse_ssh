package edu.team4.warehouse.model;

/**
 * Tbgoodsinfo entity. @author MyEclipse Persistence Tools
 */

public class Tbgoodsinfo implements java.io.Serializable {

	// Fields

	private Integer GId;
	private Integer gtId;
	private String GNo;
	private String GGtname;
	private String GName;
	private String GShname;
	private String GOrigin;
	private String GUnit;
	private String GStandard;
	private String GPack;
	private String GBnumber;
	private String GNumber;
	private String GRemark;
	private String GSname;
	private Integer GState;

	// Constructors

	/** default constructor */
	public Tbgoodsinfo() {
	}

	/** minimal constructor */
	public Tbgoodsinfo(String GNo, String GGtname, String GName, String GUnit,
			String GStandard, Integer GState) {
		this.GNo = GNo;
		this.GGtname = GGtname;
		this.GName = GName;
		this.GUnit = GUnit;
		this.GStandard = GStandard;
		this.GState = GState;
	}

	/** full constructor */
	public Tbgoodsinfo(Integer gtId, String GNo, String GGtname, String GName,
			String GShname, String GOrigin, String GUnit, String GStandard,
			String GPack, String GBnumber, String GNumber, String GRemark,
			String GSname, Integer GState) {
		this.gtId = gtId;
		this.GNo = GNo;
		this.GGtname = GGtname;
		this.GName = GName;
		this.GShname = GShname;
		this.GOrigin = GOrigin;
		this.GUnit = GUnit;
		this.GStandard = GStandard;
		this.GPack = GPack;
		this.GBnumber = GBnumber;
		this.GNumber = GNumber;
		this.GRemark = GRemark;
		this.GSname = GSname;
		this.GState = GState;
	}

	// Property accessors

	public Integer getGId() {
		return this.GId;
	}

	public void setGId(Integer GId) {
		this.GId = GId;
	}

	public Integer getGtId() {
		return this.gtId;
	}

	public void setGtId(Integer gtId) {
		this.gtId = gtId;
	}

	public String getGNo() {
		return this.GNo;
	}

	public void setGNo(String GNo) {
		this.GNo = GNo;
	}

	public String getGGtname() {
		return this.GGtname;
	}

	public void setGGtname(String GGtname) {
		this.GGtname = GGtname;
	}

	public String getGName() {
		return this.GName;
	}

	public void setGName(String GName) {
		this.GName = GName;
	}

	public String getGShname() {
		return this.GShname;
	}

	public void setGShname(String GShname) {
		this.GShname = GShname;
	}

	public String getGOrigin() {
		return this.GOrigin;
	}

	public void setGOrigin(String GOrigin) {
		this.GOrigin = GOrigin;
	}

	public String getGUnit() {
		return this.GUnit;
	}

	public void setGUnit(String GUnit) {
		this.GUnit = GUnit;
	}

	public String getGStandard() {
		return this.GStandard;
	}

	public void setGStandard(String GStandard) {
		this.GStandard = GStandard;
	}

	public String getGPack() {
		return this.GPack;
	}

	public void setGPack(String GPack) {
		this.GPack = GPack;
	}

	public String getGBnumber() {
		return this.GBnumber;
	}

	public void setGBnumber(String GBnumber) {
		this.GBnumber = GBnumber;
	}

	public String getGNumber() {
		return this.GNumber;
	}

	public void setGNumber(String GNumber) {
		this.GNumber = GNumber;
	}

	public String getGRemark() {
		return this.GRemark;
	}

	public void setGRemark(String GRemark) {
		this.GRemark = GRemark;
	}

	public String getGSname() {
		return this.GSname;
	}

	public void setGSname(String GSname) {
		this.GSname = GSname;
	}

	public Integer getGState() {
		return this.GState;
	}

	public void setGState(Integer GState) {
		this.GState = GState;
	}

}