package com.skp.lamda.basics;

import java.util.stream.IntStream;

public class SumOfNnumbers {

	public static void main(String[] args) {
		//sum of N numbers using imperative style of coding
		
		int n = 100;
		int sum = 0;
		for(int i=0;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum via imperative style of coding: "+sum );
		
		//sum of N numbers using declarative style of coding
		
		int sum2 = IntStream.rangeClosed(0, 100)
		.sum();
		System.out.println("Sum via declarative style of coding: "+sum2);
		
	}
}
