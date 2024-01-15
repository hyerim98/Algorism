package ch4_stack_queue;

// int형 데이터를 쌓을 수 있는 queue 구현(ring buffer 사용)
// 시간 복잡도 : O(1)

class Queue{
	int max; // 최대 용량
	int front; // 앞쪽
	int rear; // 뒤쪽
	int num; // 현재 데이터 수
	int[] que; // 큐의 본체
	
	public Queue(int max) {
		this.max = max;
		num = front = rear = 0;
		try {
			que = new int[max];
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
	
	public int enque(int n) throws OverflowIntStackException{
		if(num >= max) {
			throw new OverflowIntStackException();
		}
		
		num++;
		
		que[rear++] = n;
		
		if(rear == max) {
			rear = 0;
		}
		
		return n;
	}
	
	public int deque() throws EmptyIntStackException{
		if(num <= 0) {
			throw new EmptyIntStackException();
		}
		
		num--;
		int n = que[front++];
		if(front == max) {
			front = 0;
		}
		
		return n;
	}
	
	public int peek() throws EmptyIntStackException{
		if(num <= 0) {
			throw new EmptyIntStackException();
		}
		
	
		return que[front];
	}
	
	public void dump() {
		if(num <= 0) {
			System.out.println("큐가 비었습니다");
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(que[(i + front) % max] + " ");
		}
		
		System.out.println();
	}
	
	// 찾은 값 위치의 배열 인덱스를 반환
	public int indexOf(int n) {
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == n) {
				return idx;
			}
		}
		return -1;
	}
	
	// 큐 안에서 찾은 값이 몇 번째에 있는지 반환
	public int search(int x) {
		
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == x) {
				return i + 1;
			}
		}
		
		return 0;
	}
}

public class QueueImplement {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		
		queue.enque(1);
		queue.enque(2);
		queue.enque(3);
		queue.enque(4);
		queue.enque(5);
		
		queue.dump();
		
		System.out.println(queue.peek());
		System.out.println(queue.deque());
		
		queue.dump();
		
		System.out.println(queue.indexOf(5));
		
		System.out.println(queue.search(3));
		

	}

}
