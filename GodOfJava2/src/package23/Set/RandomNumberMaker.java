package package23.Set;

import java.util.HashSet;
import java.util.Random;

public class RandomNumberMaker {
	
	public static void main(String[] args) {
		RandomNumberMaker sample = new RandomNumberMaker();
		sample.printSixNumber(10);
	}
	
	public void printSixNumber(int number) {
		for(int loop = 0; loop < number; loop++) {
			HashSet<Integer> SixNumber = getSixNumber();
			System.out.println(SixNumber);
			System.out.println();
		}
	}
	
	public HashSet<Integer> getSixNumber(){
		Random rand = new Random();
		HashSet<Integer> randomSixNumber = new HashSet<>();
		int count = 0;
		while(randomSixNumber.size() < 6) {
			int tempnumber = rand.nextInt(50);
			randomSixNumber.add(tempnumber);
			count++;
		}
		System.out.println("while loop ran ["+count+"] times");
		return randomSixNumber;
	}
}
