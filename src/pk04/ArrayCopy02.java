package pk04;

public class ArrayCopy02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book[] bookArray1=new Book[3];
		Book[] bookArray2=new Book[3];
		
		bookArray1[0]=new Book("�¹���","������");
		bookArray1[1]=new Book("���̾�","�츣�� �켼");
		bookArray1[2]=new Book("��� �� ���ΰ�","���ù�");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
                          //�迭1  0�������� �迭2   1��°����4������
		for(int i=0;i<bookArray2.length;i++) {
			bookArray2[i].showBookinfo();
		}

	}

}
