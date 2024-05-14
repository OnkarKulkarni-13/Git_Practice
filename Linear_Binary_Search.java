package com.practice;

import java.util.Arrays;

public class Linear_Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 9, 11, 13 };
		int target = 14;

		int[] arr1 = { 6, 5, 2, 8, 3, 7 };

		/**
		 * int index = binarySearchAlgorithm(arr, target);
		 * 
		 * if (index != -1) System.out.println(target + " Value is present at index " +
		 * index); else System.out.println("Entered number is not present");
		 * 
		 **/

		System.out.println("Before Sorting:-> " + Arrays.toString(arr1));
		selectionSortAlgorithm(arr1);

	}

	public static void selectionSortAlgorithm(int[] arr1) {
		System.out.println("Sorting Using Selection Sort:-> ");
		// TODO Auto-generated method stub
		int temp = 0;
		int size = arr1.length;
		int min_index = -1;
		for (int i = 0; i < size - 1; i++) {
			min_index = i;
			for (int j = i + 1; j < size; j++) {
				if (arr1[min_index] > arr1[j]) {
					min_index = j;

				}

			}
			temp = arr1[i];
			arr1[i] = arr1[min_index];
			arr1[min_index] = temp;
			System.out.println(Arrays.toString(arr1));

		}

	}

	public static int binarySearchAlgorithm(int[] arr, int target) {
		// TODO Auto-generated method stub
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return mid;

			} else if (arr[mid] < target) {
				left = mid + 1;

			} else if (arr[mid] > target) {
				right = mid - 1;
			}

		}
		return -1;
	}

}
