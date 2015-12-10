package org.hw.learn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOperation {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "World", "Good", "Best", "Better", "Footer");

		//Filter takes predicate and applies it to the stream
		//and returns a new stream containing only elements that satisfy the predicate.
		List<String> filteredList = words.stream().
									filter(s -> s.length() > 4)
									.collect(Collectors.toList());
		
		System.out.println(filteredList);
		
		//filter can be applied multiple times -- AND condition 
		filteredList = words.stream()
						.filter(s -> s.contains("o"))
						.filter(s -> s.length() > 4)
						.filter(s -> s.contains("e"))
						.collect(Collectors.toList());
		
		System.out.println(filteredList);
	} 
	
}
