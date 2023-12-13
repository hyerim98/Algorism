package ch2_basic_structure;

import java.util.Scanner;

// 10진수를 다른 진수로 변환

public class CardConvRev {
	
	public static int cardConv(int x, int r, char[]d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		}while(x!=0);
		
		
		for(int i = 0; i < digits / 2; i++) {
			char tmp = d[i];
			d[i] = d[digits - 1 - i];
			d[digits - 1 - i] = tmp;
		}
		
		return digits;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x, r;
		char [] d = new char[32];
		do {
			System.out.print("음이 아닌 정수 : ");
			x = sc.nextInt();
		}while(x < 0);
		
		do {
			System.out.print("진법 : ");
			r = sc.nextInt();
		}while(r < 2 || r > 36);
		
		int idx = cardConv(x, r, d);
		for(int i = 0; i < idx; i++) {
			System.out.print(d[i]);
		}
	}

}
