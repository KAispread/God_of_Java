package package25.Thread;
import java.util.Date;
public class TimerThread extends Thread{
	public void run() {
		printCurrentTime(10);
	}
	
	public void printCurrentTime(int count) {
		long currentTime = 0;
		for(int i =0; i < 10; i++) {
			Date date = new Date();
			currentTime = System.currentTimeMillis();
			currentTime -= (currentTime % 1000);
			System.out.println(date.toString() + currentTime);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
