package package08;

public class CreateMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateMember ctmem = new CreateMember();
		MemberDTO member = ctmem.createMB();
		
		System.out.println(member.age);
	}
	
	public MemberDTO createMB() {
		MemberDTO member = new MemberDTO();
		member.age = 10;
		member.name = "kiwoo";
		return member;
	}
}
