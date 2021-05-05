package com.gmail.akv;

public class Human {
	private String firstName;
	private String familyName;
	private Enum sex;
	private int age;

	public Human(String firstName, String familyName, Enum sex, int age) {
		super();
		this.firstName = firstName;
		this.familyName = familyName;
		this.sex = sex;
		this.age = age;
	}

	public Human() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public Enum getSex() {
		return sex;
	}

	public void setSex(Enum sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[firstName=" + firstName + ", familyName=" + familyName + ", sex=" + sex + ", age=" + age + "]";
	}

}
