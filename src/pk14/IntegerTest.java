package pk14;

public class IntegerTest {

	public static void main(String[] args) {
		//Integer i=new Integer(100);//deprecated : ����� �������� ����
		
		Integer num=100;
		int iNum=num.intValue(); //Integer���� �������� ������(Unboxing)
		int jNum=200;
		
		int sum=iNum+jNum;
		System.out.println(sum);
		
		//��ڽ�
		int total=num+jNum;//num.inValue()+jNum
		System.out.println(total);
		
		//����ڽ�
		Integer i=jNum;
		System.out.println(i);//Integer.valueOf(jNum)

	}

}
