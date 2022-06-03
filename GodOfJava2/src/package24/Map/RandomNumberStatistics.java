package package24.Map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
	private final int DATA_BOUNDARY = 50;
	Random rand = new Random();
	Hashtable<Integer, Integer> hash = new Hashtable<>();

	public static void main(String[] args) {
		RandomNumberStatistics sample = new RandomNumberStatistics();
		sample.getRandomNumberStatistics();

	}

	public void getRandomNumberStatistics() {
		for (int i = 0; i < 5000; i++) {
			putCurrentNumber(rand.nextInt(DATA_BOUNDARY) + 1);
		}
		printStatistics();
		printSumOfValues();
	}

	public void putCurrentNumber(int tempNumber) {
		Integer num = Integer.valueOf(tempNumber);

		if (hash.containsKey(num)) {
			hash.put(num, hash.get(num) + 1);
		} else {
			hash.put(num, 1);
		}
	}

	public void printStatistics() {
		Set<Integer> tableKeySet = hash.keySet();
		for (Integer num : tableKeySet) {
			System.out.println(num + "=" + hash.get(num));
			if (num % 10 == 1) {
				System.out.println();
			}
		}
	}

	public void printSumOfValues() {
		Set<Map.Entry<Integer, Integer>> entry = hash.entrySet();
		int sum = 0;
		for (Map.Entry<Integer, Integer> ent : entry) {
			sum += ent.getValue();
		}
		System.out.println(sum);

	}
}
