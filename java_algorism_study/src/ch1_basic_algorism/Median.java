package ch1_basic_algorism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// ������ �̿�ȭ�� �߾� �� ���ϱ�

public class Median {
	/*
	 * �迭 : Arrays.sort() -> ��� O(nlog(n)), �־� O(n^2)
	 * �÷��� : Collections.sort() -> ���,�־� O(nlog(n))
	*/
	public static int mediArray(int[] arr) {
		int target = arr.length / 2;
		Arrays.sort(arr);
		
		return arr[target];
	}
	
	public static int mediList(List<Integer> arr) {
		int target = arr.size() / 2;
		Collections.sort(arr);
		
		return arr.get(target);
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("3���� �� �Է� : ");
		
		// �迭
		int[] arr = new int[3];
		
		for(int i = 0 ; i < 3 ; i++) {
			arr[i] = stdIn.nextInt();
		}
		
		System.out.println(mediArray(arr));
		
		
		// �÷���
		/*
		 * Arrays.stream(arr) OR IntStream.of(arr) : �迭�� streamȭ
		 * boxed() : stream�� ���� ���� wrapper�Ͽ� Integer ��ü�� ����
		 * collect(Collectors.toList()) : collect�� ���ؼ� List�� ����ش�
		*/
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		System.out.println(mediList(list));
	

	}

}
