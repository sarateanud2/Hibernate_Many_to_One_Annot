package com.study.hibernate.main;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.study.hibernate.moduls.Address;
import com.study.hibernate.moduls.Students;
import com.study.hibernate.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		
		Address address_01 = new Address("Franta", "Paris", "L. Boro");
		Address address_02 = new Address("Franta", "Paris", "M. Mtyui");
		
		Students student_01 = new Students("Anna", "Morcov", 8, address_01);
		Students student_02 = new Students("Andrei", "Sarateanu", 10, address_02);
		
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		

		
		session.save(student_01);
		session.save(student_02);
		
		session.getTransaction().commit();
		session.close();
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//		session.getTransaction().commit();
//		session.close();
//	} 
//	
//	private static Address addAddress(String country, String city, String street){
//		Address address = new Address(country, city, street);
//		
//		SessionFactory sf = HibernateUtil.getSessionFactory();
//		Session session = sf.openSession();
//		session.beginTransaction();
//		session.save(address);
//		session.getTransaction().commit();
//		session.close();
//		
//		return address;
//	}
}
