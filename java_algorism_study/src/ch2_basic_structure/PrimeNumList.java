package ch2_basic_structure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* n이하의 소수 구하기 */
public class PrimeNumList {
	public static List<Integer> primeNumber(int n) {
		List<Integer> prime = new ArrayList<Integer>();
		prime.add(2);
		
		if(n == 2) {
			return prime;
		}
		
		for(int i = 3; i <= n; i+=2) {
			int j = 2;
			for(; j < n; j++) {
				if(i % j == 0) {
					break;
				}
			}
			
			if(i == j) {
				prime.add(i);
			}
		}
		
		return prime;
	}

	public static void main(String[] args) {
		List<Integer> prime = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.print("2 이상의 양의 정수 : ");
			n = scan.nextInt();
		}while(n < 2);
		
		prime = primeNumber(n);
		
		for(int num : prime) {
			System.out.print(num + " ");
		}
		
	}

}
