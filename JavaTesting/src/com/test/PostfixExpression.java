package com.test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PostfixExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * String[] stringarr = new String[] { "5", "1", "2", "+", "4", "*",
		 * "+", "3", "-" };
		 */
		/* String[] stringarr = new String[] { "20", "30", "+" }; */
		String[] stringarr = new String[] { "2", "3", "1", "*", "+", "9", "-" };
		Stack<String> listString = new Stack<>();
		for (String v : stringarr) {
			listString.add(v);
			while (listString.size() > 2
					&& ((v.equals("+")) || (v.equals("-")) || (v.equals("*")) || (v
							.equals("/")))) {
				System.out.println(listString);
				String val = listString.peek();
				if (val.equals("+")) {
					listString.pop();
					Integer a = Integer.valueOf(listString.pop());
					Integer b = Integer.valueOf(listString.pop());
					System.out.println(a + "------+--------" + b);
					Integer c = b + a;
					listString.add(String.valueOf(c));
				} else if (val.equals("-")) {
					listString.pop();
					Integer a = Integer.valueOf(listString.pop());
					Integer b = Integer.valueOf(listString.pop());
					System.out.println(a + "-------minus--------" + b);
					Integer c = b - a;
					listString.add(String.valueOf(c));
				} else if (val.equals("*")) {
					listString.pop();
					Integer a = Integer.valueOf(listString.pop());
					Integer b = Integer.valueOf(listString.pop());
					System.out.println(a + "------*--------" + b);
					Integer c = b * a;
					listString.add(String.valueOf(c));
				} else if (val.equals("/")) {
					listString.pop();
					Integer a = Integer.valueOf(listString.pop());
					Integer b = Integer.valueOf(listString.pop());
					System.out.println(a + "------/--------" + b);
					Integer c = b / a;
					listString.add(String.valueOf(c));
				}

			}

		}
		System.out.println(listString);
	}
}
