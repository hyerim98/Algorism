package ch1_basic_algorism;

import java.util.Scanner;

// ���� ������ �ڸ� �� ���ϱ�

public class Q1_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt = 0;
		
		do {
			System.out.print("���� : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		while(n != 0) {
			n /= 10;
			cnt++;
		}
		
		System.out.println(cnt);
		

	}
	
	/*public static void func(int n) {
		int cnt = 0;
		do {
			cnt++;
			n/=10;
		}while(n > 0);
	
		
		System.out.println("�� ���� " + cnt + "�ڸ��Դϴ�.");
	}*/

}
