package com.gmail.akv;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Vasily", "Chupkin", Sex.MALE, 18, 54653456, "Abc");
		Student student2 = new Student("Petr", "Babkin", Sex.MALE, 18, 223453, "Abc");
		Student student3 = new Student("Abdulla", "Aronov", Sex.MALE, 19, 56890, "Abc");
		Student student4 = new Student("Nastia", "Dupkina", Sex.FEMALE, 18, 2156890, "Abc");
		Student student5 = new Student("Katia", "Evrkolova", Sex.FEMALE, 18, 77777, "Abc");
		Student student6 = new Student("Lera", "Fugovkina", Sex.FEMALE, 19, 78777, "Abc");
		Student student7 = new Student("Marusya", "Gevchenko", Sex.FEMALE, 25, 77797, "Abc");
		Student student8 = new Student("Anton", "Husiyenko", Sex.MALE, 25, 97797, "Abc");
		Student student9 = new Student("Marusya", "Shevchenko", Sex.FEMALE, 25, 8123797, "Abc");
		Student student10 = new Student("Maidanina", "Zluschenkotak", Sex.FEMALE, 13, 3434797, "Abc");
//		Student student11 = new Student("Stalinina", "Budiennaya", Sex.FEMALE, 104, 575474, "Abc");

		Group students = new Group();
		students.setGroupName("AB-15");
//		students.addStudent(student1);
		students.addStudent(student2);
		students.addStudent(student3);
		students.addStudent(student4);
		students.addStudent(student5);
		students.addStudent(student6);
		students.addStudent(student7);
		students.addStudent(student8);
		students.addStudent(student9);
		students.addStudent(student10);
//		students.addStudent(student11);

//		students.removeStudent(575474);
//		students.removeStudent(78777);
//		students.removeStudent(77777);
//		students.addStudent(student11);

//		
		students.addStudent(students.createStudent());
		System.out.println(students.toString());
		//		System.out.println(students.searchStudent("Babkin"));
//		System.out.println(students.searchStudent("Shevchenko"));4
//		
		for (Student reacruter : students.getReacruter()) {
			if (reacruter != null)
				System.out.print("reacruter:" + reacruter + ", ");
		}
		System.out.println();
		System.out.println(students.searchStudent("Zluschenkotak"));
	}

}
