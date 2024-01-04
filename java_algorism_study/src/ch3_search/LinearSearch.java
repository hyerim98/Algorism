package ch3_search;

import java.util.Scanner;

// ���� �˻�(���� �˻�)
// ���ʹ� ���
// �ð� ���⵵ : O(n)

public class LinearSearch {
	
	public static int linear(int[]arr, int n, int key) {
		
		arr[n] = key;
		
		int i = 0;
		
		// �� �� �ε��� ��ȣ ǥ��
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();
		
		// '----' ���м� ǥ��
		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();
		
		for(; i <= n; i++) {
			// ���� �˻��ϰ� �ִ� ��� ǥ��
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%3d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", arr[k]);
			System.out.println("\n   |");
					
			// ���� �˻� ���� ����
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
		
		System.out.print("�˻��� �� : ");
        int key = sc.nextInt();
		
		int idx = linear(arr, arr.length - 1, key);
		
		if(idx < 0) {
			System.out.println("�������� �ʽ��ϴ�");
		}
		else {
			System.out.println(idx + " ��ġ�� �����մϴ�");
		}
	}

}
