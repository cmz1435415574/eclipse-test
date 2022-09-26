package com.vico.arraytest;

public class ArrayTest1 {
	public static void main(String[] args){
		String[] arr = new String[] {"jj","dd","mm","gg"};
		String[] arr1 = new String[arr.length];
		//数组复制
		for(int i=0;i<arr.length;i++) {
			arr1[i] = arr[i];
		}
		//数组反转
		for(int i=0;i<arr.length/2;i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
		//遍历数组
		for(String s:arr) {
			System.out.println(s);
		}
		String s = "dd";
		//线性查找
		boolean isFlag = true;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i].equals(s)){
				System.out.println("第"+(i+1)+"个元素是"+s);
				isFlag = false;
				break;
			}
		}
		if(isFlag)
			System.out.println("很遗憾没找到");
		
		//二分法查找
		//先排序
		int[] arr2 = new int[] {12,21,32,43,53,54,65,76,87};
		int dest = 21;
		int head =0;
		int end = arr2.length - 1;
		boolean isFlag1 = true;
		while(head <= end) {
			int mid = (head + end)/2;
			if(dest == arr2[mid]) {
				isFlag1 = false;
				System.out.println("找到指定元素，位置为"+mid);
				break;
			}
			else if(arr2[mid] > dest) {
				end = mid - 1;
			}
			else if(arr2[mid] < dest) {
				head = mid + 1;
			}
		}
		if(isFlag1)
			System.out.println("很遗憾没找到");
	}
}
