package com.demo;

public class Student {
	private String usn;
	private String name;
	private String college;
	public String getUsn() {
		return usn;
	}
	public void setUsn(String usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", college=" + college + "]";
	}
	
}
