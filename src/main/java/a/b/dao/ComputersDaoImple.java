package a.b.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.model.Computer;

@Repository
public class ComputersDaoImple implements Computerdao {
	@Autowired(required = true)
	private SessionFactory sessionFactory;

	// Avoid duplicate session creation
	private Session getSession() {
		Session session = sessionFactory.getCurrentSession();
		if (session == null) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	@Override
	public void save(Computer computer) {
		System.out.println(getSession());
		System.out.println(computer);
		getSession().save(computer);

	}

}
