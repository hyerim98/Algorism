package ch5_recursion;

// 재귀로 하노이 탑 구현하기

public class Hanoi {
	
	static String[] pole = {"A기둥", "B기둥", "C기둥"};
	
	public static void hanoi(int no, int x, int y) {
		if(no > 1) {
			hanoi(no - 1, x, 6 - x - y);
		}
		
		System.out.println("원반[" + no + "] 을" + pole[x - 1] + "에서 " + pole[y - 1] + "으로 옮겼습니다");
		
		if(no > 1) {
			hanoi(no - 1, 6 - x - y, y);
		}
	}

	public static void main(String[] args) {
		
		hanoi(3, 1, 3); // 3개의 원반을 1번 기둥에서 3번 기둥으로 옮긴다

	}

}
