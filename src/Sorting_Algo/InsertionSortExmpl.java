package Sorting_Algo;

import java.util.Arrays;

public class InsertionSortExmpl {
	private static void sort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > current) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = current;
		}

	}

	public static void main(String[] args) {

		int[] numbers = { 2, 8, 4, 1, 3, 10 };
		sort(numbers);
		System.out.println(Arrays.toString(numbers));

	}

}


