package com.dcl.mvc.student.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="student_id")
private int id;

@Column(name="firstName",nullable = false)
private String firstName;

@Column(name="lastName")
private String lastName;

@Column(name="email",nullable = false)
private String email;

@Column(name="phn_no",nullable = false)
private long phonenum;

@Column(name="city")
private String city;

@OneToMany( mappedBy = "student",fetch = FetchType.EAGER)
private List<ProfileUrl> profileurl;



public List<ProfileUrl> getProfileurl() {
	return profileurl;
}

public void setProfileurl(List<ProfileUrl> profileurl) {
	this.profileurl = profileurl;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getPhonenum() {
	return phonenum;
}

public void setPhonenum(long phonenum) {
	this.phonenum = phonenum;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
			+ ", phonenum=" + phonenum + ", city=" + city + ", profileurl=" + profileurl + "]";
}


}
