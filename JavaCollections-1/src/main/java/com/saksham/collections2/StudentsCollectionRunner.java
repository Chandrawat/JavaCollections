package com.saksham.collections2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class AcsendingComparator implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		return Integer.compare(stud1.getId(), stud2.getId());
	}
	
}

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> std = List.of(new Student(19, "Abas"),
				new Student(100,"Adam"),
				new Student(2,"Eve"));
		
		// this will need "toString" method otherwise will print instance
		//System.out.println(std);
		
		// to sort the list need Arraylist as we can not sort immutable List
		
		List<Student> stuAl = new ArrayList<>(std);
		
		System.out.println(stuAl);
		
		//Collections.sort(stuAl);
		
		//System.out.println(stuAl);
		
		Collections.sort(stuAl, new AcsendingComparator());
		System.out.println(stuAl);
		
		// another way to sort 
		stuAl.sort(new AcsendingComparator());
		System.out.println(stuAl);
	}

}
