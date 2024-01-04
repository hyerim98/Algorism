package ch3_search;

import java.util.Scanner;

// ���� �˻� ��ȭ ����
// {1, 2, 3, 3, 3, 5, 6, 7} ==> key : 3 ==> return 2(������ �ε��� 3�� ������ ������, �� �迭�� 3(key)�̸� �չ迭�� �ε����� ��µǵ���)

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
		
		System.out.print("�˻��� �� : ");
        int key = sc.nextInt();
		
		int idx = binsearchX(arr, arr.length, key);
		
		if(idx < 0) {
			System.out.println("�������� �ʽ��ϴ�");
		}
		else {
			System.out.println(idx + " ��ġ�� �����մϴ�.");
		}
	}

}
