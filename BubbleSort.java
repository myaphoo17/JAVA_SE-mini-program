package Assignment;

import java.util.Arrays;

//"Declare the array recorded with 10 values (3,5,2,7,9,10,15,7,0,4). 
//Sort that array in descending order using BUBBLE SORT Algorithms"
public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 3, 5, 2, 7, 9, 10, 15, 7, 0, 4 };

		for (int j = arr.length - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (arr[i + 1] > arr[i]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(arr));
	}
}