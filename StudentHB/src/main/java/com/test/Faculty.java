package com.test;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@DiscriminatorValue("faculty")
//@Table(name = "faculty")
//@PrimaryKeyJoinColumn(name = "ID")
public class Faculty extends College{
	
	private String f_type;
	
	private String f_skill;

	
	public Faculty() {
	}

	public Faculty(String f_type, String f_skill) {
//		super(id,c_name);
		this.f_type = f_type;
		this.f_skill = f_skill;
	}


	public String getF_type() {
		return f_type;
	}

	public void setF_type(String f_type) {
		this.f_type = f_type;
	}

	public String getF_skill() {
		return f_skill;
	}

	public void setF_skill(String f_skill) {
		this.f_skill = f_skill;
	}

	@Override
	public String toString() {
		return "Faculty [f_type=" + f_type + ", f_skill=" + f_skill + "]";
	}
}
