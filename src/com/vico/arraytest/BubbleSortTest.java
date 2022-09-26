package com.vico.arraytest;
//数组的冒泡排序
public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,2,32,423,12,54,123,5432,123,4,2,34};
		
		for(int i = 0;i < arr.length;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int s : arr) {
			System.out.println(s);
		}
	}

}
