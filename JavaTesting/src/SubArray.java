import java.util.LinkedList;
import java.util.List;

public class SubArray {
	public static void main(String arg[]) {
		int[] arr = new int[] { 9, 6, 11, 8, 10, 5, 14, 13, 93, 14 };
		LinkedList<Integer> list = new LinkedList<>();
		int k = 4;
		/*
		 * Comparing the Initial Values till K the loop will check for list is
		 * empty and compares the arr[index] with the indexes in the list.
		 * 
		 * In the list we are actually saving the index not the values
		 * 
		 * while (!list.isEmpty() && arr[list.getLast()] < arr[i]) {
		 * list.removeLast(); } list.addLast(i);
		 * 
		 * 
		 * *
		 */
		for (int i = 0; i < k; i++) {
			while (!list.isEmpty() && arr[list.getLast()] < arr[i]) {
				list.removeLast();
			}
			list.addLast(i);
		}
		System.out.println(list);
		for (int i = k; i < arr.length; i++) {
			System.out.print(" " + arr[list.getFirst()]);

			// Removes the Unwanted index from the comparison since this
			// compares the current -k

			while (!list.isEmpty() && list.getFirst() <= (i - k)) {
				list.removeFirst();
			}

			// Again Repeat the step 1 for add the highest value in the first

			while (!list.isEmpty() && arr[list.getLast()] < arr[i]) {
				list.removeLast();
			}
			list.addLast(i);

		}
		System.out.println(" " + arr[list.getFirst()]);
	}
}
