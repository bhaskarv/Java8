package org.hw.learn;

import java.util.Arrays;
import java.util.Comparator;

public class StringCompare {
	public static void main(String[] args) {
		String[] testStrings = {"One","Two","Three","Four"};
		
		Arrays.sort(testStrings, new Comparator<String>() {

			public int compare(String str1, String str2) {
				return (str1.compareToIgnoreCase(str2));
			}
		});
		
		for (String str : testStrings) {
			System.out.println(str);
		}
	}
}
