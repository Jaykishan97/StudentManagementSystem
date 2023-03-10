package com;

public class Student {
	private String name;
	private int age;
	private String address;
	private String phone;
	private String email;
	private String course;
	private int semester;

	public Student(String name, int age, String address, String phone, String email, String course, int semester) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.course = course;
		this.semester = semester;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getCourse() {
		return course;
	}

	public int getSemester() {
		return semester;
	}
}