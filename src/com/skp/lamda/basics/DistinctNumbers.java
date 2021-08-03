package com.skp.lamda.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DistinctNumbers {
	
	public static void main(String[] args) {
		//Imperative style of coding
		List<Integer> numbers = Arrays.asList(2,2,4,5,6,7,7,8,8);
		List<Integer> distNumbers = new ArrayList<>();
		for(Integer number:numbers) {
			if(!distNumbers.contains(number)) {
				distNumbers.add(number);
			}
		}
		System.out.println(distNumbers);
		//distNumbers.forEach(System.out::print);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		// Declarative style of coding
		List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
		//collect.forEach(System.out::print);
		System.out.println(collect);
		collect = null;
		Objects.requireNonNull(collect, "As there is no distinct numbers");
	}
}
