package pk19;

public class TestStringConcat {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="World";
		
		//has a
		StringConcatImp1 con=new StringConcatImp1();
		con.maksString(s1, s2);
		
		//lambda//ȭ��ǥ�� �� ���������Ѵ�
		StringConcat con2=(s,v)->System.out.println(s+", "+v);
		con.maksString("�𸣰ڴ�", "���ٽ�");
		
		//�͸��� Ŭ����
		StringConcat con3=new StringConcat() {
			
			@Override
			public void maksString(String s1, String s2) {
				System.out.println(s1+", "+s2);
				
			}
		};
		con3.maksString("�͸���Ŭ����", "������");
	}
}
