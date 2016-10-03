package edu.team4.warehouse.model;

/**
 * Tbinventory entity. @author MyEclipse Persistence Tools
 */

public class Tbinventory implements java.io.Serializable {

	// Fields

	private Integer IId;
	private String INo;
	private String IGname;
	private String ISname;
	private String IOrigin;
	private String IStandard;
	private String IPack;
	private String IUnit;
	private Float IUprice;
	private Integer INumber;
	private Integer IState;

	// Constructors

	/** default constructor */
	public Tbinventory() {
	}

	/** minimal constructor */
	public Tbinventory(String INo, String IGname, Integer IState) {
		this.INo = INo;
		this.IGname = IGname;
		this.IState = IState;
	}

	/** full constructor */
	public Tbinventory(String INo, String IGname, String ISname,
			String IOrigin, String IStandard, String IPack, String IUnit,
			Float IUprice, Integer INumber, Integer IState) {
		this.INo = INo;
		this.IGname = IGname;
		this.ISname = ISname;
		this.IOrigin = IOrigin;
		this.IStandard = IStandard;
		this.IPack = IPack;
		this.IUnit = IUnit;
		this.IUprice = IUprice;
		this.INumber = INumber;
		this.IState = IState;
	}

	// Property accessors

	public Integer getIId() {
		return this.IId;
	}

	public void setIId(Integer IId) {
		this.IId = IId;
	}

	public String getINo() {
		return this.INo;
	}

	public void setINo(String INo) {
		this.INo = INo;
	}

	public String getIGname() {
		return this.IGname;
	}

	public void setIGname(String IGname) {
		this.IGname = IGname;
	}

	public String getISname() {
		return this.ISname;
	}

	public void setISname(String ISname) {
		this.ISname = ISname;
	}

	public String getIOrigin() {
		return this.IOrigin;
	}

	public void setIOrigin(String IOrigin) {
		this.IOrigin = IOrigin;
	}

	public String getIStandard() {
		return this.IStandard;
	}

	public void setIStandard(String IStandard) {
		this.IStandard = IStandard;
	}

	public String getIPack() {
		return this.IPack;
	}

	public void setIPack(String IPack) {
		this.IPack = IPack;
	}

	public String getIUnit() {
		return this.IUnit;
	}

	public void setIUnit(String IUnit) {
		this.IUnit = IUnit;
	}

	public Float getIUprice() {
		return this.IUprice;
	}

	public void setIUprice(Float IUprice) {
		this.IUprice = IUprice;
	}

	public Integer getINumber() {
		return this.INumber;
	}

	public void setINumber(Integer INumber) {
		this.INumber = INumber;
	}

	public Integer getIState() {
		return this.IState;
	}

	public void setIState(Integer IState) {
		this.IState = IState;
	}

}