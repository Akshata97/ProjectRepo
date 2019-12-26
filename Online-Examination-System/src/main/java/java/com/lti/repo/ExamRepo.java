package java.com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import java.com.lti.modelEntity.Level1;
import java.com.lti.modelEntity.Level2;
import java.com.lti.modelEntity.Level3;
import java.com.lti.modelEntity.Subject;

@Repository
public class ExamRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	
//	@Transactional
//	public void add(Answer1 ans) {
//		Level1 qid = entityManager.find(Level1.class, 1);
//		ans.setLevel1(qid);
//		entityManager.merge(ans);
//		
//	}
	@Transactional
	public void addQueslevel1(Level1 level1,int subid) {
		Subject sub = entityManager.find(Subject.class, subid);
		level1.setSub(sub);
		entityManager.persist(level1);
		
	}
	@Transactional
	public void addQueslevel2(Level2 level2,int subid) {
		Subject sub = entityManager.find(Subject.class, subid);
		level2.setSub(sub);
		entityManager.persist(level2);
		
	}
	@Transactional
	public void addQueslevel3(Level3 level3,int subid) {
		Subject sub = entityManager.find(Subject.class, subid);
		level3.setSub(sub);
		entityManager.persist(level3);
		
	}

}
