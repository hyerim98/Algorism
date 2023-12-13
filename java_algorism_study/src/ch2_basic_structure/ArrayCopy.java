package ch2_basic_structure;

import java.util.Arrays;

/* �迭 �ݴ�� ���� */
public class ArrayCopy {
	public static void rcopy(int[] a, int[] b) {
		int len = a.length;
		
		for(int i = 0; i < len; i++) {
			b[i] = a[len - i - 1];
		}
	}

	public static void main(String[] args) {
		int[] arr = {23, 45, 6, 78, 9};
		
		// �迭 copy
		int[] arCpy = Arrays.copyOf(arr, arr.length);
		
		System.out.println(arr);
		System.out.println(arCpy);
		
		// �迭 ���� copy
		rcopy(arr, arCpy);
		for(int n : arCpy) {
			System.out.print(n + " ");
		}
		

	}

}
