package ch3_search;

import java.util.Scanner;

// 선형 검색(순차 검색)
// 보초법 사용

public class LinearSearch {
	
	public static int linear(int[]arr, int n, int key) {
		
		arr[n] = key;
		
		int i = 0;
		
		for(i = 0; i <= n; i++) {
			if(arr[i] == key) {
				break;
			}
		}
		
		return i == n? -1 : i;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]arr = new int[6];
		
		for(int i = 0; i < arr.length - 1; i++) {
			arr[i] = sc.nextInt();	
		}
		
		int idx = linear(arr, arr.length - 1, 2);
		
		if(idx < 0) {
			System.out.println("존재하지 않습니다");
		}
		else {
			System.out.println(idx + " 위치에 존재합니다");
		}
	}

}
