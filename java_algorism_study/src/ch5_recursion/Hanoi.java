package ch5_recursion;

// ��ͷ� �ϳ��� ž �����ϱ�

public class Hanoi {
	
	static String[] pole = {"A���", "B���", "C���"};
	
	public static void hanoi(int no, int x, int y) {
		if(no > 1) {
			hanoi(no - 1, x, 6 - x - y);
		}
		
		System.out.println("����[" + no + "] ��" + pole[x - 1] + "���� " + pole[y - 1] + "���� �Ű���ϴ�");
		
		if(no > 1) {
			hanoi(no - 1, 6 - x - y, y);
		}
	}

	public static void main(String[] args) {
		
		hanoi(3, 1, 3); // 3���� ������ 1�� ��տ��� 3�� ������� �ű��

	}

}
