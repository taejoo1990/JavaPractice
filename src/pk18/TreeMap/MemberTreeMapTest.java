package pk18.TreeMap;

import pk17.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		//Member class has-a(멤버 객체생성)
		Member memberLee=new Member(1001, "이지원");
		Member memberSon=new Member(1002, "손민국");
		Member memberPark=new Member(1003, "박서연");
		Member memberP=new Member(1003, "박서연");
		
		//MemberTreeMap class
		MemberTreeMap mt=new MemberTreeMap();
		
		//Member -> MemberTreeMap
		mt.addMember(memberLee);
		mt.addMember(memberSon);
		mt.addMember(memberPark);
		mt.addMember(memberP);

		mt.showAllMember();
		
		mt.removeMember(1003);
		mt.showAllMember();
	}//Integer 안에 Comparable과 Comparator가 포함되있다

}
