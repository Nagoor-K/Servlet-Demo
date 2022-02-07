package com.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.google.inject.AbstractModule;

public class PersistenceModule extends AbstractModule{
	@Override
	  protected void configure() {
	    bind(EntityManagerFactory.class).toInstance(Persistence.createEntityManagerFactory("Eclipselink_JPA"));
	  }
}
