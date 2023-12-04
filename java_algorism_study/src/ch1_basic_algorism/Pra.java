package ch1_basic_algorism;

import java.util.Scanner;

// 가우스의 합
// 1 ~ 10의 합 == ( 1 + 10 ) * 5

public class Pra {
	public int gaussSum(int n) {
		int sum = (1 + n) * (n / 2);
		
		if(n%2!=0) {
			sum += (n / 2) + 1;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
	}

}
