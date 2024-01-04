package ch3_search;

import java.util.Scanner;

// 이진 검색 심화 문제
// {1, 2, 3, 3, 3, 5, 6, 7} ==> key : 3 ==> return 2(원래는 인덱스 3이 나오게 하지만, 앞 배열도 3(key)이면 앞배열의 인덱스가 출력되도록)

public class BinarySearchQ {
	
	public static int binsearchX(int[]arr, int n, int key) {
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
				do {
					if(pc == 0) {
						return 0;
					}
					
					pc--;
					
				}while(arr[pc] == key);
				
				return ++pc;
			}
			
			pc = (pl + pr) / 2;
			
		}while(pl <= pr);
		
		return -1;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]arr = new int[8];
		
		arr[0] = 1;
		
		for(int i = 1; i < arr.length; i++) {
			do {
				
				arr[i] = sc.nextInt();
				
			}while(arr[i] < arr[i - 1]);
		}
		
		System.out.print("검색할 값 : ");
        int key = sc.nextInt();
		
		int idx = binsearchX(arr, arr.length, key);
		
		if(idx < 0) {
			System.out.println("존재하지 않습니다");
		}
		else {
			System.out.println(idx + " 위치에 존재합니다.");
		}
	}

}
