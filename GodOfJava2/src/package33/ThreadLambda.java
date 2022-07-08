package package33;


public class ThreadLambda {

	public static void main(String[] args) {
		ThreadLambda sample= new ThreadLambda();
		sample.runCommonThread();
		sample.runThread();
		sample.runThreadSimple();
	}
	
	private void runCommonThread() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		
		new Thread(runnable).start();
	}
	
	private void runThread() {
		new Thread(() -> {
			System.out.println(Thread.currentThread().getName());
		}).start();
	}
	
	private void runThreadSimple() {
		new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
	}
}
