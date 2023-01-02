package InsertionSort;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		//int arr[] = {10,5,1,56,-1};
		int arr[] = {1,2,3,4,5,6,7,8};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	static void insertionSort(int[] arr)
	{
		for(int i = 0; i<arr.length-1; i++)
		{
			for(int j = i+1; j>0; j--)
			{
				if(arr[j]<arr[j-1])
				{
					swap(arr,j,j-1);
				}else {
					break;
				}
			}
		}
	}
	
	
	public static void swap(int[] arr,int index, int smallIndex)
	{
		int temp = arr[index];
		arr[index] = arr[smallIndex];
		arr[smallIndex] = temp;
	}
}
