package pk04;

public class ArrayCopy04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("�¹���","������");
		bookArray1[1]=new Book("���̾�","�츣�� �켼");
		bookArray1[2]=new Book("��� �� ���ΰ�","���ù�");

		
		bookArray2[0]=new Book();//��ü�� ���� ����(������ setting�� ����=>�޸� �ּ� Ȯ��
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		//���� ����
		for(int i=0;i<bookArray1.length;i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		System.out.println("====bookArray2(��ü copy��)====");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		bookArray1[0].setBookname("����");//����
		bookArray1[0].setAuthor("�ڿϼ�");
		
		System.out.println("==bookArray(������)==");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
		}
		
		
		
	}

}
