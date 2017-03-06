package com.study.hibernate.moduls;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentsTab")
public class Students {
	
	@Id
	@Column(name="idStudents")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idStudent;
	@Column(name="name")
	private String name;
	@Column(name="lname")
	private String lname;
	@Column(name="mark")
	private int mark;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="address", referencedColumnName="idAddress")
	private Address address;
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Students() {
		super();
	}

	public Students(String name, String lname, int mark, Address address) {
		super();
		this.name = name;
		this.lname = lname;
		this.mark = mark;
		this.address = address;
	}

	public int getId() {
		return idStudent;
	}

	public void setId(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	
	
}
