package pk15;

public class A_07NewInstancerTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		A_05Person pe1=new A_05Person();
		System.out.println(pe1);
		
		Class pc=Class.forName("pk15.A_05Person");
		System.out.println(pc);
		//���ܹ߻� �ɼ� ����
		A_05Person pe2=(A_05Person)pc.newInstance();//Object���� �������ִ� ��ü
		System.out.println(pe2);

	}

}
