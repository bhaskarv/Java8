package org.hw.learn;

import java.util.Arrays;
import java.util.List;

public class FunctionExample {
	public static void main(String[] args) {
		List<String> input = Arrays.asList("ONE", "Two","three","five");
		System.out.println(input.toString());
		System.out.printf("TRANSFORM TO UPPER CASE : %s \n",StringUtils.transform(input, s->s.toUpperCase()));
		System.out.printf("APPEND EXCLAMATORY : %s \n",StringUtils.transform(input, s->s+"!!!"));
		
		//Generic method
		System.out.printf("APPEND EXCLAMATORY 1 : %s \n",StringUtils.transform1(input, s->s+"!"));
		System.out.printf("TRANSFORM TO UPPER CASE 1 : %s \n",StringUtils.transform1(input, s->s.toUpperCase()));
		System.out.printf("TRANSFORM TO UPPER CASE 1 : %s \n",StringUtils.transform1(input, s->s.replace('e', 'E')));
		System.out.printf("RETURN LENGTH : %s \n",StringUtils.transform1(input, s->s.length()));
	}
}	
