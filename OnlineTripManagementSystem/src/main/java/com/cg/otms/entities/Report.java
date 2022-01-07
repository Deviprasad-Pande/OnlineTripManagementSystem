package com.cg.otms.entities;

public class Report {
	private int reportId;
	private String reportName;
	private String reportType;
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
