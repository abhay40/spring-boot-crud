package com.spproperties.model;
import java.util.Date;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;
@Entity
@Table(name="spproperties.PROPERTY")
public class Property {
	@Id
	@Column(name = "PID")
	private Integer pId;
	
	@Column(name = "PNAME ")
	private String pName;
	
	@Column(name = "ENTRY_DT")
	private Date entryDt;
	
	@Column(name = "MOD_DT")
	private Date modDt;
	
	@Column(name = "PCOST")
	private Integer pCost;
	
	@Column(name = "ADVANCE")
	private Integer advance;
	
	@Column(name = "COMMISSION")
	private Integer commission;
	
	@Column(name = "TIME_ALLOTED")
	private Date TimeAllotted;
	
	
	@Column(name = "TOTAL_COST")
	private Integer TotalCost;
	
	@Column(name = "PROPERTY_SIZE")
	private String propSize;
	
	
	@Column(name = "DEPOSIT_AMOUNT")
	private Integer depositamount;
}