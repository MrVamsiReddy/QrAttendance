package com.details.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class attendance {
	@Id
	private long id;
	private String name;
	private String department;
	private String year;
	private String attended;
	private String email;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getAttended() {
		return attended;
	}

	public void setAttended(String attended) {
		this.attended = attended;
	}

	private String mobile;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
