package pk15;

public class A_02StringTest2 {

	public static void main(String[] args) {
		//hip�޸�
		String javastr=new String("java");
		String androidstr=new String("android");
		
		System.out.println(javastr);
		System.out.println("���ڿ��� ���� hashCode �� : "+System.identityHashCode(javastr));
		System.out.println(androidstr);
		System.out.println("���ڿ��� ���� hashCode �� : "+System.identityHashCode(androidstr));
		
		javastr=javastr.concat(androidstr);//java+android
		//�ΰ��� ��ĥ��� ������ ���������� �ű�⿡ �ּҰ� �ٸ���
		System.out.println();
		System.out.println(javastr);
		System.out.println("����� ���ڿ��� ���� hashCode �� : "+System.identityHashCode(javastr));

	}

}
