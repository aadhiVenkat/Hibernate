package org.btm.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Dao {

	public static void main(String[] args) {
		Student student=new Student();
		student.setName("Adi");
		student.setAddress("ANDHRA PRADESH");
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction trans=ses.beginTransaction();
		ses.save(student);
		trans.commit();
		ses.close();
	}

}
