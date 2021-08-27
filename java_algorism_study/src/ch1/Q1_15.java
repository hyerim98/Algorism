package ch1;

import java.util.Scanner;

// 별 찍기

public class Q1_15 {
	
	public void triangleLB(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void triangleLU(int n) {
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}	
	}
	
	public void triangleRU(int n) {
		for(int i = n, x = 0; i > 0; i--,x++) {
			for(int y = 0; y < x; y++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
	
	public void triangleRB(int n) {
		for(int i = 1, x = (n - 1); i <= n; i++, x--) {
			for(int y = 0; y < x; y++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public void triangleNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
		
		for(int i = 1, x = (n - 1); i <= n; i++, x--) {
			for(int y = 0; y < x; y++) {
				System.out.print(" ");
			}
			
			for(int j = 0; j < (2 * i - 1); j++) {
				System.out.print(i);
			}
			
			for(int y = 0; y < x; y++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int n = sc.nextInt();
		
		Q1_15 q1_15 = new Q1_15();
		q1_15.triangleLB(n);
		System.out.println();
		q1_15.triangleLU(n);
		System.out.println();
		q1_15.triangleRB(n);
		System.out.println();
		q1_15.triangleRU(n);
		System.out.println();
		q1_15.triangleNum();
		

	}

}
