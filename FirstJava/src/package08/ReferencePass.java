package package08;

public class ReferencePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferencePass reference = new ReferencePass();
		
		reference.CallPassByValue();
		System.out.println();
		reference.CallPassByReference();
	}
	
	public void CallPassByValue() {
		int value1 = 4;
		char value2 = 'a';
		System.out.print("Before Pass by value --");
		System.out.println("value1 : "+value1+" / value2 : "+value2+"");
		PassByValue(value1, value2);
		System.out.print("After Pass by value --");
		System.out.println("value1 : "+value1+" / value2 : "+value2+"");
	}
	
	public void PassByValue(int val1, char val2) {
		val1 = 10;
		val2 = 'b';
		System.out.print("In Pass by value --");
		System.out.println("value1 : "+val1+" / value2 : "+val2+"");
	}

	public void CallPassByReference() {
		MemberDTO member = new MemberDTO("Kiwoo");
		System.out.print("Before Pass by reference --");
		System.out.println(member.name);
		PassByReference(member);
		System.out.print("After Pass by reference --");
		System.out.println(member.name);
	}
	
	public void PassByReference(MemberDTO member) {
		member.name = "Rachel";
		System.out.print("In Pass by reference --");
		System.out.println("member.name : "+member.name+"");
	}
}
