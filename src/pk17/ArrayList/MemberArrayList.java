package pk17.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import pk17.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;//ArrayList ����

	public MemberArrayList() {
		arrayList=new ArrayList<Member>();//ArrayList�� ����
		}
	
	public void addMember(Member member) {//�����Է�
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
			
		for (int i = 0; i < arrayList.size(); i++) {
			Member member=arrayList.get(i);
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				arrayList.remove(i);
				return true;
		//for�� ��� Iterator�� ����� ���
		/*Iterator<Member> it=arrayList.iterator();
		while (it.hasNext()) {//hasNext() ���� �ִ��� Ȯ���ϴ°�
			Member member=it.next();//id,name���� �������°�
			int tempId=member.getMemberId();
			if(tempId==member) {
				arrayList.remove(i);//���� ����
			
		}*/
		
			}
		}
			System.out.println(memberId+"(��)�� �������� �ʴ� ���̵��Դϴ�.");
			return false;
	}
	
	public void showAllMember() {
		for(Member member:arrayList) {
			System.out.println(member);
			
		}
		System.out.println();
	}
	
}
