package ch2;

// 배열을 역순으로 바꾸기

public class Q2_02 {
	
	
	
	public static void reverseArr(int[]arr) {
		int idx = arr.length / 2;
		
		for(int i = 0; i < idx; i++) {
			int tmp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = tmp;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {5, 10, 73, 2, -5, 42};
		reverseArr(arr);
		
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}

}
