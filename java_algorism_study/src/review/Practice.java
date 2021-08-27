package review;

import java.util.Arrays;
import java.util.Comparator;

class Person implements Comparable{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		return this.name.length() - p.name.length();
	}
}

class AgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		return o1.getName().length() - o2.getName().length();
	}
	
}


public class Practice {

	public static void main(String[] args) {
		Person p[] = new Person[5];
		
		p[0] = new Person("aaa", 25);
		p[1] = new Person("bbbbbb", 22);
		p[2] = new Person("cccccccc", 51);
		p[3] = new Person("dddd", 30);
		p[4] = new Person("eeeee", 28);
		
		Arrays.sort(p);
		
		for(Person x : p) {
			System.out.println(x);
		}
		
		int idx = Arrays.binarySearch(p, new Person("bbbbbb", 0), new AgeComparator());
		System.out.println();
		System.out.println(p[idx]);

	}

}
