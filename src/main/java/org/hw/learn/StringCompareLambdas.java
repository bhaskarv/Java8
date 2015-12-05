package org.hw.learn;

import java.util.Arrays;

public class StringCompareLambdas {
	public static void main(String[] args) {
		String[] input = {"One","Two","Three","Four"};
		
		Arrays.sort(input, (str1, str2) -> str1.compareTo(str2));
		
		for (String str : input) {
			System.out.println(str);
		}
	}
}
