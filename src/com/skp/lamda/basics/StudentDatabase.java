package com.skp.lamda.basics;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
	
	public static List<Student> getAllStudents(){
		//Grade 1
		Student student = new Student("Ram",1,7.0,true);
		Student student1 = new Student("Shyam",1,9.0,true);
		//Grade 2
		Student student2 = new Student("Derek",2,7.2,true);
		Student student3 = new Student("Hall",2,6.0,true);
		//Grade 3
		Student student4 = new Student("Teddy",3,7.0,true);
		Student student5 = new Student("Phil",3,3.0,false);
		//Grade 4
		Student student6 = new Student("Adam",4,4.0,false);
		Student student7 = new Student("Charles",4,8.5,true);
		List<Student> students = Arrays.asList(student,student1,student2,student3,student4,student5,
				student6,student7);
		return students;
	}

}
