package ch3_search;

import java.util.Scanner;

// ���� �˻� ��ȭ ����
// {1, 9, 2, 9, 4, 6, 7, 9} ==> key : 9 ==> { 1, 3, 7} ==> return 3

public class LinearSearchQ {
	
	public static int searchIdx(int[]arr, int n, int key, int[]arrIdx) {
		int i = 0, j = 0;
		
		for(i = 0; i < n; i++) {
			if(arr[i] == key) {
				arrIdx[j++] = i;
			}
		}
		
		return j;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]arr = {1, 9, 2, 9, 4, 6, 7, 9};
		int[]arrIdx = new int[arr.length];
		
		System.out.print("�˻��� �� : ");
        int key = sc.nextInt();
		
		int idx = searchIdx(arr, arr.length, key, arrIdx);
		
		if(idx == 0) {
			System.out.println("�������� �ʽ��ϴ�");
		}
		else {
			System.out.println(idx + "���� �����մϴ�.");
			
			for(int i = 0; i < idx; i++) {
				System.out.print(arrIdx[i] + " ");
			}
		}
		
	}

}
