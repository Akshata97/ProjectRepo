package java.com.lti.entity;

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
@Table(name="TBL_ANSWER_LEVEL3")
public class AnswerLevel3 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "anslevel3")
	@SequenceGenerator(name="anslevel3", sequenceName = "SEQ_ANS_LEVEL3", allocationSize = 1 )
	@Column(name="ANSWER_ID")
	private int answerId;
	
	@Column(name="ANSWER")
	private String answer;
	
	@Column(name="FLAG")
	private int flag;
	
	@OneToOne
	@JoinColumn(name="QUESTION_ID")
	Level3 level3;
	
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
	
	public Level3 getLevel3() {
		return level3;
	}

	public void setLevel3(Level3 level3) {
		this.level3 = level3;
	}
}
