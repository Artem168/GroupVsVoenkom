package com.gmail.akv;

public class Student extends Human {
	private long studentNumber;
	private String groupName;

	public Student(String firstName, String familyName, Enum sex, int age, long studentNumber, String groupName) {
		super(firstName, familyName, sex, age);
		this.studentNumber = studentNumber;
		if (this.studentNumber < 0) {
			throw new IllegalArgumentException("The student number is below zero!");
		}
		this.groupName = groupName;
	}

	public Student() {
		super();
	}

	public long getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(long studentNumber) {
		this.studentNumber = studentNumber;
		if (this.studentNumber <= 0) {
			throw new IllegalArgumentException("The student number is below zero!");
		}
	}

	public String getGroupName() {
		return groupName;
	}
	
	

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public String toString() {
		return "[studentNumber=" + studentNumber + super.toString()+ ", groupName=" + groupName + "]";
	}

}
