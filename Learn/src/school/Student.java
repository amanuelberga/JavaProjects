package school;

import java.util.*; 

class Student {
	
	private String name; 
	private int grade; 
	private Date dob; 
	
	public Student(String name,int grade,Date dob) {
		this.name = name; 
		this.grade = grade; 
		this.dob = dob; 
	}
	
	public String getName() {
		return name; 
	}
	public int getGrade() {
		return grade; 
	}
	public Date getDob() {
		return dob; 
	}
	
}
