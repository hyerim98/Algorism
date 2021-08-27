package ch1;

import java.util.Scanner;

public class Q1_04 {
	
	public int Med(int a, int b, int c) {
		
		if(a >= b) {
			if(b >= c) {
				return b;
			}
			else if(a <= c) {
				return a;
			}
			else {
				return c;
			}
		}
		else if(a > c) {
			return a;
		}
		else if(b > c) {
			return c;
		}
		else {
			return b;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Á¤¼ö : ");
		
		Q1_04 q1_04 = new Q1_04();
		System.out.println(q1_04.Med(sc.nextInt(), sc.nextInt(), sc.nextInt()));

	}

}
