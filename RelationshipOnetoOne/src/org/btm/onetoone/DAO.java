package org.btm.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAO {

	public static void main(String[] args) {
		
		passport p=new passport();
		p.setPassport_name("Venkata Adi Narayana");
		
		Person pr=new Person();
		pr.setPerson_name("Adi");
		pr.setPass(p);
		
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session ses=sf.openSession();
		Transaction trans=ses.beginTransaction();
		
		ses.save(pr);
		trans.commit();
		ses.close();
	}

}
