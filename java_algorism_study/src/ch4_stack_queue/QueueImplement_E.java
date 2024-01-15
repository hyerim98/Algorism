package ch4_stack_queue;


// 객체형 데이터를 쌓을 수 있는 queue 구현(ring buffer 사용)

class Gqueue<E>{
	int max; // 최대 용량
	int front; // 앞쪽
	int rear; // 뒤쪽(제일 먼저 꺼내지는 순서)
	int num; // 현재 데이터 수
	E[] que; // 큐의 본체
	
	public Gqueue(int max) {
		this.max = max;
		num = front = rear = 0;
		try {
			que = (E[])new Object[max];
		}
		catch (OutOfMemoryError e) {
			max = 0;
		}
	}
	
	public static class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {
			
		}
	}
	
	public static class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {
			
		}
	}
	
	public E enque(E n) throws OverflowIntStackException{
		if(num >= max) {
			throw new OverflowIntStackException();
		}
		
		num++;
		
		que[rear++] = n;
		if(rear >= max) {
			rear = 0;
		}
		
		return n;
	}
	
	public E deque() throws EmptyIntStackException{
		if(num <= 0) {
			throw new EmptyIntStackException();
		}
		
		num--;
		
		E n = que[front++];
		if(front >= max) {
			front = 0;
		}
		
		return n;
		
	}
	
	public E peek() throws EmptyIntStackException{
		if(num <= 0) {
			throw new EmptyIntStackException();
		}
		
		
		return que[front];
		
	}
	
	public void dump() {
		for(int i = 0; i < num; i++) {
			System.out.print(que[(i + front) % max] + " ");
		}
		
		System.out.println();
	}
	
	public int indexOf(E n) throws EmptyIntStackException{
		if(num <= 0) {
			throw new EmptyIntStackException();
		}
		
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx].equals(n)) {
				return idx;
			}
		}
		
		return -1;
		
	}
	
	public int search(E n) throws EmptyIntStackException{
		if(num <= 0) {
			throw new EmptyIntStackException();
		}
		
		for(int i = 0; i < num; i++) {
			if(que[(i + front) % max].equals(n)) {
				return i + 1;
			}
		}
		
		return 0;
		
	}
}

public class QueueImplement_E {

	public static void main(String[] args) {
		Gqueue queue = new Gqueue(5);
		
		queue.enque("one");
		queue.enque("two");
		queue.enque("three");
		queue.enque("four");
		queue.enque("five");
		
		System.out.println(queue.deque());
		queue.dump();
		queue.enque("six");
		System.out.println(queue.peek());
		queue.dump();
		
		System.out.println(queue.indexOf("five"));
		System.out.println(queue.search("two"));
		

	}

}
