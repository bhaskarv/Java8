package org.hw.learn;

import java.util.Arrays;
import java.util.List;

public class BasicIteration {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 40, 24, 21, 30);
		
		//Pre java 8 iteration
		for(Integer num : numbers) {
			System.out.println(num);
		}
		
		System.out.println("ITERATION USING LAMBDAS ");
		//Lambdas style
		numbers.forEach(e -> System.out.println(e));
		
		long count = numbers.stream()
						.filter(e -> (e > 20 && e < 30))
						.count();
		
		System.out.println(count);
				
	}
}
