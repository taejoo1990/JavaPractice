package pk18.TreeMap;

import pk17.Member;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		//Member class has-a(��� ��ü����)
		Member memberLee=new Member(1001, "������");
		Member memberSon=new Member(1002, "�չα�");
		Member memberPark=new Member(1003, "�ڼ���");
		Member memberP=new Member(1003, "�ڼ���");
		
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
	}//Integer �ȿ� Comparable�� Comparator�� ���Ե��ִ�

}
