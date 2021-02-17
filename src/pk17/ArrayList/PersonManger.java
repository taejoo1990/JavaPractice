package pk17.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class PersonManger {
	
	public void personMgr() {
		int select;
		Person p; //p=new Person();
		
		
		//Person의 객체만 저장할 수 있는 ArrayList 객체생성(persinArr)
		ArrayList<Person> persinArr=new ArrayList<>();
		
		//1. 정보추가(set,get)
		//2. 정보삭제
		//3. 전체정보검색
		//4. 종료
		
		while(true	) {
			System.out.println("1. 정보추가");
			System.out.println("2. 정보삭제");
			System.out.println("3. 전체정보검색");
			System.out.println("4. 종료");
			System.out.print("항목을 선택하세요 : ");
			
			Scanner sc=new Scanner(System.in);
			select=sc.nextInt();
			
			
			switch(select) {
			
			case 1://정보추가
				//정보를 추가할때마다 Person객체를 생성
				p=new Person();
				System.out.println("------정보추가------");
				System.out.print("이름 : ");
				p.setName(sc.next());
				
				System.out.print("나이 : ");
				p.setAge(sc.nextInt());
				
				System.out.print("전화번호 : ");
				p.setTal(sc.next());
			
				persinArr.add(p);
				System.out.print("회원가입이  완료되었습니다.");
				break;
				
			case 2:	//정보 삭제
				System.out.println("------정보삭제------");
				System.out.print("삭제할 이름 : ");
				String name=sc.next();
				for (int i = 0; i < persinArr.size(); i++) {
					
					if((persinArr.get(i).getName()).equals(name)){
						System.out.println(name+"의 정보를 삭제하였습니다.");
						break;
					}else {
						if(i+1==persinArr.size())
							System.out.println(name+"이 존재하지 않습니다.");
					}
						
				}
				break;
				
			case 3://전체정보검색
				System.out.println("-----전체 정보-----");
				System.out.println("등록인원"+persinArr.size()+"명");
				for (int i = 0; i <persinArr.size(); i++) {
					System.out.println("이름 : "+persinArr.get(i).getName());
					System.out.println("나이 : "+persinArr.get(i).getAge());
					System.out.println("전화번호 : "+persinArr.get(i).getTal());
					System.out.println("--------------------------------------");
					//for문 대신 검색속도를 향상하기 위하여 반복순환이 가능한 엘리먼트로
					//전환하여 Iterator 사용 
					/*
					Iterator<Person> it=persinArr.iterator();
					
					while(it.hasNext()) {
						p=it.next();
						System.out.println("이름 : "+p.getName());
						System.out.println("나이 : "+p.getAge());
						System.out.println("전화번호 : "+p.getTal());
					}*/
				}break;
				
				default:
					System.out.println("프로그램 종료");
					return;
			}//switch	
		}//while
	}//method
}//class
