package pk05;

public class TryCatchThrows {

	public static void fun() throws Exception{
		//����ÿ��� throws�� �޸� �Ҵ�ÿ��� throw�� ���´�
		//throws ������ �ڵ��� ����ó�� �κ����� �����ٶ�� ���� ������ �ִ�
		try {
			System.out.println("fun()�޼ҵ�");
			throw new Exception();//Ű���� new�� ����㿩 ���� �߻�
			//RuntimeException : �����߿� �߻��Ǵ� ������ Exceptionó����
		} catch (RuntimeException e) { //���ϹǷ� �ݵ�� finally�� �Ѱ� �����
			System.out.println("���ܹ߻�");
		}finally {
			System.out.println("finally ������");
		}//finally�� ����� ������ �����ؾ��Ѵ�		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//fun();
		
		try {
			fun();
		} catch (Exception e) {
			System.out.println("main()dml catch�� ����");
		}
		
		
		
	}//main close
}//class close
