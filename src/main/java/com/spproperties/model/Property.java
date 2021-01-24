package com.spproperties.model;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table /* (name="spproperties.PROPERTY") */
public class Property {
	@Id
	@Column /* (name = "PID") */
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pId;
	
	@Column /* (name = "PNAME") */
	private String pName;
	
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


	public LocalDateTime getEntryDt() {
		return entryDt;
	}


	public void setEntryDt(LocalDateTime entryDt) {
		this.entryDt = entryDt;
	}


	public LocalDateTime getModDt() {
		return modDt;
	}


	public void setModDt(LocalDateTime modDt) {
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


	public Integer getCommission() {
		return commission;
	}


	public void setCommission(Integer commission) {
		this.commission = commission;
	}


	public Date getTimeAllotted() {
		return TimeAllotted;
	}


	public void setTimeAllotted(Date timeAllotted) {
		TimeAllotted = timeAllotted;
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


	public Integer getDepositamount() {
		return depositamount;
	}


	public void setDepositamount(Integer depositamount) {
		this.depositamount = depositamount;
	}


	@Column /* (name = "ENTRY_DT") */
	private LocalDateTime entryDt;
	
	@Column /* (name = "MOD_DT") */
	private LocalDateTime modDt;
	
	@Column /* (name = "PCOST") */
	private Integer pCost;
	
	@Column /* (name = "ADVANCE") */
	private Integer advance;
	
	@Column /* (name = "COMMISSION") */
	private Integer commission;
	
	@Column /* (name = "TIME_ALLOTED") */
	private Date TimeAllotted;
	
	
	@Column /* (name = "TOTAL_COST") */
	private Integer TotalCost;
	
	@Column /* (name = "PROPERTY_SIZE") */
	private String propSize;
	
	
	@Column /* (name = "DEPOSIT_AMOUNT") */
	private Integer depositamount;
	
	
}