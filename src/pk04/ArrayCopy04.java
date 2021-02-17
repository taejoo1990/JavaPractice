package pk04;

public class ArrayCopy04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("태백산맥","조정례");
		bookArray1[1]=new Book("데미안","헤르만 헤세");
		bookArray1[2]=new Book("어떻게 살 것인가","유시민");

		
		bookArray2[0]=new Book();//객체를 직접 생성(데이터 setting이 없음=>메모리 주소 확보
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		//깊은 복사
		for(int i=0;i<bookArray1.length;i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		System.out.println("====bookArray2(전체 copy후)====");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		bookArray1[0].setBookname("나목");//수정
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("==bookArray(수정후)==");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
		}
		
		
		
	}

}
