package org.hw.learn.predicates;

import java.util.function.Predicate;

public class PredicateUtil {
	@SafeVarargs
	public static <T> Predicate<T> allPassPredicate(Predicate<T> ... tests) {
		Predicate<T> result = e->true;
		for (Predicate<T> pred : tests) {
			result = result.and(pred);
		}
		return result;
	}
}
