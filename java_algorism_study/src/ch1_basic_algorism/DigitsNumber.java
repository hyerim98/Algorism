package ch1_basic_algorism;

import java.util.Scanner;

// ���� ���� �ڸ��� ���ϱ�

public class DigitsNumber {
	public static int digitsNum(int num) {
		int cnt = 0;
		
		while(num != 0){
			num = num / 10;
			cnt++;
		}
		
		
		return cnt;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0;
		do {
			System.out.print("���� : ");
			n = scan.nextInt();
		}while(n < 0);
		
		System.out.println(digitsNum(n));
	}
}
