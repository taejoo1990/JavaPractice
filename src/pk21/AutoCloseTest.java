package pk21;

public class AutoCloseTest {

	public static void main(String[] args) {
		
		
		try (AutoCloseObj obj=new AutoCloseObj()){
			throw new Exception();//���� �߻�
		} catch (Exception e) {
			System.out.println("���� �κ��Դϴ�.");
		}

		/*AutoCloseaObj obj1=new AutoCloseObj();
		
		try (obj1){
			throw new Exception();
		} catch (Exception e) {
			System.out.println("���� �κ��Դϴ�.");
		}*/
	}//�ڹ�9�������� ���� ����

}
