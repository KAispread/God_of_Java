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
		
		//static�� �ƴ� ���� Ŭ������ ���, �ܺ� Ŭ������ ������ ����� �� �ִ�.
		public void printValue() {
			System.out.println(str);
		}
	}
}
