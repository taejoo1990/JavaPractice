package pk17.ArrayList;

import pk17.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList ma=new MemberArrayList();
		
		//Member 객체만들기
		Member memberLee=new Member(1001, "이지원");//Member
		Member memberSon=new Member(1002, "손민국");//Member
		Member memberPark=new Member(1003, "박서월");//Member
		Member memberHong=new Member(1004, "홍만세");//Member
		Member memberKim=new Member(1004, "김천사");//Member
		//hash set을 사용안하고 어레이리스트를 사용했기에 중복이 허용된다.
		//MemberArrayList에 저장
		ma.addMember(memberLee);
		ma.addMember(memberSon);
		ma.addMember(memberPark);
		ma.addMember(memberHong);
		ma.addMember(memberKim);
		
		//불러오기
		ma.showAllMember();
		//지우기
		ma.removeMember(memberHong.getMemberId());
		//확인
		ma.showAllMember();
	}

}
