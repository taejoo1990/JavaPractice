package pk18.HashMap;

import pk17.Member;
import pk17.Hashset.MemberHashSet;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashSet mhs=new MemberHashSet();

		Member memberLee=new Member(1001, "������");
		Member memberSon=new Member(1002, "�չα�");
		Member memberPark=new Member(1003, "�ڼ���");
		Member memberP=new Member(1003, "�ڼ���");
		
		mhs.addMember(memberLee);
		mhs.addMember(memberSon);
		mhs.addMember(memberPark);
		mhs.addMember(memberP);
		mhs.showAllMember();
		
		mhs.removeMember(1003);
		mhs.showAllMember();

	}

}
