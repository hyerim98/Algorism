package ch2;

// 이번 년도 남은 날짜 계산

public class Q2_09 {
	
	public static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	public static int isLeaf(int y) {
		return y % 4==0 && y % 400==0 || y % 100!=0 ? 1 : 0;
	}
	
	public static int leftDayOfYear(int y, int m, int d) {
		int day = mdays[isLeaf(y)][m - 1] - d;
		
		for(int i = 12; i > m; i--) {
			day += mdays[isLeaf(y)][i - 1];
		}
		return day;
	}

	public static void main(String[] args) {
		
		System.out.println(leftDayOfYear(2021, 12, 30));
	}

}
