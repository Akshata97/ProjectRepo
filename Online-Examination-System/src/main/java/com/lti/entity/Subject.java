package com.lti.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_SUBJECT")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "subject")
	@SequenceGenerator(name="subject", sequenceName = "SEQ_SUBJECT", allocationSize =1 )
	@Column(name="SUBJECT_ID")
	private int subjectId;
	
	@Column(name="SUBJECT_NAME")
	private String subjectName;
	
	@OneToMany(mappedBy = "subject")
	Level level;
	
	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
}
