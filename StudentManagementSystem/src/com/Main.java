package com;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int numOfStudents = scanner.nextInt();
		StudentManager studentManager = new StudentManager(numOfStudents);
		studentManager.addStudents();
		studentManager.printStudentDetails();
	}
}
