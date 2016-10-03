package edu.team4.warehouse.model;

/**
 * Tbsupplier entity. @author MyEclipse Persistence Tools
 */

public class Tbsupplier implements java.io.Serializable {

	// Fields

	private Integer SId;
	private String SName;
	private String SSname;
	private String SAddress;
	private String SPostcode;
	private String STel;
	private String SFax;
	private String SContacts;
	private String SCtel;
	private String SBank;
	private String SEmail;
	private Integer SState;

	// Constructors

	/** default constructor */
	public Tbsupplier() {
	}

	/** minimal constructor */
	public Tbsupplier(Integer SState) {
		this.SState = SState;
	}

	/** full constructor */
	public Tbsupplier(String SName, String SSname, String SAddress,
			String SPostcode, String STel, String SFax, String SContacts,
			String SCtel, String SBank, String SEmail, Integer SState) {
		this.SName = SName;
		this.SSname = SSname;
		this.SAddress = SAddress;
		this.SPostcode = SPostcode;
		this.STel = STel;
		this.SFax = SFax;
		this.SContacts = SContacts;
		this.SCtel = SCtel;
		this.SBank = SBank;
		this.SEmail = SEmail;
		this.SState = SState;
	}

	// Property accessors

	public Integer getSId() {
		return this.SId;
	}

	public void setSId(Integer SId) {
		this.SId = SId;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	public String getSSname() {
		return this.SSname;
	}

	public void setSSname(String SSname) {
		this.SSname = SSname;
	}

	public String getSAddress() {
		return this.SAddress;
	}

	public void setSAddress(String SAddress) {
		this.SAddress = SAddress;
	}

	public String getSPostcode() {
		return this.SPostcode;
	}

	public void setSPostcode(String SPostcode) {
		this.SPostcode = SPostcode;
	}

	public String getSTel() {
		return this.STel;
	}

	public void setSTel(String STel) {
		this.STel = STel;
	}

	public String getSFax() {
		return this.SFax;
	}

	public void setSFax(String SFax) {
		this.SFax = SFax;
	}

	public String getSContacts() {
		return this.SContacts;
	}

	public void setSContacts(String SContacts) {
		this.SContacts = SContacts;
	}

	public String getSCtel() {
		return this.SCtel;
	}

	public void setSCtel(String SCtel) {
		this.SCtel = SCtel;
	}

	public String getSBank() {
		return this.SBank;
	}

	public void setSBank(String SBank) {
		this.SBank = SBank;
	}

	public String getSEmail() {
		return this.SEmail;
	}

	public void setSEmail(String SEmail) {
		this.SEmail = SEmail;
	}

	public Integer getSState() {
		return this.SState;
	}

	public void setSState(Integer SState) {
		this.SState = SState;
	}

}