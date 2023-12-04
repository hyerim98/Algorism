package ch1_basic_algorism;

// °¡¿ì½º µ¡¼À

public class GaussAdd {
	public static int gaussAdd(int n) {
		int sum = 1 + n;
		return sum * (n / 2) + (n % 2 == 0 ? 0 : sum / 2);
	}
	
	public static int gaussAdd(int a, int b) {
		int start = 0;
		int end = 0;
		
		if(a < b) {
			start = a;
			end = b;
		}
		else {
			start = b;
			end = a;
		}
		
		int sum = start + end;
		
		return sum * (end / 2) + (end % 2 == 0 ? 0 : sum / 2);
		
	}

	public static void main(String[] args) {
		// 1ºÎÅÍ n±îÁö ´õÇÏ´Â °¡¿ì½º µ¡¼À
		System.out.println(gaussAdd(6));
		
		// startºÎÅÍ end±îÁö ´õÇÏ´Â °¡¿ì½º µ¡¼À
		System.out.println(gaussAdd(1, 13));
	}

}
