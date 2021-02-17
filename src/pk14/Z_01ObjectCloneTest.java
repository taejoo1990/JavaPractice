package pk14;

public class Z_01ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		//x=10 y=20 radius=5
		Circle circle=new Circle(10, 20, 5);//Circle,Point ��ü �ʱ�ȭ
		
		Circle copyCircle=(Circle)circle.clone();
		//�������� �ֻ��� Ŭ�����̱⿡ (Circle)�ٿ�ĳ����
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		//HashCode �� ���(���� �ٸ� hip�޸𸮿� ����)
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		

	}

}
