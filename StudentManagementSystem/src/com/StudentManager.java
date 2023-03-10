package com;

import java.util.Scanner;

public class StudentManager {
	private Student[] students;

	public StudentManager(int numOfStudents) {
		students = new Student[numOfStudents];
	}

	public void addStudents() {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter details of student " + (i + 1));
			System.out.print("Name: ");
			String name = scanner.nextLine();
			System.out.print("Age: ");
			int age = scanner.nextInt();
			scanner.nextLine(); // Consume newline left-over
			System.out.print("Address: ");
			String address = scanner.nextLine();
			System.out.print("Phone: ");
			String phone = scanner.nextLine();
			System.out.print("Email: ");
			String email = scanner.nextLine();
			System.out.print("Course: ");
			String course = scanner.nextLine();
			System.out.print("Semester: ");
			int semester = scanner.nextInt();
			scanner.nextLine(); // Consume newline left-over

			Student student = new Student(name, age, address, phone, email, course, semester);
			students[i] = student;
		}
	}

	public void printStudentDetails() {
		System.out.println("Student details:");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Student " + (i + 1));
			System.out.println("Name: " + students[i].getName());
			System.out.println("Age: " + students[i].getAge());
			System.out.println("Address: " + students[i].getAddress());
			System.out.println("Phone: " + students[i].getPhone());
			System.out.println("Email: " + students[i].getEmail());
			System.out.println("Course: " + students[i].getCourse());
			System.out.println("Semester: " + students[i].getSemester());
			System.out.println("-----------------------");
		}
	}
}
