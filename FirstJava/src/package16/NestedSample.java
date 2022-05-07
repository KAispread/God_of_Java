package package16;

public class NestedSample {

	public static void main(String[] args) {
		NestedSample sample = new NestedSample();
		sample.makeStaticNestedObject();
	}
	
	public void makeStaticNestedObject() {
		OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
		//Static Nested 클래스 객체를 생성하는방법.
		
		staticNested.setValue(3);
		System.out.println(staticNested.getValue());
		
		staticNested.printValue();
	}

}
