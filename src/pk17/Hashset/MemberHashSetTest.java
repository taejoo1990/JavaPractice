package pk17.Hashset;

import pk17.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet mhs=new MemberHashSet();

		Member memberLee=new Member(1001, "이지원");
		Member memberSon=new Member(1002, "손민국");
		Member memberPark=new Member(1003, "박서연");
		
		mhs.addMember(memberLee);
		mhs.addMember(memberSon);
		mhs.addMember(memberPark);
		mhs.showAllMember();

		Member memberP=new Member(1003, "박서연");
		mhs.addMember(memberP);
		mhs.showAllMember();
	}

}
