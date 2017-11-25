package com.test;

public class MaxAverageValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxAverageValues maxAverageValues = new MaxAverageValues();
		int[] input = new int[] { 11, -8, 16, -7, 24, -2, 3 };
		/* int val = maxAverageValues.getMax(input); */
		int val = maxAverageValues.getMaximum(input);
		System.out.println(val);
	}

	public int getMaximum(int[] input) {
		int total = 0;
		int finaltotal = 0;
		for (int i = 0; i < 3; i++) {
			total = total + input[i];
		}
		if (total > finaltotal) {
			finaltotal = total;
		}
		for (int j = 3; j < input.length; j++) {
			int emptotal = total;
			emptotal = emptotal - input[j - 3] + input[j];
			total = emptotal;
			if (total > finaltotal) {
				finaltotal=total;
			}
		}
		return finaltotal;
	}

	public int getMax(int[] input) {
		int finalTtal = 0;
		for (int i = 0; i < input.length; i++) {
			// System.out.println("-----------------------------");
			int total = 0;
			for (int j = i; (j < (i + 3) && (j < input.length)); j++) {
				// System.out.println(input[j]);
				total = total + input[j];
			}
			if (total > finalTtal) {
				finalTtal = total;
			}
		}
		return finalTtal;
	}

}
