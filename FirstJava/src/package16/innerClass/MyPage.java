package package16.innerClass;

public class MyPage {
	InputBox input;
	
	public static void main(String[] args) {
		MyPage sample = new MyPage();
		sample.setUI();
		sample.pressKey();
	}
	
	public void setUI() {
		input = new InputBox();
		KeyEventListener key = new KeyEventListener() {
			public void onKeyDown() {
				System.out.println("Key Down!!");
			}
			public void onKeyUp() {
				System.out.println("Key Up!!");
			}
		};
		
		input.setKeyListener(key);
	}
	
	public void pressKey() {
		input.listenerCalled(InputBox.KEY_DOWN);
		input.listenerCalled(InputBox.KEY_UP);
	}
}
