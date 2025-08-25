package com.sutherland.entity;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EditEmployee {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session =factory.openSession();
		Transaction train = session.beginTransaction();
		
		Employee empl =session.get(Employee.class,34);
		empl.setEmpName("manish mayank");
		//session.save(empl);
		session.remove(empl);
		train.commit();
		session.close();
		factory.close();

	}

}
