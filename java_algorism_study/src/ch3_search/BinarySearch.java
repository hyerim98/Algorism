package ch3_search;

import java.util.Scanner;

// 이진 검색 : 오름 차순, 내림 차순으로 정렬된 배열에서 검색하는 알고리즘
// 시간 복잡도 : log n

public class BinarySearch {
	
	public static int binary(int[]arr, int n, int key) {
		int pl = 0;
		int pr = n - 1;
		int pc = n / 2;
		
		do {
			if(arr[pc] < key) {
				pl = pc + 1;
			}
			
			else if(arr[pc] > key) {
				pr = pc - 1;
			}
			
			else {
				return pc;
			}
			
			pc = (pl + pr) / 2;
			
		}while(pl <= pr);
		
		return -1;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]arr = new int[7];
		
		arr[0] = 1;
		
		// 오름차순 정렬되도록
		for(int i = 1; i < arr.length; i++) {
			do {
				
				arr[i] = sc.nextInt();
				
			}while(arr[i] < arr[i - 1]);
		}
		
		System.out.print("검색할 값 : ");
        int key = sc.nextInt();
		
		int idx = binary(arr, arr.length, key);
		
		if(idx < 0) {
			System.out.println("존재하지 않습니다");
		}
		else {
			System.out.println(idx + " 위치에 존재합니다.");
		}
	}

}
