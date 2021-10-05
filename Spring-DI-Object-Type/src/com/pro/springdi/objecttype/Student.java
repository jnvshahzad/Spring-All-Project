package com.pro.springdi.objecttype;

public class Student {
	
	public Student() {
		
		System.out.println("Student Object created");
	}

	private int studentId;
	private String studentName;
	private Address studentAddress;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public void studentInfo()
	{
		System.out.println("Id: "+studentId+" Name: "+studentName);
		System.out.println("Address: "+studentAddress.getStreetNo()+","+studentAddress.getCity()+","+studentAddress.getState());
	}
	
}
