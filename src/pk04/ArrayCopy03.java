package pk04;

public class ArrayCopy03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("태백산맥","조정례");
		bookArray1[1]=new Book("데미안","헤르만 헤세");
		bookArray1[2]=new Book("어떻게 살 것인가","유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		
		bookArray1[0].setBookname("나목");
		bookArray1[0].setAuthor("박완서");
		
		System.out.println("====bookArray1====");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
			
		}
		//원본을 수정하였고, 위에 어레이카피메서드에서 사본은 원본의 복사값으로 되어있음.
		System.out.println("====bookArray2(원본 수정후)====");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
			//따라서 수정된 원본을 복사하ㅏ여 사본을 수정하지 않았지만 수정된 정보가 끌려옴
		}
		

	}

}
