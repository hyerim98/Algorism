package ch2_basic_structure;

import java.util.Arrays;

/* 배열 반대로 복사 */
public class ArrayCopy {
	public static void rcopy(int[] a, int[] b) {
		int len = a.length;
		
		for(int i = 0; i < len; i++) {
			b[i] = a[len - i - 1];
		}
	}

	public static void main(String[] args) {
		int[] arr = {23, 45, 6, 78, 9};
		
		// 배열 copy
		int[] arCpy = Arrays.copyOf(arr, arr.length);
		
		System.out.println(arr);
		System.out.println(arCpy);
		
		// 배열 역순 copy
		rcopy(arr, arCpy);
		for(int n : arCpy) {
			System.out.print(n + " ");
		}
		

	}

}
