package package23;

import java.util.HashSet;
import java.util.Iterator;

public class SetSample {

	public static void main(String[] args) {
		SetSample sample = new SetSample();
		String [] cars = new String[] {
				"Tico", "Santona", "BMW", "Benz",
				"Lexus", "Mustang", "Grandeure",
				"The Beetle", "Mini Cooper", "i30",
				"BMW", "Lexus", "Carnibal", "SM5",
				"SM7", "SM3", "Tico"
		};
		System.out.println(sample.getCarKinds(cars));
	}
	public int getCarKinds(String [] car) {
		if (car == null) return 0;
		if (car.length == 1) return 1;
		HashSet<String> kindOfCar = new HashSet<>();
		for(String addCar : car) {
			kindOfCar.add(addCar);
		}
		printCarSet2(kindOfCar);
		return kindOfCar.size();
	}
	
	public void printCarSet(HashSet<String> car) {
		for(String kindOfCar: car) {
			System.out.println(kindOfCar+"");
		}
	}
	public void printCarSet2(HashSet<String> car) {
		Iterator<String> cars = car.iterator();
		while(cars.hasNext()) {
			System.out.println(cars.next());
		}
	}
	
}
