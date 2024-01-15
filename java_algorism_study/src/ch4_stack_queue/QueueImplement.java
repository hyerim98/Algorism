package ch4_stack_queue;

// int�� �����͸� ���� �� �ִ� queue ����(ring buffer ���)
// �ð� ���⵵ : O(1)

class Queue{
	int max; // �ִ� �뷮
	int front; // ����
	int rear; // ����
	int num; // ���� ������ ��
	int[] que; // ť�� ��ü
	
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
			System.out.println("ť�� ������ϴ�");
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(que[(i + front) % max] + " ");
		}
		
		System.out.println();
	}
	
	// ã�� �� ��ġ�� �迭 �ε����� ��ȯ
	public int indexOf(int n) {
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == n) {
				return idx;
			}
		}
		return -1;
	}
	
	// ť �ȿ��� ã�� ���� �� ��°�� �ִ��� ��ȯ
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
