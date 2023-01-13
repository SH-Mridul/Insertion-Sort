package InsertionSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int arr[] = {8,3,7,5,2};
		
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void insertionSort(int[] arr)
	{
		for(int i = 1; i<arr.length; i++)
		{
			int temp = arr[i]; // 5
			int j = i-1; // 0
			
			while(j>-1 && temp<arr[j]) // 5<10 ---------> true
			{
				arr[j+1] = arr[j]; // arr[1] = 10
				j--; // -1
			}
			
			arr[j+1] = temp; // arr[0] = 5
		}
	}
}
