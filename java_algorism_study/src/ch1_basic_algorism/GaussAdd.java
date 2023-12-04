package ch1_basic_algorism;

// ���콺 ����

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
		// 1���� n���� ���ϴ� ���콺 ����
		System.out.println(gaussAdd(6));
		
		// start���� end���� ���ϴ� ���콺 ����
		System.out.println(gaussAdd(1, 13));
	}

}
