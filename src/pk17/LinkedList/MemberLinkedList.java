package pk17.LinkedList;

import java.util.LinkedList;

import pk17.Member;

public class MemberLinkedList {

	private LinkedList<Member> ll;//����
	
	public MemberLinkedList() {//������ ��ũ�帮��Ʈ�� ������ ������ ���鼭 �ٸ� ������ �������� ����
		ll =new LinkedList<>();//��ȸ�ؼ� ����
		
	}
	public void addMember(Member member) {
		ll.add(member);
	}
	public boolean removeMember(int memberId) {
		for (int i = 0; i < ll.size(); i++) {
			Member member=ll.get(i);//������ �ε��� ��ȣ�� �ִ� ������ ��������
			int tempId=member.getMemberId();//������ ������ �߿��� id�� ����
			if(tempId==memberId) {
				ll.remove(i);
				return true;
			}
		}
		System.out.println(memberId+"��(��) �����ϴ� ���̵� �ƴմϴ�.");
		return false;
	}
	public void showAllMember() {
		for(Member member:ll) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
