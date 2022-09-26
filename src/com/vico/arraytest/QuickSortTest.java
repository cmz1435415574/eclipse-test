package com.vico.arraytest;

public class QuickSortTest {
	private static void swap(int[] data,int i,int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	private static void subSort(int[] data,int start,int end) {
		if(start < end) {
			int base = data[start];
			int low = start;
			int high = end + 1;
			while(true) {
				while(low < end && data [++low] - base <= 0) 
					;
				while(high > start && data[--high] - base >= 0)
					;
				if(low < high)
					swap(data,low,high);
				else
					break;
			}
			subSort(data,start,high - 1);
			subSort(data,high + 1,end);
		}
	}
	
	public static void quickSort(int[] data) {
		subSort(data,0,data.length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = new int[] {12,213,324,54,2,3,54,23,45,123,5,3};
		quickSort(data);
		System.out.println(java.util.Arrays.toString(data));
	}

}
