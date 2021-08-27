package ch2_basic_structure;

import java.util.Scanner;

// �Ҽ� ���ϱ�
// �Ҽ��� �迭�� ��Ƽ� �ش� �迭�� �̿��Ͽ� �Ҽ� ã��

public class PrimeNum {
	
	public static int primeFunc(int n, int[] prime) {
		int idx = 1;
		
		for(int i = 3; i <= n; i++) {
			int j = 0;
			for(; j < idx; j++) {
				if(i % prime[j] == 0) {
					break;
				}
			}
			
			if(j == idx) {
				prime[idx++] = i;
			}
		}
		
		return idx;	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int n = sc.nextInt();
		
		int[] prime = new int[n];
		prime[0] = 2;
		
		int idx = primeFunc(n, prime);
		
		for(int i = 0; i < idx; i++) {
			System.out.print(prime[i] + " ");
		}

	}

}
