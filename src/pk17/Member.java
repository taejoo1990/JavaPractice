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
		return "���̵� "+memberId +"�� ȸ������ �̸��� : "+ memberName+"�Դϴ�.";
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return memberId;
	}



	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			//�Ű������� �Ѿ�� ��ü�� �ٿ�ĳ����
			Member member=(Member)obj;
			if(this.memberId==member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}


//Comparable�̶�� �������̽� Ŭ������  compareTo��� �߻�޼��� ����
	@Override
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		return (this.memberId-member.memberId);//��������
		//return (this.memberId-member.memberId)*-(1);//��������
		//5-3=2//����� ��������
		//3-5=-2//������ ��������
	}
	
	//Comparator ����
	@Override
	public int compare(Member member1, Member member2) {
		// TODO Auto-generated method stub
		return (member1.memberId-member2.memberId)*-(1);
	}

}
