package pk17.TreeSet;

import pk17.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		//has - A
		MemberTreeSet mts=new MemberTreeSet();
		
		Member memberLee=new Member(1001, "������");
		Member memberSon=new Member(1002, "�չα�");
		Member memberPark=new Member(1003, "�ڼ���");
		
		mts.addMember(memberLee);
		mts.addMember(memberSon);
		mts.addMember(memberPark);
		mts.showAllMember();
		

	}

}
