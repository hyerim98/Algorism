package ch3;

import java.util.Arrays;
import java.util.Comparator;

// �ν��Ͻ� �ʵ� �� Ư�� �ʵ� �������� �˻� (implement Comparator)
// **** binarySearch�� ���� Ž���� ������� �ϴ� ���̱� ������ �����Ͱ� ������ �Ǿ��־�� �Ѵ�.
/*
 * Comparable : sort�� �ϱ� ���� �������̽�
 * Comparator : binarySearch�� �ϱ� ���� �������̽�
*/

class Person implements Comparable{
	private String name;
	private int height;
	
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name + " " + height;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		return p.height - this.height;
	}
	
}

class HeightOrderComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o2.getHeight() - o1.getHeight();
	}
	
}


public class Q03_07 {

	public static void main(String[] args) {
		
		Person[] p = new Person[3];
		
		p[0] = new Person("aaa", 185);
		p[1] = new Person("bbb", 165);
		p[2] = new Person("ccc", 170);
		
		Arrays.sort(p);
		
		for(Person x : p) {
			System.out.println(x);
		}
		
		
		int idx = Arrays.binarySearch(p, new Person("",185), new HeightOrderComparator());
		
		System.out.println(p[idx]);
		
		
	}

}
