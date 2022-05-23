package package13;

import package08.MemberDTO;

public interface MemberManager {
	public boolean addMember(MemberDTO member) ;
	public boolean removeMember(String name, String phone);
	public boolean updateMember(MemberDTO member);
}
