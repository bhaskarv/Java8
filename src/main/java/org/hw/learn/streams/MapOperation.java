package org.hw.learn.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperation {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Hello", "World", "Good", "Best", "Better");

		System.out.println(words.stream()
							.map(s -> s + "!")
							.collect(Collectors.toList()));
		
		System.out.println(words.stream()
					.map(s -> s.replace('o', '0'))
					.collect(Collectors.toList()));
		
		System.out.println(words.stream()
					.map(String::toUpperCase)
					.collect(Collectors.toList()));
	}

}
