package ch1_basic_algorism;

import java.util.Arrays;

/* ��Ʈ�� ����Ͽ� �ִ밪 �ּҰ� ���ϱ� */

public class MaxMin {
	public static int max(int a, int b, int c, int d) {
		int[] arr = {a,b,c,d};
		
		int max = Arrays.stream(arr).max().getAsInt();
		
		return max;
	}
	
	public static int min(int a, int b, int c) {
		int[] arr = {a,b,c,};
		
		int min = Arrays.stream(arr).min().getAsInt();
		
		return min;
	}
	
	
	public static void main(String[] args) {
		System.out.println(max(34, 90, 65, 23));
		System.out.println(min(34, 90, 24));
	}

}
