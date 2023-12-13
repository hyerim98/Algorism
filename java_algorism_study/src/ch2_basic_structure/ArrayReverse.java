package ch2_basic_structure;

/* 배열의 순서 변경 */
public class ArrayReverse {
	public static void arrayReverse(int[] arr, int idx1, int idx2) {
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.printf("\narr[%d]와 arr[%d]를 교환합니다.\n", idx1, idx2);
		
		int tmp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = tmp;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int len = arr.length;
		
		for(int i = 0; i < len / 2; i++) {
			arrayReverse(arr, i, len - i - 1);
		}
		
		for(int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println("\n역순 정렬을 마쳤습니다.");
	}

}
