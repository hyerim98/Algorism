package ch5_recursion;

// 재귀로 최대공약수 구하기

public class GCD {
	
	public static int recursion_gcd(int x, int y) {
		if(y == 0) {
			return x;
		}
		
		return recursion_gcd(y, x % y);
		
	}
	
	public static int gcd(int x, int y) {
		while(y != 0) {
			int tmp = y;
			y = x % y;
			x = tmp;
		}
		
		return x;
	}
	
	public static int gcdArray(int[] a, int start, int no) {
		if(no == 1) {
			return a[start];
		}
		else if(no == 2) {
			return gcd(a[start], a[start + 1]);
		}
		else {
			return gcd(a[start], gcdArray(a, start + 1, no -1));
		}
	}

	public static void main(String[] args) {
		
		System.out.println(recursion_gcd(20, 40));
		
		int[]a = {3,6,9};
		
		System.out.println(gcdArray(a, 0, 3));

	}

}
