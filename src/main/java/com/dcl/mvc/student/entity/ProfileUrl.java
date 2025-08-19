package com.dcl.mvc.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="profiles")
public class ProfileUrl {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="profile_Id")
private int profileId;

@Column(name="profile_Name",nullable = false)
private String profileName;

@Column(name="url",nullable = false)
private String url;

@ManyToOne
private Student student;

public int getProfileId() {
	return profileId;
}

public void setProfileId(int profileId) {
	this.profileId = profileId;
}

public String getProfileName() {
	return profileName;
}

public void setProfileName(String profileName) {
	this.profileName = profileName;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

@Override
public String toString() {
	return "ProfileUrl [profileId=" + profileId + ", profileName=" + profileName + ", url=" + url + ", student="
			+ student + "]";
}



}
