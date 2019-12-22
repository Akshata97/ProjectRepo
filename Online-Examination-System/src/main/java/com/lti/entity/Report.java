package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="REPORT")
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "report")
	@SequenceGenerator(name="report", sequenceName = "SEQ_REPORT", allocationSize =1 )
	@Column(name="REPORT_ID")
	private int reportId;
	
	@Column(name="EXAM_DATE")
	private LocalDate examDate;
	
	@Column(name="SCORE_TOTAL")
	private int scoreTotal;
	
	@OneToMany
	@JoinColumn(name="LEVEL_ID")
	Level level;

	public int getReportId() {
		return reportId;
	}

	public void setReportId(int reportId) {
		this.reportId = reportId;
	}

	public LocalDate getExamDate() {
		return examDate;
	}

	public void setExamDate(LocalDate examDate) {
		this.examDate = examDate;
	}

	public int getScoreTotal() {
		return scoreTotal;
	}

	public void setScoreTotal(int scoreTotal) {
		this.scoreTotal = scoreTotal;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
	
	
	

}
