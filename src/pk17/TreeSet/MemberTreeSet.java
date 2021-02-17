package pk17.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

import pk17.Member;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;

	public MemberTreeSet() {
		//equals�� hashcode�� Overrider�� �Ǿ����� ����
		treeSet= new TreeSet<Member>(new Member());
		
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> it=treeSet.iterator();
		
		while(it.hasNext()) {
			Member member=it.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				treeSet.remove(member);
				return true;
				
			}
		}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
		
	}
	public void showAllMember() {
		for(Member member:treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}

