package package16;

public class OuterOfStatic {
	
	public int a = 0;
	private String str = "Nested";
	
	
//	public void printNestedValue() {
//		System.out.println(value);
//	}
	
	static class StaticNested {
		private int value = 0;
		OuterOfStatic out = new OuterOfStatic();
		/*static nested 클래스에서 감싸고있는 외부 클래스의 변수에 접근하고 싶다면 
		 객체를 생성하여 접근하던가, static 변수로 선언해야한다.*/
		
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value=value;
		}
		public void printValue() {
			System.out.println(out.str);
		}
	}
}
