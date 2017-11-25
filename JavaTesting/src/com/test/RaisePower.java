package com.test;

public class RaisePower {

	public static void main(String arg[]) {
		int N = 100;
		boolean isfactor = false;
		OuterLoop: for (int i = 2; i <= (int) Math.sqrt(N); i++) {
			int div = N;
			int quo = 0;
			//System.out.println("N-->" + N);
			while (quo == 0) {
				int tempdiv = div / i;
				quo = div % i;
				if (quo == 0 && tempdiv == 1) {
					isfactor = true;
					break OuterLoop;
				}
				div = tempdiv;
				//System.out.println(div);
			}
		}
		if (isfactor)
			System.out.println("true");
		else
			System.out.println("false");

	}
}
