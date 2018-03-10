package com.test;

import java.util.Scanner;

public class RightCircularArrayRotation {

	/**
	Input:
	____________________________________________________
	3 2 3
        1 2 3
	0
	1
	2
	Output:
	_____________________________________________________
	2
	3
	1
	
	After the first rotation, the array becomes . [3 ,1 ,2]
        After the second (and final) rotation, the array becomes .[2,3,1]
	 * @param args
	 * 
	 *            Circular Array Rotations
	 * 
	 *            n->Size of array k-> No of Rotations m->index need to be
	 *            fetched
	 * 
	 *            if (k<m) arr[m-k] if(k>m) arr[(n + m - k)%n]
	 * 
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		Integer k = in.nextInt();
		Integer q = in.nextInt();
		Integer[] a = new Integer[n];
		for (Integer a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		for (int a0 = 0; a0 < q; a0++) {
			Integer m = in.nextInt();
			if (k < m)
				System.out.println(a[m - k]);
			else if (k >= m)
				System.out.println(a[(n + m - k) % n]);
		}
	}
}
