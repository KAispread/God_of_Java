package package08;

import java.util.Objects;

public class MemberDTO {
	String name;
	String phone;
	int age;
	
	public MemberDTO() {}
	public MemberDTO(String name) {
		this.name = name;
	}
	
	public MemberDTO(String name,String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	//Overriding
	public String toString() {
		return "Name="+name+" Phone="+phone+"";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, phone);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof MemberDTO)) {
			return false;
		}
		MemberDTO other = (MemberDTO) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
}
