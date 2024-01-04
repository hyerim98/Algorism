package review;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;


public class Practice {
	public static int searchKey(int[] arr, int n, int key) {
		int pl = 0;
		int pc = n / 2;
		int pr = n - 1;
		
		
		do {		
			if(arr[pc] == key) {
				if(pc == 0) {
					return pc;
				}
				
				do {
					pc--;
				}while(arr[pc] == key);
				
				return ++pc;
			}
			else if(arr[pc] < key) {
				pl = pc + 1;
				pc = (pl + pr) / 2;
			}
			else {
				pr = pc - 1;
				pc = (pl + pr) / 2;
			}
		}while(pl <= pr);
		
		return -1;
	}
	 
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int[] arr = {1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9};
	        System.out.print("검색할 값 : ");
	        int key = scan.nextInt();
	        
	        int idx = searchKey(arr, arr.length, key);
	        if(idx == -1) {
	        	System.out.println("존재하지 않는 값 입니다");
	        }
	        else {
	        	System.out.printf("arr[%d]에 존재\n", idx);
	        }
	    }
	
}
