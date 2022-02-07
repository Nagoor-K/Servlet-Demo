package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="first_name")
	private String fname;
	@Column(name="last_name")
	private String lname;
	@Column(name="city")
	private String city;
	@OneToOne(targetEntity = Address.class)
	private Address address;
	
	public Student() {
		
	}

  public int getId() {
  return id;}

  public void setId(int id) {
  this.id = id;}

  public String getFname() {
  return fname;}

  public void setFname(String fname) {
  this.fname = fname;}

  public String getLname() {
  return lname;}

  public void setLname(String lname) {
  this.lname = lname;}

  public String getCity() {
  return city;}

  public void setCity(String city) {
  this.city = city;}

  public Address getAddress() {
  return address;}

  public void setAddress(Address address) {
  this.address = address;}

public Student(String fname,String lname,String city)
{this.fname=fname;this.lname=lname;this.city=city;}

public Student(int id,String fname,String lname,String city)
{this.id=id;this.fname=fname;this.lname=lname;this.city=city;}

public Student(String fname,String lname,String city,Address address)
{this.fname=fname;this.lname=lname;this.city=city;this.address=address;}





	
	
}
