package pk04;

public class ArrayCopy03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("�¹���","������");
		bookArray1[1]=new Book("���̾�","�츣�� �켼");
		bookArray1[2]=new Book("��� �� ���ΰ�","���ù�");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}
		
		bookArray1[0].setBookname("����");
		bookArray1[0].setAuthor("�ڿϼ�");
		
		System.out.println("====bookArray1====");
		for(int i=0;i<bookArray1.length;i++) {
			bookArray1[i].showBookinfo();
			
		}
		//������ �����Ͽ���, ���� ���ī�Ǹ޼��忡�� �纻�� ������ ���簪���� �Ǿ�����.
		System.out.println("====bookArray2(���� ������)====");
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
			//���� ������ ������ �����Ϥ��� �纻�� �������� �ʾ����� ������ ������ ������
		}
		

	}

}
