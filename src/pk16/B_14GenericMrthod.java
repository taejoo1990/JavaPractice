package pk16;

public class B_14GenericMrthod {
	//p1 : ����(����)-left ����(�Ҽ���) -top
	//p2 : ����(����)-right ����(�Ҽ���)-bottom
	public static <T,V> double makeRectanglr(B_13Point<T,V> p1,B_13Point<T,V> p2) {
		//Number : ������ �Ǽ� Ÿ�� ����
		double left=((Number)p1.getX()).doubleValue();
		double top=((Number)p1.getY()).doubleValue();
		
		double right=((Number)p2.getY()).doubleValue();
		double bottom=((Number)p2.getY()).doubleValue();
		//����� �ٿ�ĳ���� �ص� ������ �������� �ҷ����� ���ؼ� Number�� �ٿ�ĳ����
		//���⼭ �ѹ��� ����(int)�� �Ҽ�(double)�� �����ִ�
		double width=right-left;
		double height=bottom-top;
		
		return width*height;
	}
	
	public static void main(String[] args) {
		
		B_13Point<Integer,Double> p1=new B_13Point<Integer,Double>(0,0.0);
		B_13Point<Integer,Double> p2=new B_13Point<Integer,Double>(10,10.0);

		double rect=B_14GenericMrthod.<Integer,Double>makeRectanglr(p1, p2);
		System.out.println("�� ������ ������� �簢���� ���̴� : "+rect+"�Դϴ�.");
		
	}

}
