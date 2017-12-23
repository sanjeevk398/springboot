package com.sport.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StundentSport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String studentId;
	private String sportId;
	private String categoryId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getSportId() {
		return sportId;
	}

	public void setSportId(String sportId) {
		this.sportId = sportId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "StundentSport [studentId=" + studentId + ", sportId=" + sportId + ", categoryId=" + categoryId + "]";
	}

}
