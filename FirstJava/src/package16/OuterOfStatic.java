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
		/*static nested Ŭ�������� ���ΰ��ִ� �ܺ� Ŭ������ ������ �����ϰ� �ʹٸ� 
		 ��ü�� �����Ͽ� �����ϴ���, static ������ �����ؾ��Ѵ�.*/
		
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
