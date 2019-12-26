
package java.com.lti.repo;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import java.com.lti.modelEntity.Student;


@Repository
public class StudentRepo {
	
	@PersistenceContext
	private EntityManager entitymanager;
	

	public Student fetch(String email, String password) {
		Query q = entitymanager.createQuery("Select s from Student s where s.email=:em and s.password=:pwd");
		q.setParameter("em", email);
		q.setParameter("pwd", password);
		
		Student st=(Student) q.getSingleResult();
		System.out.println("In repo: "+st.getEmail());
		return st;
	}
	@Transactional
	public void add(Student student) {
		entitymanager.persist(student);
		
	}

}
