package edu.team4.warehouse.model;

/**
 * Tbclient entity. @author MyEclipse Persistence Tools
 */

public class Tbclient implements java.io.Serializable {

	// Fields

	private Integer CId;
	private String CName;
	private String CSname;
	private String CAddress;
	private String CPostcode;
	private String CFax;
	private String CContacts;
	private String CCtel;
	private String CEmail;
	private String CBank;
	private String CBaccount;
	private Integer CState;

	// Constructors

	/** default constructor */
	public Tbclient() {
	}

	/** minimal constructor */
	public Tbclient(String CName, Integer CState) {
		this.CName = CName;
		this.CState = CState;
	}

	/** full constructor */
	public Tbclient(String CName, String CSname, String CAddress,
			String CPostcode, String CFax, String CContacts, String CCtel,
			String CEmail, String CBank, String CBaccount, Integer CState) {
		this.CName = CName;
		this.CSname = CSname;
		this.CAddress = CAddress;
		this.CPostcode = CPostcode;
		this.CFax = CFax;
		this.CContacts = CContacts;
		this.CCtel = CCtel;
		this.CEmail = CEmail;
		this.CBank = CBank;
		this.CBaccount = CBaccount;
		this.CState = CState;
	}

	// Property accessors

	public Integer getCId() {
		return this.CId;
	}

	public void setCId(Integer CId) {
		this.CId = CId;
	}

	public String getCName() {
		return this.CName;
	}

	public void setCName(String CName) {
		this.CName = CName;
	}

	public String getCSname() {
		return this.CSname;
	}

	public void setCSname(String CSname) {
		this.CSname = CSname;
	}

	public String getCAddress() {
		return this.CAddress;
	}

	public void setCAddress(String CAddress) {
		this.CAddress = CAddress;
	}

	public String getCPostcode() {
		return this.CPostcode;
	}

	public void setCPostcode(String CPostcode) {
		this.CPostcode = CPostcode;
	}

	public String getCFax() {
		return this.CFax;
	}

	public void setCFax(String CFax) {
		this.CFax = CFax;
	}

	public String getCContacts() {
		return this.CContacts;
	}

	public void setCContacts(String CContacts) {
		this.CContacts = CContacts;
	}

	public String getCCtel() {
		return this.CCtel;
	}

	public void setCCtel(String CCtel) {
		this.CCtel = CCtel;
	}

	public String getCEmail() {
		return this.CEmail;
	}

	public void setCEmail(String CEmail) {
		this.CEmail = CEmail;
	}

	public String getCBank() {
		return this.CBank;
	}

	public void setCBank(String CBank) {
		this.CBank = CBank;
	}

	public String getCBaccount() {
		return this.CBaccount;
	}

	public void setCBaccount(String CBaccount) {
		this.CBaccount = CBaccount;
	}

	public Integer getCState() {
		return this.CState;
	}

	public void setCState(Integer CState) {
		this.CState = CState;
	}

}