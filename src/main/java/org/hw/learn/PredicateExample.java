package org.hw.learn;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {
	public static void main(String[] args) {
		List<String> input = Arrays.asList("First", "Second", "Third", "Four", "Five", "Six", "Two", "Eight", "Nine");

		List<String> listContainingFi = StringUtils.allMatches(input, s -> s.contains("Fi"));

		System.out.println(listContainingFi.toString());

		System.out.println(StringUtils.allMatches(input, s -> s.length() > 4));
		System.out.println(StringUtils.allMatches(input, s -> (s.length() % 2) == 0));

		List<Integer> numbers = Arrays.asList(10, 20, 40, 21, 45, 23, 27, 45, 49, 61, 100);

		// Generic version of allMatches
		System.out.println(StringUtils.allMatches1(input, s -> s.length() > 5));
		System.out.println(StringUtils.allMatches1(input, s -> s.contains("S")));
		System.out.println(StringUtils.allMatches1(numbers, n -> (n > 20 && n < 30)));
		System.out.println(StringUtils.allMatches1(numbers, n -> (n % 2 == 0)));
	}
}
