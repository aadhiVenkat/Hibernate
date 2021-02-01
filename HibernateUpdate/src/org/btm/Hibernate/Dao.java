package org.btm.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {

	public static void main(String[] args) {	
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction trans=ses.beginTransaction();
		student std=(student)ses.get(student.class, 2);
		std.setAddress("Pulivendula");
		std.setName("Venkata");
		ses.update(std);		
		trans.commit();
		ses.close();
	}

}
