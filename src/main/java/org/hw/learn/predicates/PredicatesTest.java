package org.hw.learn.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import org.hw.learn.StringUtils;

public class PredicatesTest {
	public static void main(String[] args) {
		List<String> employees = Arrays.asList("Rama", "Shyama", "Bheema", "Joseph", "Basheer", "Ravi","Soma");

		Predicate<String> pred = PredicateUtil.allPassPredicate(str -> str.contains("a") 
																//,str -> str.length() == 4
																//,str -> str.startsWith("R")
																);
		
		System.out.println(StringUtils.allMatches(employees, pred));
	}
}
