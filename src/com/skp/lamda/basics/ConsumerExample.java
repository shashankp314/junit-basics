package com.skp.lamda.basics;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> consumer = (s)->System.out.println( s.toUpperCase());
		Consumer<String> consumer1 = (s)->System.out.println( s.concat(" functional programming"));
		//Either we can use this
		consumer.andThen(consumer1).accept("java8");
		//or this
		Consumer<String> consumer12 = consumer.andThen(consumer1);
		consumer12.accept("java8");
		//Consumer interface using Student and StudentDatabase
		Consumer<Student> con1 = student-> System.out.println( student.getName());
		
	}
}
