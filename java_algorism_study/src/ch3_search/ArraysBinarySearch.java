package ch3_search;

import java.util.Arrays;
import java.util.Comparator;

// �ν��Ͻ� �ʵ� �� Ư�� �ʵ� �������� �˻� (implement Comparator)
// **** binarySearch�� ���� Ž���� ������� �ϴ� ���̱� ������ �����Ͱ� ������ �Ǿ��־�� �Ѵ�.
/*
 * Comparable : �����ϱ� ���� �����Ǿ� �־�� �� �������̽�
 * Comparator : �̹� ������ �Ǿ��ִ� ����� �ش� �������̽��� �����Ͽ� binarySearch �޼��� �Ű������� ����
 	* ��, ������ class�� Comparable�� �����Ǿ� ������, Comparator�� �����Ͽ� binarySearch �Ű������� �ѱ� �ʿ�� ���� 
*/

class Person implements Comparable{
	private String name;
	private int height;
	private double vision;
	
	public Person(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	public int getHeight() {
		return height;
	}

	public String getName() {
		return name;
	}
	
	public double getVision() {
		return vision;
	}
	
	@Override
	public String toString() {
		return name + " " + height + " " + vision;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		// return int���� ����� ���� ����
		return (p.vision - this.vision > 0) ? 1 :
				(p.vision - this.vision < 0) ? -1 : 0; 
	}
	
}

// ������ �̹� �Ǿ��ִٸ� Comparator�� �����Ͽ� binarySearch �޼ҵ� �Ű������� �ѱ�
class HeightOrderComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o2.getHeight() - o1.getHeight();
	}
	
}


public class ArraysBinarySearch {

	public static void main(String[] args) {
		
		Person[] p = new Person[4];
		
		p[0] = new Person("aaa", 185, 0.1);
		p[1] = new Person("bbb", 165, 0.7);
		p[2] = new Person("ccc", 170, 0.5);
		p[3] = new Person("ddd", 166, 1.9);
		
		Arrays.sort(p);
		
		for(Person x : p) {
			System.out.println(x);
		}
		
		// �迭 p�� �������� ������ �Ǿ��ִٸ� binarySearch �Ű������� ������ Comparator�� ����
		// �迭 p�� Comparable�� ���� ���ĵǾ� �ִٸ� �Ʒ��� ���� 2���� �Ű������� ����
		int idx = Arrays.binarySearch(p, new Person("",0, 0.5));//, new HeightOrderComparator());
		
		System.out.printf("%d �ε����� ����", idx);
		
		
	}

}
