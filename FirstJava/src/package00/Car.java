package package00;

public class Car {
	int speed;
	int distance;
	String color;
	
	public Car() {
		
	}
	public void SpeedUp() {
		speed += 5;
	}
	public void BreakDown() {
		speed -= 10;
	}
	public int getCurrentSpeed() {
		
		return speed;
	}
}
