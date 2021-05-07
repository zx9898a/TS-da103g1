package com.vue.esb.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "activity_info")
@Data
public class ActivityInfoEntity implements Serializable {

	private static final long	serialVersionUID	= 8333113103423846833L;
	@Id
//	@SequenceGenerator(name = "activity_info_sql", sequenceName = "activity_info_seq", allocationSize = 1)
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "activity_info_sql")
	@Column(name = "act_no", nullable = false, unique = true)
	private String 	actNo;
	@Column(name = "type_no")
	private String 	typeNo;
	@Column(name = "emp_no")
	private String 	empNo;
	@Column(name = "eval_total_star")
	private Double 	evalTotalStar;
	@Column(name = "eval_total_ppl")
	private Integer evalTotalPpl;
	@Column(name = "act_date")
	private Date 	actDate;
	@Column(name = "act_text")
	private String 	actText;	//CLOB
	@Column(name = "act_price")
	private Integer actPrice;
	@Column(name = "act_name")
	private String 	actName;
	@Column(name = "act_start_date")
	private Date 	actStartDate;
	@Column(name = "act_end_date")
	private Date 	actEndDate;
	@Column(name = "act_status")
	private Integer actStatus;
	
}
