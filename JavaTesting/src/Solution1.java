import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution1 {

	static Long minimumAbsoluteDifference(Long n, List<Long> arr) {
		Long count = Long.MAX_VALUE;
		for (Integer i = 0; i < arr.size(); i++) {
			for (Integer j = i + 1; j < arr.size(); j++) {
				Long temp = arr.get(j) - arr.get(i);
				Long val = Math.abs(temp);
				if (val < count) {
					count = val;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Long n = in.nextLong();
		List<Long> listval = new ArrayList<>();
		for (Integer arr_i = 0; arr_i < n; arr_i++) {
			listval.add(in.nextLong());
		}
		Long result = minimumAbsoluteDifference(n, listval);
		System.out.println(result);
		in.close();
	}
}
