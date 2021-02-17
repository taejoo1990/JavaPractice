package pk17.LinkedList;

import java.util.LinkedList;

import pk17.Member;

public class MemberLinkedList {

	private LinkedList<Member> ll;//선언
	
	public MemberLinkedList() {//생성자 링크드리스트의 장점도 가지고 오면서 다른 장점을 가져오기 위해
		ll =new LinkedList<>();//우회해서 생성
		
	}
	public void addMember(Member member) {
		ll.add(member);
	}
	public boolean removeMember(int memberId) {
		for (int i = 0; i < ll.size(); i++) {
			Member member=ll.get(i);//각각의 인덱스 번호에 있는 데이터 가져오기
			int tempId=member.getMemberId();//가져온 데이터 중에서 id만 저장
			if(tempId==memberId) {
				ll.remove(i);
				return true;
			}
		}
		System.out.println(memberId+"은(는) 존재하는 아이디가 아닙니다.");
		return false;
	}
	public void showAllMember() {
		for(Member member:ll) {
			System.out.println(member);
		}
		System.out.println();
	}
	
}
