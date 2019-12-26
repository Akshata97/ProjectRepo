package java.com.lti.modelEntity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_REGISTER")
public class Student {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator="myHiber" )
	@SequenceGenerator(name="myHiber" , sequenceName="SEQ_STUDENT",allocationSize=1)
	@Column(name="REG_ID")
	
	int regId;
	
	@Column(name="STUDENT_NAME")
	String name;
	
	@Column(name="EMAIL")
	String email;
	
	@Column(name="STUDENT_PASSWORD")
	String password;
	
	@Column(name="MOBILE")
	String mobileNo;
	
	@Column(name="CITY")
	String city;
	
	@Column(name="STUDENT_STATE")
	String state;
	
	@Column(name="DOB")
	String date;
	
	
	
	

	public int getRegId() {
		return regId;
	}

	public void setRegId(int regId) {
		this.regId = regId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
