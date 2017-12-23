package com.sport.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategorySports {
	@Id
	@Column(length = 5)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String sportId;
	private String sportName;
	private String categoryId;

	public String getSportId() {
		return sportId;
	}

	public void setSportId(String sportId) {
		this.sportId = sportId;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "CategorySports [sportId=" + sportId + ", sportName=" + sportName + ", categoryId=" + categoryId + "]";
	}

}
