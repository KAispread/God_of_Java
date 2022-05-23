package package12;
import  package08.MemberDTO;

public class ToString {

	public static void main(String[] args) {
		ToString thisObject = new ToString();
		thisObject.toStringMethod2();
		MemberDTO dto = new MemberDTO("kai", "010931415125");
		System.out.println(dto);
	}
	
	public void toStringMethod(Object obj) {
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println("plus "+ obj);
	}
	
	public void toStringMethod2() {
		System.out.println(this);
		System.out.println(toString());
		System.out.println(this.getClass().getName() + '@' + Integer.toHexString(this.hashCode()));
	}

}
