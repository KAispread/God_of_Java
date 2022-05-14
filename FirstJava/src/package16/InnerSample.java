package package16;

public class InnerSample {

	public static void main(String[] args) {
		InnerSample sample = new InnerSample();
		sample.makeInnerObject();
	}
	public void makeInnerObject() {
		OuterOfInner outer = new OuterOfInner(); 
		OuterOfInner.Inner inner = outer.new Inner();
		/*Static이 아닌 내부 클래스 객체를 생성하기 위해선 외부 클래스 객체를 생성한 다음,
		 * 해당 객체에서 내부 클래스 생성자를 이용해 내부 클래스 객체를 생성해야 한다.*/
		
		inner.setValue(3);
		System.out.println(inner.getValue());
	}

}
