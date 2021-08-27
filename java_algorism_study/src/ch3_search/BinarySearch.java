package ch3_search;

import java.util.Scanner;

// 이진 검색

public class BinarySearch {
	
	public static int binary(int[]arr, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		
		do {
			int pc = (pl + pr) / 2;
			
			if(arr[pc] < key) {
				pl = pc + 1;
			}
			
			else if(arr[pc] > key) {
				pr = pc - 1;
			}
			
			else {
				return pc;
			}
			
		}while(pl <= pr);
		
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]arr = new int[7];
		
		arr[0] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			do {
				
				arr[i] = sc.nextInt();
				
			}while(arr[i] < arr[i - 1]);
		}
		
		int idx = binary(arr, arr.length, 4);
		
		if(idx < 0) {
			System.out.println("존재하지 않습니다");
		}
		else {
			System.out.println(idx + " 위치에 존재합니다.");
		}
	}

}
