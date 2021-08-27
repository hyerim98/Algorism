package ch1_basic_algorism;

import java.util.Scanner;

// 양의 정수의 자리 수 구하기

public class Q1_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, cnt = 0;
		
		do {
			System.out.print("정수 : ");
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
	
		
		System.out.println("이 수는 " + cnt + "자리입니다.");
	}*/

}
