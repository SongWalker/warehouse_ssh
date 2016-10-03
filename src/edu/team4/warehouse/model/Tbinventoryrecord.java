package edu.team4.warehouse.model;

import java.sql.Timestamp;

/**
 * Tbinventoryrecord entity. @author MyEclipse Persistence Tools
 */

public class Tbinventoryrecord implements java.io.Serializable {

	// Fields

	private Integer idId;
	private Integer IId;
	private String idNo;
	private String idGname;
	private String idUnit;
	private Integer idNum;
	private Timestamp idDate;
	private String idDes;
	private Integer idState;

	// Constructors

	/** default constructor */
	public Tbinventoryrecord() {
	}

	/** minimal constructor */
	public Tbinventoryrecord(String idNo, String idGname, String idUnit,
			Integer idNum, Timestamp idDate, Integer idState) {
		this.idNo = idNo;
		this.idGname = idGname;
		this.idUnit = idUnit;
		this.idNum = idNum;
		this.idDate = idDate;
		this.idState = idState;
	}

	/** full constructor */
	public Tbinventoryrecord(Integer IId, String idNo, String idGname,
			String idUnit, Integer idNum, Timestamp idDate, String idDes,
			Integer idState) {
		this.IId = IId;
		this.idNo = idNo;
		this.idGname = idGname;
		this.idUnit = idUnit;
		this.idNum = idNum;
		this.idDate = idDate;
		this.idDes = idDes;
		this.idState = idState;
	}

	// Property accessors

	public Integer getIdId() {
		return this.idId;
	}

	public void setIdId(Integer idId) {
		this.idId = idId;
	}

	public Integer getIId() {
		return this.IId;
	}

	public void setIId(Integer IId) {
		this.IId = IId;
	}

	public String getIdNo() {
		return this.idNo;
	}

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdGname() {
		return this.idGname;
	}

	public void setIdGname(String idGname) {
		this.idGname = idGname;
	}

	public String getIdUnit() {
		return this.idUnit;
	}

	public void setIdUnit(String idUnit) {
		this.idUnit = idUnit;
	}

	public Integer getIdNum() {
		return this.idNum;
	}

	public void setIdNum(Integer idNum) {
		this.idNum = idNum;
	}

	public Timestamp getIdDate() {
		return this.idDate;
	}

	public void setIdDate(Timestamp idDate) {
		this.idDate = idDate;
	}

	public String getIdDes() {
		return this.idDes;
	}

	public void setIdDes(String idDes) {
		this.idDes = idDes;
	}

	public Integer getIdState() {
		return this.idState;
	}

	public void setIdState(Integer idState) {
		this.idState = idState;
	}

}