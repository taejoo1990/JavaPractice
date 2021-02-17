package pk17.LinkedList;

import pk17.Member;

public class MemberLikedListTest {

	public static void main(String[] args) {
		
		MemberLinkedList ml=new MemberLinkedList();
		
		Member ml1=new Member(1001, "Â¥Àå");
		Member ml2=new Member(1002, "Â«»Í");
		Member ml3=new Member(1003, "¶ó¸é");
		
		ml.addMember(ml1);
		ml.addMember(ml2);
		ml.addMember(ml3);
		ml.showAllMember();
		
		Member ml4=new Member(1003, "¶ó¸é");
		ml.addMember(ml4);
		
		ml.showAllMember();
	}

}
