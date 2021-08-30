package ch4_stack_queue;

import ch4_stack_queue.TwoStack.AorB;

// 하나의 배열을 공유하여 2개의 스택을 구현

class TwoStack{
	
	int max; //스택 용량
	int ptrA; //스택A의 현위치
	int ptrB; //스택B의 현위치
	int[] stk; //스택 본체
	
	public TwoStack(int max) {
		this.max = max;
		ptrA = 0;
		ptrB = max -1;
		try {
			stk = new int[max];
		}
		catch (OutOfMemoryError e) {
			max = 0;
		}
		
	}
	
	public enum AorB{
		stackA, stackB;
	}
	
	public static class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {
			
		}
	}
	
	public static class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {
			
		}
	}
	
	public int push(AorB ab, int n) throws OverflowIntStackException{
		if(ptrA >= ptrB) {
			throw new OverflowIntStackException();
		}
		
		switch (ab) {
		case stackA:
			
			if(ptrA >= (max / 2) - 1) {
				System.out.println("stackA가 가득 찼습니다");
				return -1;
			}
			
			stk[ptrA++] = n;

		case stackB:
			if(ptrB <= (max / 2) + 1) {
				System.out.println("stackB가 가득 찼습니다");
				return -1;
			}
			
			stk[ptrB--] = n;
		}
		
		return n;
		
	}
	
	public int pop(AorB ab) throws EmptyIntStackException{
		int n = 0;
		
		if(ptrA == 0 && ptrB == max) {
			throw new EmptyIntStackException();
		}
		
		switch (ab) {
		case stackA:
			
			if(ptrA == 0) {
				System.out.println("stackA가 비었습니다");
				return -1;
			}
			
			n = stk[--ptrA];
			break;

		case stackB:
			if(ptrB == max) {
				System.out.println("stackB가 비었습니다");
				return -1;
			}
			
			n = stk[++ptrB];
			break;
		}
		
		return n;
		
	}
	
	public int peek(AorB ab) throws EmptyIntStackException{
		int n = 0;
		
		if(ptrA == 0 && ptrB == max) {
			throw new EmptyIntStackException();
		}
		
		switch (ab) {
		case stackA:
			
			if(ptrA == 0) {
				System.out.println("stackA가 비었습니다");
				return -1;
			}
			
			n = stk[ptrA - 1];
			break;

		case stackB:
			if(ptrB == max) {
				System.out.println("stackB가 비었습니다");
				return -1;
			}
			
			n = stk[ptrB + 1];
			break;
		}
		
		return n;
		
	}
	
	public void dump(AorB ab) {
		if(ptrA == 0 && ptrB == max) {
			throw new EmptyIntStackException();
		}
		
		switch (ab) {
		case stackA:
			
			if(ptrA == 0) {
				System.out.println("stackA가 비었습니다");
				return;
			}
			for(int i = 0; i < ptrA; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
			
			break;

		case stackB:
			if(ptrB == max) {
				System.out.println("stackB가 비었습니다");
				return;
			}
			for(int i = max - 1; i >= ptrB + 1; i--) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
			break;
			
		default : 
			return;
		}
	}
	
	public int indexOf(AorB ab, int n){
		switch (ab) {
		case stackA:
			for(int i = ptrA - 1; i >= 0; i--) {
				if(stk[i] == n) {
					return i;
				}
			}
			
			return -1;

		case stackB:
			for(int i = max - 1; i >= ptrB + 1; i--) {
				if(stk[i] == n) {
					return i;
				}
			}
			
			return -1;
			
		default : 
			return -1;
		}

	}
	
	
}

public class Q4_03 {

	public static void main(String[] args) {
		TwoStack stack = new TwoStack(11);
		
		stack.push(AorB.stackA, 1);
		stack.push(AorB.stackA, 2);
		stack.push(AorB.stackA, 3);
		stack.push(AorB.stackB, 4);
		stack.push(AorB.stackB, 5);
		stack.push(AorB.stackB, 6);
		
		stack.dump(AorB.stackA);
		stack.dump(AorB.stackB);
		
		int idx = stack.indexOf(AorB.stackB, 4);
		
		if(idx < 0) {
			System.out.println("값이 존재하지 않습니다.");
		}
		else {
			System.out.println(idx + "의 값이 존재합니다");
		}
		
		System.out.println(stack.peek(AorB.stackA));
		System.out.println(stack.pop(AorB.stackB));
		
		stack.dump(AorB.stackB);

	}

}
