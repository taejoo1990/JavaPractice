package pk17.TreeSet;

import pk17.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		//has - A
		MemberTreeSet mts=new MemberTreeSet();
		
		Member memberLee=new Member(1001, "이지원");
		Member memberSon=new Member(1002, "손민국");
		Member memberPark=new Member(1003, "박서연");
		
		mts.addMember(memberLee);
		mts.addMember(memberSon);
		mts.addMember(memberPark);
		mts.showAllMember();
		

	}

}
