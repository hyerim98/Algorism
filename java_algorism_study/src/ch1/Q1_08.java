package ch1;

import java.util.Scanner;

// 가우스의 합

public class Q1_08 {
	public int gaussSum(int n) {
		int sum = (1 + n) * (n / 2);
		
		if(n%2!=0) {
			sum += (n / 2) + 1;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
		Q1_08 q1_08 = new Q1_08();
		System.out.println(q1_08.gaussSum(n));

	}

}
