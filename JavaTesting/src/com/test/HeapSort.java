package com.test;

public class HeapSort {

	public static void main(String arg[]) {
		int[] arr = new int[] { 12, 35, 87, 26, 9, 28, 7 };
		HeapSort heapSort = new HeapSort();
		heapSort.buidHeap(arr, arr.length);

		int heapsize = arr.length;
		for (int i = arr.length - 1; i > 0; i--) {
			System.out.println(arr[0] + "----start-----" + arr[i]);
			heapSort.swap(arr, 0, i);
			System.out.println(arr[0] + "---------" + arr[i]);
			heapsize = heapsize - 1;
			heapSort.buidHeap(arr, heapsize);
		}
		for (int a : arr)
			System.out.print(a + " ");
	}

	private void buidHeap(int[] arr, int size) {
		int lastindex = size - 1;
		int startofbuild = ((lastindex - 1) / 2);
		for (int i = startofbuild; i >= 0; i--) {
			// System.out.println("----------size-------" + lastindex);
			this.buildMaximumheap(arr, i, lastindex);
		}
	}

	private void buildMaximumheap(int[] arr, int startofbuild, int size) {
		int leftindex = (2 * startofbuild) + 1;
		int rightindex = (2 * startofbuild) + 2;
		int largest = startofbuild;
		System.out.println(leftindex + "------------" + rightindex
				+ "----------" + largest);
		if (leftindex < size && arr[largest] < arr[leftindex]) {
			largest = leftindex;
		}
		if (leftindex < size && arr[largest] < arr[rightindex]) {
			largest = rightindex;
		}
		if (largest != startofbuild) {
			swap(arr, largest, startofbuild);
			buildMaximumheap(arr, largest, size);
		}
	}

	private void swap(int[] arr, int largest, int startofbuild) {
		int temp = arr[startofbuild];
		arr[startofbuild] = arr[largest];
		arr[largest] = temp;

	}

}
