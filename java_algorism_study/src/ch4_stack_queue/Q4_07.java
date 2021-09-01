package ch4_stack_queue;

//Deque ����(����� ��⿭)

class Deque{
	int max; // �ִ� �뷮
	int front; // ���� Ŀ��
	int rear; // ���� Ŀ��
	int[] que; // dqueue ��ü
	int num; // ���� ������ ����

	
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
	
		
		return n;
		
	}
	
	public int enqueRear(int n) throws OverflowIntStackException{
	
		
		return n;
		
	}
	
	public int dequeFront() throws EmptyIntStackException{
	
		
		return 0;
	}
	
	public int dequeRear() throws EmptyIntStackException{
	
		return 0;
	}
	
	public int peekFront() throws EmptyIntStackException{
		
		
		return 0;
	}
	
	public int peekRear() throws EmptyIntStackException{
	
		
		return 0;
	}
	
	public int indexOf(int n) {
		return -1;
	}
	
}

public class Q4_07 {

	public static void main(String[] args) {
		

	}

}
