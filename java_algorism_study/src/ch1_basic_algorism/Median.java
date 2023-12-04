package ch1_basic_algorism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// 정렬을 이용화여 중앙 값 구하기

public class Median {
	/*
	 * 배열 : Arrays.sort() -> 평균 O(nlog(n)), 최악 O(n^2)
	 * 컬렉션 : Collections.sort() -> 평균,최악 O(nlog(n))
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
		System.out.print("3개의 값 입력 : ");
		
		// 배열
		int[] arr = new int[3];
		
		for(int i = 0 ; i < 3 ; i++) {
			arr[i] = stdIn.nextInt();
		}
		
		System.out.println(mediArray(arr));
		
		
		// 컬렉션
		/*
		 * Arrays.stream(arr) OR IntStream.of(arr) : 배열을 stream화
		 * boxed() : stream의 개별 값을 wrapper하여 Integer 객체로 변경
		 * collect(Collectors.toList()) : collect를 통해서 List로 모아준다
		*/
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		
		System.out.println(mediList(list));
	

	}

}
