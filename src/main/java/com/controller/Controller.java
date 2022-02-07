package com.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.entities.Address;
import com.entities.Student;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;


public class Controller {
	@Inject
	private static EntityManagerFactory emf;
	private static EntityManager entitymanager;
	
	public Controller() {
		Injector injector=Guice.createInjector(new PersistenceModule());
		emf=injector.getInstance(EntityManagerFactory.class);
	}
	
	public Address addAddress(Address address) {
		entitymanager=emf.createEntityManager();
		entitymanager.getTransaction().begin();
		try {
			entitymanager.persist(address);
			entitymanager.getTransaction().commit();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		finally {
			entitymanager.close();
		}
    return address;
		
	}
	
	public void addStudent(Student student) {
		entitymanager=emf.createEntityManager();
		entitymanager.getTransaction().begin();
		try {
			entitymanager.persist(student);
			entitymanager.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			entitymanager.close();
		}
	}
	
	
	public Student deleteStudent(int sId) {
		entitymanager=emf.createEntityManager();
		entitymanager.getTransaction().begin();
		Student student=null;
		try {
			student=(Student)entitymanager.find(Student.class, sId);
			if(student!=null) {
				entitymanager.remove(student);
				entitymanager.close();
			}
			else {
				System.out.println("<< There is no such student with id "+sId+" >>");
				return null;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			entitymanager.close();
		}
    return student;
		
	}
	
	public Student viewStudent(int sId) {
		entitymanager=emf.createEntityManager();
		entitymanager.getTransaction().begin();
		Student student=null;
		try {
			student=(Student)entitymanager.find(Student.class, sId);
			if(student!=null) {
				return student;
			}
			else {
				System.out.println("<< There is no such student with id "+sId+" >>");
				return null;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			entitymanager.close();
		}
    return student;
		
	}
	
}
