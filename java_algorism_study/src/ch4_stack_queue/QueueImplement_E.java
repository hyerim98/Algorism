package ch4_stack_queue;

// ��ü�� �����͸� ���� �� �ִ� queue ����

class Gqueue<E>{
	int max; // �ִ� �뷮
	int front; // ����
	int rear; // ����
	int num; // ���� ������ ��
	E[] que; // ť�� ��ü
	
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
		
		if(rear == max) {
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
		if(front == max) {
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
		if(num <= 0) {
			System.out.println("ť�� ������ϴ�");
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(que[(i + front) % max] + " ");
		}
		
		System.out.println();
	}
	
	public int indexOf(E n) {
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx].equals(n)) {
				return idx;
			}
		}
		return -1;
	}
	
	public int search(E x) {
		
		for(int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx].equals(x)) {
				return i + 1;
			}
		}
		
		return 0;
	}
}

public class QueueImplement_E {

	public static void main(String[] args) {
		Gqueue<String> queue = new Gqueue(5);
		
		queue.enque("one");
		queue.enque("two");
		queue.enque("three");
		queue.enque("four");
		queue.enque("five");
		
		queue.dump();
		
		System.out.println(queue.peek());
		System.out.println(queue.deque());
		
		queue.dump();
		
		System.out.println(queue.indexOf("three"));
		
		System.out.println(queue.search("four"));
		

	}

}
