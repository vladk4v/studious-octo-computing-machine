package ru.netology;

import java.util.Random;

public class FalseRandom extends Random {
	private Random randomP;
	int min;
	int max;

	public FalseRandom(int min, int max) {
		randomP = new Random();
		this.min = min;
		this.max = max;
	}

	@Override
	public int nextInt() {
		return randomP
				.ints(min, max + 1)
				.iterator()
				.nextInt();
	}
}
