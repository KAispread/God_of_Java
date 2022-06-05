package package25.methods;

public class RunSupportThread {

	public static void main(String[] args) {
		RunSupportThread sample = new RunSupportThread();
		sample.checkThreadState3();
	}

	public void checkThreadState1() {
		SleepThread thread = new SleepThread(2000);
		try {
			System.out.println("thread state=" + thread.getState());
			thread.start();
			System.out.println("thread state(after start)=" + thread.getState());

			Thread.sleep(1000);
			System.out.println("thread state(after 1 sec)=" + thread.getState());

			thread.join();
			thread.interrupt();
			System.out.println("thread state(after join)=" + thread.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void checkThreadState2() {
		Object monitor = new Object();
		StateThread thread = new StateThread(monitor);
		try {
			System.out.println("Thread State="+thread.getState());
			thread.start();
			System.out.println("Thread State(after start)="+thread.getState());
			
			Thread.sleep(100);
			System.out.println("Thread State(after 0.1 sec)="+thread.getState());
			
			synchronized (monitor) {
				monitor.notify();
			}
			Thread.sleep(100);
			System.out.println("Thread State(after notify)="+thread.getState());
			
			thread.join();
			System.out.println("Thread State(after join)="+thread.getState());
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void checkThreadState3() {
		Object monitor = new Object();
		StateThread thread = new StateThread(monitor);
		StateThread thread2 = new StateThread(monitor);
		
		try {
			System.out.println("Thread State="+thread.getState());
			thread.start();
			thread2.start();
			System.out.println("Thread State(after start)="+thread.getState());
			
			Thread.sleep(100);
			System.out.println("Thread State(after 0.1 sec)="+thread.getState());
			
			synchronized (monitor) {
				monitor.notifyAll();
			}
			Thread.sleep(100);
			System.out.println("Thread State(after notify)="+thread.getState());
			
			thread.join();
			System.out.println("Thread State(after join)="+thread.getState());
			thread2.join();
			System.out.println("Thread2 State(after join)="+thread2.getState());
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void checkJoin() {
		SleepThread thread = new SleepThread(2000);
		try {
			thread.start();
			thread.join(500);
			thread.interrupt();
			System.out.println("thread state(after join)=" + thread.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
