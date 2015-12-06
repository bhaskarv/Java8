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
		
		//using method reference  -- Method references are used to call existing functions. 
		//As the lambda s->s.length() is <b>simply calling existing method<b> (no logic as in case of say replace('e','E')) we can use method references
		System.out.printf("RETURN LENGTH : %s \n",StringUtils.transform1(input,String::length));
		System.out.printf("CONVERT TO LOWER CASE : %s \n",StringUtils.transform1(input,String::toLowerCase));
		
		//We are using a user defined interface MyFunction
		System.out.printf("CONVERT TO UPPER CASE PRE JAVA 8 : %s \n",StringUtils.transform2(input, new MyFunction<String, String>() {
			@Override
			public String apply(String t) {
				return t.toUpperCase();
			}
		}));
		
		//Lambdas work with user defined interfaces as well. Essentially all javac is doing here is creaate an anonymous
		//class for MyFunction and pass on <code>s.toUpperCase()</code> to the method body of apply(String s)
		System.out.printf("CONVERT TO UPPER CASE JAVA 8 : %s \n",StringUtils.transform2(input, s -> s.toUpperCase()));
		
	}
}	
