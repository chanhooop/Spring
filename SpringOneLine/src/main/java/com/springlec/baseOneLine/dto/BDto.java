package com.springlec.baseOneLine.dto;

import java.sql.Timestamp;

public class BDto {

	int bId;
	String bName;
	String bTitle;
	Timestamp bDate;
	
	public BDto() {
		
	}
	
	
	public BDto(int bId, String bName, String bTitle,Timestamp bDate) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bTitle = bTitle;
		this.bDate = bDate;
	}


	public int getbId() {
		return bId;
	}


	public void setbId(int bId) {
		this.bId = bId;
	}


	public String getbName() {
		return bName;
	}


	public void setbName(String bName) {
		this.bName = bName;
	}


	public String getbTitle() {
		return bTitle;
	}


	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}




	public Timestamp getbDate() {
		return bDate;
	}


	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}
	
}
