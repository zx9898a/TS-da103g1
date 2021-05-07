package com.vue.vo;

import java.sql.Date;

import lombok.Data;

@Data
public class ActivityInfoVO implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String 	actNo;
	private String 	typeNo;
	private String 	empNo;
	private Double 	evalTotalStar;
	private Integer evalTotalPpl;
	private Date 	actDate;
	private String 	actText;	//CLOB
	private Integer actPrice;
	private String 	actName;
	private Date 	actStartDate;
	private Date 	actEndDate;
	private Integer actStatus;
	
}
