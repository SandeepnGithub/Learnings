package com.test;
import java.util.Arrays;
import java.util.List;

public class Sorting {

	public static void main(String args[]) {
		Integer[] arr = new Integer[] { 100, 4, 3, 2000, 1 };
		Sorting sorting = new Sorting();
		sorting.BubbleSort(arr, arr.length);
		sorting.SelectionSort(arr, arr.length);
		sorting.InsertionSort(arr, arr.length);
	}

	public void BubbleSort(Integer[] arr, int n) {
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < (n - k - 1); i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
		System.out.println("_____________BubbleSort___________________");
		for (int a : arr)
			System.out.println(a + " ");
	}

	public void SelectionSort(Integer[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int minimum = i;
			for (int j = i + 1; j < arr.length; j++) {
				while (j > 0 && arr[i] > arr[j]) {
					minimum = j;
				}
			}
			arr[i] = arr[minimum];
			arr[minimum] = temp;

		}
		System.out.println("_____________SelectionSort__________________");
		for (int a : arr)
			System.out.println(a + " ");
	}

	public void InsertionSort(Integer[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int j = i;
			while (j > 0 && arr[j] < arr[j - 1]) {
				arr[j] = arr[j - 1];
				j = j - 1;
			}
			arr[j] = temp;
		}
		System.out.println("_____________InsertionSort__________________");
		for (int a : arr)
			System.out.println(a + " ");
	}
}
