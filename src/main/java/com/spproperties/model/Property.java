package com.spproperties.model;
import java.util.Date;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;
@Entity
@Table
public class Property {
	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public Date getEntryDt() {
		return entryDt;
	}

	public void setEntryDt(Date entryDt) {
		this.entryDt = entryDt;
	}

	public Date getModDt() {
		return modDt;
	}

	public void setModDt(Date modDt) {
		this.modDt = modDt;
	}

	public Integer getpCost() {
		return pCost;
	}

	public void setpCost(Integer pCost) {
		this.pCost = pCost;
	}

	public Integer getAdvance() {
		return advance;
	}

	public void setAdvance(Integer advance) {
		this.advance = advance;
	}

	public Integer getKharchaCommission() {
		return kharchaCommission;
	}

	public void setKharchaCommission(Integer kharchaCommission) {
		this.kharchaCommission = kharchaCommission;
	}

	public Date getTimeAllotted() {
		return TimeAllotted;
	}

	public void setTimeAllotted(Date timeAllotted) {
		TimeAllotted = timeAllotted;
	}

	public Date getTimeRemaining() {
		return TimeRemaining;
	}

	public void setTimeRemaining(Date timeRemaining) {
		TimeRemaining = timeRemaining;
	}

	public Integer getRemainingCost() {
		return remainingCost;
	}

	public void setRemainingCost(Integer remainingCost) {
		this.remainingCost = remainingCost;
	}

	public Integer getTotalCost() {
		return TotalCost;
	}

	public void setTotalCost(Integer totalCost) {
		TotalCost = totalCost;
	}

	public String getPropSize() {
		return propSize;
	}

	public void setPropSize(String propSize) {
		this.propSize = propSize;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Id
	@Column
	private Integer pId;
	
	@Column
	private String pName;
	
	@Column
	private Date entryDt;
	
	@Column
	private Date modDt;
	
	@Column
	private Integer pCost;
	
	@Column
	private Integer advance;
	
	@Column
	private Integer kharchaCommission;
	
	@Column
	private Date TimeAllotted;
	
	@Column
	private Date TimeRemaining;
	
	@Column
	private Integer remainingCost;
	
	@Column
	private Integer TotalCost;
	
	@Column
	private String propSize;
	
	@Column
	private String status;
	
	
	
	
	
	

}
