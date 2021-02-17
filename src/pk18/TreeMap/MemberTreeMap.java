package pk18.TreeMap;

import java.util.Iterator;
import java.util.TreeMap;

import pk17.Member;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	//construt
	public MemberTreeMap() {
		treeMap=new TreeMap<Integer,Member>();
	}
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(),member);
	}

	
	public boolean removeMember(int memberId) {
		
		if(treeMap.containsKey(memberId)) {//멤버 안에 컨텐츠키가 있는지 확인
			treeMap.remove(memberId);//있다면 지우기
			return true;
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}
	
	
	public void showAllMember() {
		Iterator<Integer> it=treeMap.keySet().iterator();
		//컬렉션안에서 순환
		//keySet() : 핵심키만 땔수있다
		while(it.hasNext()) {
			int key=it.next();//키만 저장
			Member member=treeMap.get(key);//멤버에서 키를 트리맵으로 가져오기
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
