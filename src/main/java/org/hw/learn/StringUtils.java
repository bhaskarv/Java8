package org.hw.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringUtils {

	public static List<String> allMatches(List<String> input, Predicate<String> matcher) {
		
		List<String> filteredList = new ArrayList<>();
		for (String str : input) {
			if (matcher.test(str)) {
				filteredList.add(str);
			}
		}
		return filteredList;
	}
	
	public static <T> List<T> allMatches1(List<T> input, Predicate<T> matcher) {
		
		List<T> filteredList = new ArrayList<>();
		for (T t : input) {
			if (matcher.test(t)) {
				filteredList.add(t);
			}
		}
		return filteredList;
	}
}
