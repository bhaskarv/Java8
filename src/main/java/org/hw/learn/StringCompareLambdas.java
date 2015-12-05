package org.hw.learn;

import java.util.Arrays;

public class StringCompareLambdas {
	public static void main(String[] args) {
		String[] input = {"One","Two","Three","Four"};
		
		//Here we are supplying a lambda instead of a Comparator
		Arrays.sort(input, (str1, str2) -> str1.compareTo(str2));
		
		for (String str : input) {
			System.out.println(str);
		}
		
		//Now if we want to compare strings by length, we just need to modify the lambda part
		Arrays.sort(input, (str1, str2) -> str1.length() - str2.length());
		
		//Java 8 provides a simple means of iterating over a list -- forEach
		Arrays.asList(input).forEach(e -> System.out.println(e));
	}
}
