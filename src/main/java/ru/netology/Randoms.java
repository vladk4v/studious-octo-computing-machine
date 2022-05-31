package ru.netology;

import java.util.*;

public class Randoms implements Iterable<Integer> {
	protected Random random;

	public Randoms(int min, int max) {
		random = new FalseRandom(min, max);

		random.ints(min, max + 1)
				.iterator()
				.nextInt();
	}

	@Override
	public Iterator<Integer> iterator() {

		return new Iterator<>() {
			@Override
			public boolean hasNext() {
				return true;
			}

			@Override
			public Integer next() {
				return random.nextInt();
			}
		};
	}
}
