package pk18.HashMap;

import pk17.Member;
import pk17.Hashset.MemberHashSet;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashSet mhs=new MemberHashSet();

		Member memberLee=new Member(1001, "이지원");
		Member memberSon=new Member(1002, "손민국");
		Member memberPark=new Member(1003, "박서연");
		Member memberP=new Member(1003, "박서연");
		
		mhs.addMember(memberLee);
		mhs.addMember(memberSon);
		mhs.addMember(memberPark);
		mhs.addMember(memberP);
		mhs.showAllMember();
		
		mhs.removeMember(1003);
		mhs.showAllMember();

	}

}
