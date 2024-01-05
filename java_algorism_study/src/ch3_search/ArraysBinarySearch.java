package ch3_search;

import java.util.Arrays;
import java.util.Comparator;

// 인스턴스 필드 중 특정 필드 기준으로 검색 (implement Comparator)
// **** binarySearch는 이진 탐색을 기반으로 하는 것이기 때문에 데이터가 정렬이 되어있어야 한다.
/*
 * Comparable : 정렬하기 위해 구현되어 있어야 할 인터페이스
 * Comparator : 이미 정렬이 되어있는 경우라면 해당 인터페이스를 구현하여 binarySearch 메서드 매개변수로 전달
 	* 즉, 정의한 class에 Comparable이 구현되어 있으면, Comparator를 구현하여 binarySearch 매개변수로 넘길 필요는 없음 
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
		// return int형을 만들기 위한 로직
		return (p.vision - this.vision > 0) ? 1 :
				(p.vision - this.vision < 0) ? -1 : 0; 
	}
	
}

// 정렬이 이미 되어있다면 Comparator를 구현하여 binarySearch 메소드 매개변수로 넘김
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
		
		// 배열 p가 수동으로 정렬이 되어있다면 binarySearch 매개변수에 구현한 Comparator를 전달
		// 배열 p가 Comparable에 의해 정렬되어 있다면 아래와 같이 2개의 매개변수만 전달
		int idx = Arrays.binarySearch(p, new Person("",0, 0.5));//, new HeightOrderComparator());
		
		System.out.printf("%d 인덱스에 존재", idx);
		
		
	}

}
