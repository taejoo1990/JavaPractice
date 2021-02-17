package pk17;

import java.util.Comparator;

import pk17.Hashset.User;


public class Member implements Comparable<Member>,Comparator<Member>{

	private int memberId;
	private String memberName;
	
	public Member() {}
	
	public Member(int memberId, String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;
	}
	
	
	
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "아이디 "+memberId +"번 회원님의 이름은 : "+ memberName+"입니다.";
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			//매개변수로 넘어온 객체를 다운캐스팅
			Member member=(Member)obj;
			if(this.memberId==member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}


//Comparable이라는 인터페이스 클래스에  compareTo라는 추상메서드 구현
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		return (this.memberId-member.memberId);//오름차순
		//return (this.memberId-member.memberId)*-(1);//내림차순
		//5-3=2//양수는 오름차순
		//3-5=-2//음수는 내림차순
	}
	
	//Comparator 문법
	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return (member1.memberId-member2.memberId)*-(1);
	}

}
