package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_LEVEL1")
public class Level1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "level1")
	@SequenceGenerator(name="level1", sequenceName = "SEQ_LEVEL1", allocationSize = 1 )
	@Column(name="QUESTION_ID")
	private int questionId;
	
	@Column(name="QUESTION")
	private String question;
	
	@OneToMany
	@JoinColumn(name="SUBJECT_ID")
	Subject subject;
	
	@OneToOne(mappedBy="level1")
	AnswerLevel1 answerlevel1;
	
	@OneToOne
	@JoinColumn(name="LEVEL_ID")
	Level level;
	
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public AnswerLevel1 getAnswerlevel1() {
		return answerlevel1;
	}

	public void setAnswerlevel1(AnswerLevel1 answerlevel1) {
		this.answerlevel1 = answerlevel1;
	}
	
	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
}
