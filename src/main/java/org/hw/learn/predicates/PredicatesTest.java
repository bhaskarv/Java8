package org.hw.learn.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.hw.learn.StringUtils;

public class PredicatesTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> employees = Arrays.asList("Rama", "Big Goal", "Shyama", "Bheema", "Joseph", "Basheer", "Ravis","Soma");

		Predicate<String> pred = PredicateUtil.
								allPassPredicate(str -> str.contains("i"),
									str -> str.length() >= 5
									// ,str -> str.startsWith("R")
								 );
		
		System.out.println(StringUtils.allMatches(employees, pred));
		System.out.println(PredicateUtil.firstAllMatch(employees, pred));
		System.out.println(PredicateUtil.firstAnyMatch(employees, pred));
	}
}
