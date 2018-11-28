package it.unical.asde2018.blog.components.persistence;

import javax.annotation.PostConstruct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.unical.asde2018.blog.model.Credentials;

@Repository
public class CredentialsDAO {
	
	@Autowired
	private DBManager dbManager;

	@Autowired
	private SessionFactory sessionFactory;

	@PostConstruct
	public void init() {
		save(new Credentials("ciccio", "ciccio"));
		save(new Credentials("giovanni", "ciao"));
		save(new Credentials("filippo", "hardpassword"));

	}

	public void save(Credentials credentials) {
		dbManager.save(credentials);

	}

	public boolean exists(Credentials credentials) {
		Session openSession = sessionFactory.openSession();
		Query<Credentials> query = openSession.createQuery("from Credentials as c where c.username=:u and c.password=:p", Credentials.class)
			.setParameter("u", credentials.getUsername()).setParameter("p", credentials.getPassword());
		
		boolean result = query.uniqueResult() != null;
		openSession.close();
		return result;
	}

}
