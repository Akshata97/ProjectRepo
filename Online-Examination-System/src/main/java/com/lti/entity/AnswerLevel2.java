package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_ANSWER_LEVEL2")
public class AnswerLevel2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anslevel2")
	@SequenceGenerator(name="anslevel2", sequenceName = "SEQ_ANS_LEVEL2", allocationSize = 1 )
	@Column(name="ANSWER_ID")
	private int answerId;
	
	@Column(name="ANSWER")
	private String answer;
	
	@Column(name="FLAG")
	private int flag;
	
	@OneToOne
	@JoinColumn(name="QUESTION_ID")
	Level2 level2;
	
	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	public Level2 getLevel2() {
		return level2;
	}

	public void setLevel2(Level2 level2) {
		this.level2 = level2;
	}

	
}
