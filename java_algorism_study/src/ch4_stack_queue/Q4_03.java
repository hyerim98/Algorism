package ch4_stack_queue;

import ch4_stack_queue.TwoStack.AorB;

// 하나의 배열을 공유하여 2개의 스택을 구현

class TwoStack{
	
	int max; // 최대용량
	int ptrA; // ptrA의 위치
	int ptrB; // ptrB의 우치
	int[] stk; // 스택 본체
	
	public TwoStack(int max) {
		this.max = max;
		ptrA = 0;
		ptrB = max - 1;
		
		try {
			stk = new int[max];
		}
		catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public enum AorB{
		stackA, stackB
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
		int num = 0;
		
		switch (ab) {
		case stackA:
			if(ptrA >= (max / 2) + 1) {
				throw new OverflowIntStackException();
			}
			
			num = stk[ptrA++] = n;
			
			break;

		case stackB:
			if(ptrB <= (max / 2)) {
				throw new OverflowIntStackException();
			}
			
			num = stk[ptrB--] = n;
			
			break;
		}
		
		return num;
		
		
	}
	
	public int pop(AorB ab) throws EmptyIntStackException{
		int num = 0;
		
		switch (ab) {
		case stackA:
			
			if(ptrA <= 0) {
				throw new EmptyIntStackException();
			}
			
			num = stk[--ptrA];
			
			break;

		case stackB:
			
			if(ptrB >= max) {
				throw new EmptyIntStackException();
			}
			
			num = stk[++ptrB];
			
			break;
		}
		
		return num;
		
	}
	
	public int peek(AorB ab) throws EmptyIntStackException{
		int num = 0;
		
		switch (ab) {
		case stackA:
			
			if(ptrA <= 0) {
				throw new EmptyIntStackException();
			}
			
			num = stk[ptrA - 1];
			
			break;

		case stackB:
			
			if(ptrB >= max) {
				throw new EmptyIntStackException();
			}
			
			num = stk[ptrB + 1];
			
			break;
		}
		
		return num;
		
	}
	
	public void dump(AorB ab) {
		switch (ab) {
		case stackA:
			
			if(ptrA <= 0) {
				throw new EmptyIntStackException();
			}
			
			for(int i = 0; i < ptrA; i++) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
			
			break;

		case stackB:
			
			if(ptrB >= max) {
				throw new EmptyIntStackException();
			}
			
			for(int i = max - 1; i > ptrB; i--) {
				System.out.print(stk[i] + " ");
			}
			System.out.println();
			
			
			break;
		}
	}
	
	public int indexOf(AorB ab, int n){
		
		switch (ab) {
		case stackA:
			
			for(int i = 0; i < ptrA; i++) {
				if(stk[i] == n) {
					return i;
				}
			}
			
			break;

		case stackB:
			
			for(int i = max - 1; i > ptrB; i--) {
				if(stk[i] == n) {
					return i;
				}
			}
			
			break;
		}
		
		return -1;
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
