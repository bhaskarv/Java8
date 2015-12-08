package org.hw.learn.predicates;

import java.util.List;
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

	@SuppressWarnings("unchecked")
	public static <T> T firstAllMatch(List<T> input,  Predicate<T> ... tests) {
		Predicate<T> allMatchPred = allPassPredicate(tests);
		for (T t : input) {
			if (allMatchPred.test(t)) {
				return t;
			}
		}
		return null;
	}
	
	@SafeVarargs
	public static <T> Predicate<T> anyMatchPredicate(Predicate<T> ... tests) {
		Predicate<T> result = e->false;
		for (Predicate<T> pred : tests) {
			result = result.or(pred);
		}
		return result;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T firstAnyMatch(List<T> input,  Predicate<T> ... tests) {
		Predicate<T> allMatchPred = anyMatchPredicate(tests);
		for (T t : input) {
			if (allMatchPred.test(t)) {
				return t;
			}
		}
		return null;
	}
}
