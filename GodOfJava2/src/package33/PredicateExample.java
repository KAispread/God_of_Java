package package33;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		PredicateExample sample = new PredicateExample();

		Predicate<String> predicateLengh = (a) -> a.length() > 5;
		Predicate<String> predicateContains = (a) -> a.contains("God");
		Predicate<String> predicateStart = (a) -> a.startsWith("God");

		String godOfJava = "GodOfJava";
		String goodJava = "GoodJava";

		sample.predicateTest(predicateLengh, godOfJava);
		sample.predicateTest(predicateLengh, goodJava);

		sample.predicateNegate(predicateLengh, godOfJava);
		sample.predicateNegate(predicateLengh, goodJava);

		sample.predicateAnd(predicateLengh, predicateContains, godOfJava);
		sample.predicateAnd(predicateLengh, predicateContains, goodJava);

		sample.predicateOr(predicateLengh, predicateStart, godOfJava);
		sample.predicateOr(predicateLengh, predicateStart, goodJava);
	}

	private void predicateTest(Predicate<String> p, String data) {
		System.out.println(p.test(data));
	}

	private void predicateAnd(Predicate<String> p1, Predicate<String> p2, String data) {
		System.out.println(p1.and(p2).test(data));
	}

	private void predicateOr(Predicate<String> p1, Predicate<String> p2, String data) {
		System.out.println(p1.or(p2).test(data));
	}

	private void predicateNegate(Predicate<String> p, String data) {
		System.out.println(p.negate().test(data));
	}
}
