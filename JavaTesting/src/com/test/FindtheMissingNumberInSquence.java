package com.test;

public class FindtheMissingNumberInSquence {

	/**
	 * @param args
	 * 
	 * 
	 *            _____________________________Logic __________________________
	 * 
	 * 
	 *            if Index is correctly placed then the missing number is in
	 *            rightside
	 * 
	 *            if Index is not correctly placed then the missing number is in
	 *            leftside
	 * 
	 *            if the low== high then return that index as final answer
	 */
	public static void main(String[] args) {
		int[] sequence = { 1, 2, 3, 4, 6, 7, 8 };

		FindtheMissingNumberInSquence findtheMissingNumberInSquence = new FindtheMissingNumberInSquence();
		findtheMissingNumberInSquence.solutiontoMissingNumber(sequence, 0,
				sequence.length - 1);
	}

	private void solutiontoMissingNumber(int[] sequence, int low, int high) {
		if (low > high) {
			System.out.println("Invalid Input");
			return;
		}

		if (correctlyPlaced(high, sequence[high])) {
			System.out.println("All Numbers are correct");
			return;
		}
		int mid = (low + high) / 2;

		if (low == high) {
			System.out.println("Missing Number" + (sequence[low] - 1));
			return;
		}

		if ((sequence[mid] - 1) == mid) {
			low = mid + 1;
		} else {
			high = mid;
		}
		solutiontoMissingNumber(sequence, low, high);
	}

	private boolean correctlyPlaced(int high, int number) {
		if (high == (number - 1)) {
			return true;
		}
		return false;
	}
}
