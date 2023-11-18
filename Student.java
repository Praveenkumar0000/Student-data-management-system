package com.tap;

public class Student {
	private int id;
	private String name;
	private String fathername;
	private String branch;

	
	public Student() {
		
	}

	public Student(int id, String name, String fathername,  String branch) {
		super();
		this.id = id;
		this.name = name;
		this.fathername = fathername;
		this.branch = branch;
	
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	

}
