package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_LEVEL")
public class Level {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "level")
	@SequenceGenerator(name="level", sequenceName = "SEQ_LEVEL", allocationSize = 1)
	@Column(name="LEVEL_ID")
	private int levelId;
	
	@Column(name="SCORE")
	private int score;

	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	Subject suject;
	
	/*@ManyToOne
	@JoinColumn(name="REG_ID")
	Register register;*/
	
	public int getLevelId() {
		return levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Subject getSuject() {
		return suject;
	}

	public void setSuject(Subject suject) {
		this.suject = suject;
	}

	/*public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
	}
	*/
}
