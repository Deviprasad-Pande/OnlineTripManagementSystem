package com.cg.otms.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;



@Entity
public class Report {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int reportId;
	
	
    @Column(name = "report_name",nullable = false,length = 50)
	private String reportName;
	
	
    @Column(name = "report_type",nullable = false)
	private String reportType;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="admin_id",table = "Admin")
	private Admin admin;
	
	public Report() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Report(int reportId, String reportName, String reportType) {
		super();
		this.reportId = reportId;
		this.reportName = reportName;
		this.reportType = reportType;
	}
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	@Override
	public String toString() {
		return "Report [reportId=" + reportId + ", reportName=" + reportName + ", reportType=" + reportType + "]";
	}

}