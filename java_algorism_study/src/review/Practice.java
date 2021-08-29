package review;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;


class treeCompator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.intValue() - o1.intValue();
	}
	
}

public class Practice {
	

	public static void main(String[] args) {
		
		TreeSet<Integer> tr = new TreeSet<Integer>(new treeCompator());
		tr.add(30);
		tr.add(10);
		tr.add(20);
		System.out.println(tr);

	}

}
