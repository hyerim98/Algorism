package ch3_search;

import java.util.Scanner;

// ���� �˻� : ���� ����, ���� �������� ���ĵ� �迭���� �˻��ϴ� �˰���
// �ð� ���⵵ : log n

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
		
		// �������� ���ĵǵ���
		for(int i = 1; i < arr.length; i++) {
			do {
				
				arr[i] = sc.nextInt();
				
			}while(arr[i] < arr[i - 1]);
		}
		
		System.out.print("�˻��� �� : ");
        int key = sc.nextInt();
		
		int idx = binary(arr, arr.length, key);
		
		if(idx < 0) {
			System.out.println("�������� �ʽ��ϴ�");
		}
		else {
			System.out.println(idx + " ��ġ�� �����մϴ�.");
		}
	}

}
