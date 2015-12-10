package org.hw.learn.streams;

import java.util.Arrays;
import java.util.List;

public class IterateElems {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "World", "Good", "Best", "Better");
		
		//forEach takes a lambda (here a function is passed that transforms input)
		words.stream().forEach(s -> System.out.printf("  %s \n",s));
		
		//Method reference is passed here, as we dont wnat any transformation of the input
		words.stream().forEach(System.out::println);
	}
}
