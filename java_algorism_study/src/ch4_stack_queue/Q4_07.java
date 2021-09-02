package ch4_stack_queue;

//Deque 구현(양방향 대기열)

class Deque{
	int max; // 최대 용량
	int front; // 앞쪽 커서
	int rear; // 뒤쪽 커서
	int[] que; // dqueue 본체
	int num; // 현재 데이터 개수

	
	public Deque(int max) {
		this.max = max;
		front = rear = num = 0;
		
		try {
			que = new int[max];
		}catch (OutOfMemoryError e) {
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
	
	public int enqueFront(int n) throws OverflowIntStackException{
	
		if(num >= max) {
			throw new OverflowIntStackException();
		}
		
		num++;
		
		que[front++] = n;
		
		if(front == max) {
			front = 0;
		}
		
		return n;
		
	}
	
	public int enqueRear(int n) throws OverflowIntStackException{
		
		if(num >= max) {
			throw new OverflowIntStackException();
		}
		
		num++;
		
		if(--rear < 0) {
			rear = max - 1;
		}
		
		return que[rear] = n;
		
	}
	
	public int dequeFront() throws EmptyIntStackException{
		
		if(num <= 0) {
			throw new EmptyIntStackException();
		}
		
		num--;
		
		if(--front < 0) {
			front = max - 1;
		}
		
		
		return que[front];
	}
	
	public int dequeRear() throws EmptyIntStackException{
		
		if(num <= 0) {
			throw new EmptyIntStackException();
		}
		
		num--;
		
		int n = que[rear++];
		
		if(rear == max) {
			rear = 0;
		}
	
		return n;
	}
	
	public int peekFront() throws EmptyIntStackException{
		
		if(num <= 0) {
			throw new EmptyIntStackException();
		}
		
		int idx = front - 1;
		
		if(idx < 0) {
			idx = max - 1;
		}
		
		return que[idx];
	}
	
	public int peekRear() throws EmptyIntStackException{
	
		if(num <= 0) {
			throw new EmptyIntStackException();
		}
		
		int idx = rear + 1;
		
		if(idx == max) {
			idx = 0;
		}
		
		return que[idx];
	}
	
	public int indexOf(int n) {
		
		for(int i = 1; i <= num; i++) {
			if(que[(i + rear) % max] == n) {
				return (i + rear) % max;
			}
		}
		
		return -1;
	}
	
}

public class Q4_07 {

	public static void main(String[] args) {
		Deque queue = new Deque(5);
		
		queue.enqueFront(1);
		queue.enqueRear(2);
		queue.enqueRear(3);
		queue.enqueFront(4);
		queue.enqueRear(5);
		
		System.out.println(queue.dequeRear());
		queue.enqueFront(6);
		System.out.println(queue.peekFront());
		
		System.out.println(queue.indexOf(2));

	}

}
