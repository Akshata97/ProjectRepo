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
@Table(name="TBL_LEVEL3")
public class Level3 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "level3")
	@SequenceGenerator(name="level3", sequenceName = "SEQ_LEVEL3", allocationSize = 1 )
	@Column(name="QUESTION_ID")
	private int questionId;
	
	@Column(name="QUESTION")
	private String question;
	
	@OneToMany
	@JoinColumn(name="SUBJECT_ID")
	Subject subject;
	
	@OneToOne(mappedBy="level3")
	AnswerLevel3 answerlevel3;
	
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
	
	public AnswerLevel3 getAnswerlevel3() {
		return answerlevel3;
	}

	public void setAnswerlevel3(AnswerLevel3 answerlevel3) {
		this.answerlevel3 = answerlevel3;
	}
	
	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
}
