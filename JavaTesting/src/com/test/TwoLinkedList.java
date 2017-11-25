package com.test;

public class TwoLinkedList {

	public static void main(String arg[]) {
		TwoLinkedList linkedList = new TwoLinkedList();
		int[] a = new int[] { 9, 9, 9, 7, 1 };
		int[] b = new int[] { 9, 9, 8 };
		LinkedListClass alinkedListClass = new LinkedListClass(a[a.length - 1]);
		LinkedListClass blinkedListClass = new LinkedListClass(b[b.length - 1]);
		linkedList.createLinkedList(alinkedListClass, a.length - 2, a);
		linkedList.createLinkedList(blinkedListClass, b.length - 2, b);
		int alength = a.length;
		int blength = b.length;

		/*
		 * while (alength > 0) { System.out.println("A-->" +
		 * alinkedListClass.listval); alinkedListClass = alinkedListClass.next;
		 * alength--; }
		 * 
		 * while (blength > 0) { System.out.println("B-->" +
		 * blinkedListClass.listval); blinkedListClass = blinkedListClass.next;
		 * blength--; }
		 */
		System.out.println("Start of the Program");
		LinkedListClass linkedListClass = linkedList.sumtwolinkedlist(
				alinkedListClass, blinkedListClass);
		while (linkedListClass != null) {

			System.out.println(linkedListClass.listval);
			linkedListClass = linkedListClass.next;

		}
	}

	private LinkedListClass sumtwolinkedlist(LinkedListClass alinkedListClass,
			LinkedListClass blinkedListClass) {
		int carry = 0;
		LinkedListClass linkedListClass = null;
		LinkedListClass whilelinkedListClass = null;
		int iterations = 0;
		while (alinkedListClass != null || blinkedListClass != null) {

			int avalue = (alinkedListClass != null /*
													 * && alinkedListClass.next
													 * != null
													 */) ? alinkedListClass.listval
					: 0;
			int bvalue = (blinkedListClass != null /*
													 * && blinkedListClass.next
													 * != null
													 */) ? blinkedListClass.listval
					: 0;

			int sum = (avalue + bvalue + carry) % 10;

			carry = (avalue + bvalue + carry) / 10;
			// System.out.println("avalue-->" + avalue + " bvalue-->" + bvalue +
			// " Sum-->" + sum + " Carry-->" + carry);
			if (iterations == 0) {
				whilelinkedListClass = new LinkedListClass(sum);
				linkedListClass = whilelinkedListClass;
			}

			if (iterations > 0)
				whilelinkedListClass = this.createSumLinkedList(
						whilelinkedListClass, sum);

			alinkedListClass = alinkedListClass != null ? alinkedListClass.next
					: null;
			blinkedListClass = blinkedListClass != null ? blinkedListClass.next
					: null;

			iterations++;

		}
		if (carry > 0) {
			whilelinkedListClass = this.createSumLinkedList(
					whilelinkedListClass, carry);
		}

		return linkedListClass;

	}

	private LinkedListClass createSumLinkedList(
			LinkedListClass linkedListClass, int sum) {
		// System.out.println(linkedListClass.listval + "----------" + sum);
		if (linkedListClass.next == null) {
			linkedListClass.next = new LinkedListClass(sum);
			return linkedListClass.next;
		}
		return linkedListClass.next;

	}

	private void createLinkedList(LinkedListClass linkedListClass, int length,
			int[] a) {
		if (length >= 0) {
			// System.out.println("-->" + length + "-------->" + a[length]);
			linkedListClass.next = new LinkedListClass(a[length]);
			createLinkedList(linkedListClass.next, length - 1, a);
		}

	}
}

class LinkedListClass {
	int listval;
	LinkedListClass next;

	LinkedListClass(int val) {
		this.listval = val;
	}

}