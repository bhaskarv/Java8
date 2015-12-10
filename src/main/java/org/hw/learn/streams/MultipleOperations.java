package org.hw.learn.streams;

import java.util.Arrays;
import java.util.List;

public class MultipleOperations {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "World", "Good", "Best", "Better",
											"Footer", "Bet","Tap");
		
		String word = words.stream().map(String::toUpperCase)
					  .filter(s -> s.length() <= 4)
					  .filter(s -> s.contains("E"))
					  .findFirst().orElse(null);
		
		System.out.println(word);
							
	}
	
}
