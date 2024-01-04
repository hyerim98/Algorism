package ch3_search;

import java.util.Scanner;

// 선형 검색(순차 검색)
// 보초법 사용
// 시간 복잡도 : O(n)

public class LinearSearch {
	
	public static int linear(int[]arr, int n, int key) {
		
		arr[n] = key;
		
		int i = 0;
		
		// 맨 위 인덱스 번호 표시
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();
		
		// '----' 구분선 표시
		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();
		
		for(; i <= n; i++) {
			// 현재 검색하고 있는 요소 표시
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", arr[k]);
			System.out.println("\n   |");
					
			// 선형 검색 종료 로직
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
		
		System.out.print("검색할 값 : ");
        int key = sc.nextInt();
		
		int idx = linear(arr, arr.length - 1, key);
		
		if(idx < 0) {
			System.out.println("존재하지 않습니다");
		}
		else {
			System.out.println(idx + " 위치에 존재합니다");
		}
	}

}
