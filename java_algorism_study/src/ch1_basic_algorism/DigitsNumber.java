package ch1_basic_algorism;

import java.util.Scanner;

// 양의 정수 자릿수 구하기

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
			System.out.print("정수 : ");
			n = scan.nextInt();
		}while(n < 0);
		
		System.out.println(digitsNum(n));
	}
}
