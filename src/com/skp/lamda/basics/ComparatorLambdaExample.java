package com.skp.lamda.basics;

import java.util.Comparator;

public class ComparatorLambdaExample {

		public static void main(String[] args) {
			//Legacy way of comparing
			Comparator<Integer> numberComparsion = new Comparator<Integer>() {
				public int compare(Integer i1,Integer i2) {
					return i1.compareTo(i2);
				}
			};
		}
}
