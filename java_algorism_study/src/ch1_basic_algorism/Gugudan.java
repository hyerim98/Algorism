package ch1_basic_algorism;

import java.util.stream.IntStream;

// IntStream�� �̿��� ������ ���

public class Gugudan {

	public static void main(String[] args) {
		IntStream.rangeClosed(1, 9).forEach(i -> {
			IntStream.rangeClosed(1, 9).forEach(j -> {
				System.out.println(i + " * " + j + " = " + (i * j));
			});
			System.out.println();
		});

	}

}
