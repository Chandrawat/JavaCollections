package com.saksham.collections2;

public class Student implements Comparable<Student>{
	
	private int id;	
	private String name;

	
	public Student(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return id + " " +name;
	}

	@Override
	public int compareTo(Student student) {
		
		// this will give increment order
		//return Integer.compare(this.id, student.id);
		

		// this will give descending order
		return Integer.compare(student.id, this.id);
	}

}
