package java.com.lti.entity;

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
@Table(name="TBL_LEVEL2")
public class Level2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "level2")
	@SequenceGenerator(name="level2", sequenceName = "SEQ_LEVEL2", allocationSize = 1 )
	@Column(name="QUESTION_ID")
	private int questionId;
	
	@Column(name="QUESTION")
	private String question;
	
	@OneToMany
	@JoinColumn(name="SUBJECT_ID")
	Subject subject;
	
	@OneToOne(mappedBy="level2")
	AnswerLevel2 answerlevel2;
	
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
	
	public AnswerLevel2 getAnswerlevel2() {
		return answerlevel2;
	}

	public void setAnswerlevel2(AnswerLevel2 answerlevel2) {
		this.answerlevel2 = answerlevel2;
	}
	
	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}


	
}
