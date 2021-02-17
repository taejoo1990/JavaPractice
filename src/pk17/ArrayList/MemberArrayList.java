package pk17.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import pk17.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;//ArrayList 선언

	public MemberArrayList() {
		arrayList=new ArrayList<Member>();//ArrayList가 생성
		}
	
	public void addMember(Member member) {//정보입력
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) {
			
		for (int i = 0; i < arrayList.size(); i++) {
			Member member=arrayList.get(i);
			int tempId=member.getMemberId();
			if(tempId==memberId) {
				arrayList.remove(i);
				return true;
		//for문 대신 Iterator로 사용할 경우
		/*Iterator<Member> it=arrayList.iterator();
		while (it.hasNext()) {//hasNext() 값이 있는지 확인하는거
			Member member=it.next();//id,name값을 가져오는거
			int tempId=member.getMemberId();
			if(tempId==member) {
				arrayList.remove(i);//값을 삭제
			
		}*/
		
			}
		}
			System.out.println(memberId+"(은)는 존재하지 않는 아이디입니다.");
			return false;
	}
	
	public void showAllMember() {
		for(Member member:arrayList) {
			System.out.println(member);
			
		}
		System.out.println();
	}
	
}
