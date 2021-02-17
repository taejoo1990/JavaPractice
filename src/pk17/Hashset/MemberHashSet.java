package pk17.Hashset;

import java.util.HashSet;
import java.util.Iterator;

import pk17.Member;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;

	public MemberHashSet() {
		//equals와 hashcode가 Overrider가 되어있지 않음
		hashSet= new HashSet<Member>();
		
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> it=hashSet.iterator();
		
		while(it.hasNext()) {
			Member member=it.next();
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				hashSet.remove(member);
				return true;
				
			}
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
		
	}
	public void showAllMember() {
		for(Member member:hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}

}
