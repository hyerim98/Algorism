package ch1_basic_algorism;

import java.util.stream.IntStream;

// IntStream을 이용한 구구단 출력

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
