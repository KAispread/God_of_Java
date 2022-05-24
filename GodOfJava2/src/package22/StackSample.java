package package22;

import java.util.Stack;

public class StackSample {

	public static void main(String[] args) {
		StackSample sample = new StackSample();
		sample.checkPeek();
	}
	public void checkPeek() {
		Stack<Integer> intStack = new Stack<Integer>();
		for(int loop=0;loop<5;loop++) {
			intStack.push(loop);
			System.out.println(intStack.peek());
		}
	}
	public void checkPop() {
		Stack<Integer> intStack = new Stack<Integer>();
		for(int loop=0;loop<5;loop++) {
			intStack.push(loop);
			System.out.println(intStack.pop());
		}
		System.out.println("size="+intStack.size());
	}
}
