package package33.stream;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);
	}
	
	public void multiflyThirds(List<Integer> list) {
		list.stream().map(num -> num * 3).forEach(System.out::println);
	}
}
