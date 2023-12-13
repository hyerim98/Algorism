package ch2_basic_structure;

import java.time.LocalDate;

class YMD {
	int y;
	int m;
	int d;
	
	public YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
}

public class AfterBeforeDay {
	public static LocalDate after(LocalDate date, int n) {
		return date.plusDays(n);
		
	}
	
	public static LocalDate before(LocalDate date, int n) {
		return date.minusDays(n);
	}
	
	public static void main(String[] args) {
		YMD ymd = new YMD(2023, 12, 13);
		
		LocalDate date = LocalDate.of(ymd.y, ymd.m, ymd.d);
		System.out.printf("%d일 후의 날짜 : %s\n", 50, after(date, 50));
		System.out.printf("%d일 전의 날짜 : %s", 50, before(date, 50));

	}

}
