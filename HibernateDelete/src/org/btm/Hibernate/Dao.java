package org.btm.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sesf=config.buildSessionFactory();
		Session ses=sesf.openSession();
		Transaction trs=ses.beginTransaction();
		student std=(student)ses.get(student.class, 2);
		ses.delete(std);
		trs.commit();
		ses.close();
	}

}
