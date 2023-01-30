package com.himani.niet.spring;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	public Student(int studentId, String studentName, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		System.out.println("Student -All arg Constructor Called");
	}
	
	
	public Student() {
		super();
		System.out.println("Student No arg Constructor Called");
	}


	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}


	
	
	
}
