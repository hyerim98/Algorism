package ch2_basic_structure;

import java.time.LocalDate;
import java.util.Scanner;

/* 그 해 경과 일수, 그 해 남은 일수(LocalDate 클래스 사용) */
public class DayOfYear {
	// 그 해 경과 일수
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
	
	// 그 해 남은 일수
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
			System.out.print("연도 : ");
			int year = scan.nextInt();
			System.out.print("월 : ");
			int month = scan.nextInt();
			System.out.print("일 : ");
			int day = scan.nextInt();
			
			System.out.println("그 해 경과 일수 : " + dayOfYear(year, month, day));
			System.out.println("그 해 남은 일수 : " + leftDayOfYear(year, month, day));
			
			System.out.println("종료 : n, 다시 : y : ");
			retry = scan.next();
		}while(retry.equals("y"));
		
		                   
		
	}

}
