package pk17.ArrayList;

import pk17.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList ma=new MemberArrayList();
		
		//Member ��ü�����
		Member memberLee=new Member(1001, "������");//Member
		Member memberSon=new Member(1002, "�չα�");//Member
		Member memberPark=new Member(1003, "�ڼ���");//Member
		Member memberHong=new Member(1004, "ȫ����");//Member
		Member memberKim=new Member(1004, "��õ��");//Member
		//hash set�� �����ϰ� ��̸���Ʈ�� ����߱⿡ �ߺ��� ���ȴ�.
		//MemberArrayList�� ����
		ma.addMember(memberLee);
		ma.addMember(memberSon);
		ma.addMember(memberPark);
		ma.addMember(memberHong);
		ma.addMember(memberKim);
		
		//�ҷ�����
		ma.showAllMember();
		//�����
		ma.removeMember(memberHong.getMemberId());
		//Ȯ��
		ma.showAllMember();
	}

}
