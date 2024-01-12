package ch4_stack_queue;

// stack 구현

class Stack<E>{
	
	int max; //스택 용량
	int ptr; //스택 현위치
	E[] stk; //스택 본체
	
	public Stack(int max) {
		this.max = max;
		ptr = 0;
		try {
			stk = (E[])new Object[max];
		}
		catch (OutOfMemoryError e) {
			max = 0;
		}
		
	}
	
	public static class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {
			super("스택이 비어있습니다.");
		}
	}
	
	public static class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {
			super("스택이 가득 차 있습니다.");
		}
	}
	
	public E push(E n) throws OverflowIntStackException{
		if(ptr >= max) {
			// 예외 발생
			throw new OverflowIntStackException();
		}
		
		return stk[ptr++] = n;
	}
	
	public E pop() throws EmptyIntStackException{
		if(ptr == 0) {
			throw new EmptyIntStackException();
		}
		
		return stk[--ptr];
	}
	
	public E peek() throws EmptyIntStackException{
		if(ptr == 0) {
			throw new EmptyIntStackException();
		}
		
		return stk[ptr - 1];
	}
	
	public void dump() {
		if(ptr <= 0) {
			System.out.println("값이 없습니다");
		}
		else {
			for(int i = 0; i < ptr; i++) {
				System.out.print(stk[i] + " ");
			}
		}
		
		System.out.println();
	}
	
	public int indexOf(E n){
		for(int i = ptr - 1; i >= 0; i--) {
			if(stk[i].equals(n)) {
				return i;
			}
		}
		
		return -1;
	}
	
	
}

public class StackImplement {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		
		System.out.println(stack.push("aaa"));
		System.out.println(stack.push("bbb"));
		System.out.println(stack.push("ccc"));
		
		stack.dump();
		
		int idx = stack.indexOf("bbb");
		
		if(idx < 0) {
			System.out.println("값이 존재하지 않습니다.");
		}
		else {
			System.out.println(idx + "의 값이 존재합니다");
		}
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
		stack.dump();

	}

}
