package package12;
import  package08.MemberDTO;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals thisObject = new Equals();
		thisObject.equalMethod();
	}
	
	public void equalMethod() {
		MemberDTO obj1 = new MemberDTO("sangmin");
		MemberDTO obj2 = new MemberDTO("sangmin");
		if(obj1.equals(obj2)) {
			System.out.println("obj1 and obj2 is same");
			System.out.println(obj1.hashCode());
			System.out.println(obj2.hashCode());
		} else {
			System.out.println("obj1 and obj2 is not same");
			System.out.println(obj1.hashCode());
			System.out.println(obj2.hashCode());
		}
	}

}
