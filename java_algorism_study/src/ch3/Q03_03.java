package ch3;

import java.util.Scanner;

// ���� �˻� ��ȭ ����
// {1, 9, 2, 9, 4, 6, 7, 9} ==> key : 9 ==> { 1, 3, 7} ==> return 3

public class Q03_03 {
	
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
		
		
		int idx = searchIdx(arr, arr.length, 9, arrIdx);
		
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
