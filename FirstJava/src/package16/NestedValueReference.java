package package16;

public class NestedValueReference {
	public int publicInt = 0;
	protected int protectedInt = 1;
	int justInt = 2;
	private int privateInt=3;
	static int staticInt = 4;
	
	static class StaticNested {
		public void setValue() {
			staticInt = 14;
			// static nested 클래스에서는 외부 클래스의 'static' 변수만 접근 가능.
			// 인스턴스 변수는 객체 생성 후 접근 가능.
		}
	}
	class Inner {
		public void setValue() {
			publicInt = 20;
			protectedInt = 21;
			justInt = 22;
			privateInt = 23;
			staticInt = 24;
			// static이 아닌 내부 클래스에서는 객체 생성 없이, 외부 클래스의 모든 변수에 접근 가능.
		}
	}
}
