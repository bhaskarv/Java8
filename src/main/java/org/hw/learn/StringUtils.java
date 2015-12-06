package org.hw.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
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
	
	public static List<String> transform(List<String> input, Function<String, String> function) {
		List<String> transformedList = new ArrayList<>(input.size());
		for(String str : input) {
			transformedList.add(function.apply(str));
		}
		return transformedList;
	}
	
	public static <T, R> List<R> transform1(List<T> input, Function<T, R> funcation) {
		List<R> transformedList = new ArrayList<>(input.size());
		for (T t : input) {
			transformedList.add(funcation.apply(t));
		}
		return transformedList;
	}
	
	public static List<String> transform2(List<String> input, MyFunction<String, String> upper) {
		List<String> transformedList = new ArrayList<>(input.size());
		for(String str : input) {
			transformedList.add(upper.apply(str));
		}
		return transformedList;
	}
}
