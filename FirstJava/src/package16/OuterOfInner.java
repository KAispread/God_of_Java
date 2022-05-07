package package16;

public class OuterOfInner {
	public int a = 0;
	private String str = "Nested";
	
	class Inner {
		private int value = 0;
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		
		//static이 아닌 내부 클래스의 경우, 외부 클래스의 변수를 사용할 수 있다.
		public void printValue() {
			System.out.println(str);
		}
	}
}
