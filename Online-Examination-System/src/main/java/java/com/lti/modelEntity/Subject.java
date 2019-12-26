package java.com.lti.modelEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SUB")
public class Subject {
	
	@Id
	int subjectId;
	
	String subject;
	
	@OneToMany(mappedBy = "sub")
	List<Level1> level1;
	

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<Level1> getLevel1() {
		return level1;
	}

	public void setLevel1(List<Level1> level1) {
		this.level1 = level1;
	}

	

//	public List<Level1> getLevel1() {
//		return level1;
//	}
//
//	public void setLevel1(List<Level1> level1) {
//		this.level1 = level1;
//	}

	

}
