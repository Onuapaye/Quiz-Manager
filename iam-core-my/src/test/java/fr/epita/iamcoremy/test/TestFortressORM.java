package fr.epita.iamcoremy.test;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import fr.epita.iamcoremy.FortressORM;

public class TestFortressORM {

	FortressORM fortressORM = new FortressORM();

	public void setUp() {
		fortressORM.setfId(101);
		fortressORM.setfName("Fortress Technologies");
		fortressORM.setfEmail("fortress@fortresstechgh.com");

		/*Configuration conf = new Configuration();
		SessionFactory sFactory = conf.buildSessionFactory();
		Session session = sFactory.openSession();*/

		/*session.beginTransaction();
		session.save(fortressORM);*/

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
