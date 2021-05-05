package com.gmail.akv;

import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;
import com.gmail.akv.exeptions.MyFirstEverException;
import com.gmail.akv.exeptions.NegativeValueException;

public class Group implements Voenkom {
	private Student[] students = new Student[10];
	private String groupName;

	public Group(Student[] students, String groupName) {
		super();
		this.students = students;
		this.groupName = groupName;
	}

	public Group() {
		super();
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student st) throws MyFirstEverException {

		for (int i = 0; i < students.length;) {

			if (students[i] == null) {
				students[i] = st;
				break;
			}
			i++;
			if (i == students.length) {
				throw new MyFirstEverException("The group is full");
			}

		}

	}

	public void removeStudent(long studentNumber) {

		for (int i = 0; i < students.length; i++)
			if (students[i] != null) {
				if (students[i].getStudentNumber() == studentNumber) {
					students[i] = null;
					break;
				}
			}

	}

	public Student searchStudent(String familyName) throws MyFirstEverException {
		Student student = null;
		for (int i = 0; i < students.length; i++)
			if (students[i] != null && students[i].getFamilyName().equals(familyName)) {

				student = students[i];
			}
		if (student == null) {
			throw new MyFirstEverException("The student had not found!");
		}

		return student;

	};

	public Student createStudent() {

		for (;;) {
			try {
				String firstName = JOptionPane.showInputDialog("Input first name");
				String familyName = JOptionPane.showInputDialog("Input first name");
				Sex sex = Sex.valueOf((JOptionPane.showInputDialog("Input sex, MALE/FEMALE")).toUpperCase());
				int age = Integer.valueOf(JOptionPane.showInputDialog("Input age"));
				if (age < 0) {
					throw new NegativeValueException();
				}
				long studentNumber = Long.valueOf(JOptionPane.showInputDialog("Input student number"));
				if (studentNumber < 0) {
					throw new NegativeValueException();
				}
				String groupName = JOptionPane.showInputDialog("Input group name");

				Student student = new Student(firstName, familyName, sex, age, studentNumber, groupName);

				return student;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Error number format");
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "Охрана, отмена!");
			} catch (NegativeValueException e) {
				JOptionPane.showMessageDialog(null, "Input positive number");
			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Input MALE or FEMALE");
			}
			break;
		}

		return null;

	}

	@Override
	public Student[] getReacruter() {
		int count = 0;
		Student[] student = new Student[students.length];
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getAge() > 18 && students[i].getSex() == Sex.MALE) {
				student[count] = students[i];
				count += 1;
			}
		}
		return student;
	}

	@Override
	public String toString() {
		Arrays.sort(students, Comparator.nullsLast(new StudentNameComparator()));

		return "Group [students=" + Arrays.toString(students) + ", groupName=" + groupName + "]";
	}

}
