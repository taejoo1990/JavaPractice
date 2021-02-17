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
		
		if(treeMap.containsKey(memberId)) {//��� �ȿ� ������Ű�� �ִ��� Ȯ��
			treeMap.remove(memberId);//�ִٸ� �����
			return true;
		}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	
	public void showAllMember() {
		Iterator<Integer> it=treeMap.keySet().iterator();
		//�÷��Ǿȿ��� ��ȯ
		//keySet() : �ٽ�Ű�� �����ִ�
		while(it.hasNext()) {
			int key=it.next();//Ű�� ����
			Member member=treeMap.get(key);//������� Ű�� Ʈ�������� ��������
			System.out.println(member);
		}
		System.out.println();
	}
	
	
}
