package ch2_basic_structure;

import java.time.LocalDate;
import java.util.Scanner;

/* �� �� ��� �ϼ�, �� �� ���� �ϼ�(LocalDate Ŭ���� ���) */
public class DayOfYear {
	// �� �� ��� �ϼ�
	public static int dayOfYear(int y, int m, int d) {
		LocalDate newDate;
		int dayOfYear = 0;
		
		for(int i = 1; i < m; i++) {
			newDate = LocalDate.of(y, i, 1);
			dayOfYear += newDate.lengthOfMonth();
		}
		
		dayOfYear += d;
		
		return dayOfYear;
	}
	
	// �� �� ���� �ϼ�
	public static int leftDayOfYear(int y, int m, int d) {
		int dayOfYear = y % 4 == 0 && y % 100 != 0 || y % 400 == 0 ? 366 : 365;
		int leftDayOfYear = 0;
		LocalDate newDate;
		
		for(int i = 12; i >= m; i--) {
			newDate = LocalDate.of(y, i, 1);
			leftDayOfYear += newDate.lengthOfMonth();
		}
		
		leftDayOfYear -= d;
		
		
		return leftDayOfYear;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String retry;
		
		do {
			System.out.print("���� : ");
			int year = scan.nextInt();
			System.out.print("�� : ");
			int month = scan.nextInt();
			System.out.print("�� : ");
			int day = scan.nextInt();
			
			System.out.println("�� �� ��� �ϼ� : " + dayOfYear(year, month, day));
			System.out.println("�� �� ���� �ϼ� : " + leftDayOfYear(year, month, day));
			
			System.out.println("���� : n, �ٽ� : y : ");
			retry = scan.next();
		}while(retry.equals("y"));
		
		                   
		
	}

}
