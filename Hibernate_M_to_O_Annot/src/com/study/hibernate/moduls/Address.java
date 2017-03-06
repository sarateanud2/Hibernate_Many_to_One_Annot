package com.study.hibernate.moduls;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AddressTab")
public class Address {
	
	@Id
	@Column(name="idAddress")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAddress;
	
	@Column(name="country")
	private String country;
	@Column(name="city")
	private String city;
	@Column(name="street")
	private String street;

	public Address() {
		super();
	}

	public Address(String country, String city, String street) {
		super();
		this.country = country;
		this.city = city;
		this.street = street;
	}

//	public Address(String country, String city, String street, Set<Students> studentSet) {
//		super();
//		this.country = country;
//		this.city = city;
//		this.street = street;
//		this.studentSet = studentSet;
//	}

	public int getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
//	public Set<Students> getStudentSet() {
//		return studentSet;
//	}
//
//	public void setStudentSet(Set<Students> studentSet) {
//		this.studentSet = studentSet;
//	}
	
}
