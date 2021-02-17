package pk21;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		
		//���� �߻�
		/*for(int i=0;i<=5;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("�����߻�");*/
		try {
			for(int i=0;i<=5;i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("����ó���κ�");
			
		}finally {//������ ���� �ȳ��� ������ �����
			System.out.println("Finally");
		}
		System.out.println("���α׷� ����");
	}

}
