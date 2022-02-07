package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String street;
	private String city;
	private String state;
	private String zpcode;
	
	
	public Address() {
		
	}
	
  public Address(String street, String city, String state, String zpcode) {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zpcode = zpcode;
  }

public int getId() {
return id;}

public void setId(int id) {
this.id = id;}

public String getStreet() {
return street;}

public void setStreet(String street) {
this.street = street;}

public String getCity() {
return city;}

public void setCity(String city) {
this.city = city;}

public String getState() {
return state;}

public void setState(String state) {
this.state = state;}

public String getZpcode() {
return zpcode;}

public void setZpcode(String zpcode) {
this.zpcode = zpcode;}
  
  
  
	
	
}
