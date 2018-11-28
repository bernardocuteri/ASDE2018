package it.unical.asde2018.blog.components.persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DBManager {

	@Autowired
	private SessionFactory sessionFactory;

	public void save(Object obj) {
		Session session = sessionFactory.openSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(obj);
			tx.commit();

		} catch (Exception e) {
			tx.rollback();
		}
		session.close();

	}
}
