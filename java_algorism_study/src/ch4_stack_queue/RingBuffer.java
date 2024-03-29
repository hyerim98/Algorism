package ch4_stack_queue;

import java.util.Scanner;

// 링버퍼 구현(오래된 데이터를 버리는 용도)

public class RingBuffer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cnt = 0, retry = 0;
		
		int[]buf = new int[n];
		
		do {
			buf[cnt++ % n] = sc.nextInt();
			System.out.print("한번 더? ( 0 : no, 1 : yes)");
			retry = sc.nextInt();
		}while(retry == 1);
		
		int i = cnt - n;
		if(i < 0) {
			i = 0;
		}
		
		for(; i < cnt; i++) {
			System.out.print(buf[i % n] + " ");
		}
	}

}
