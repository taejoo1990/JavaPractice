package pk16;

class MyArrayG<E>{
	private Object[] array=new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
	}
	
	public E get(int index) {
		return (E)array[index];//���׸� �迭ȭ ��Ű�� �ʱ�ȭ �Ҷ� ����
	}
}

public class A_02MyArrayTest2 {

	public static void main(String[] args) {

		MyArrayG<String> ma1=new MyArrayG<String>();
		ma1.add(new String("test"));
		String str=ma1.get(0); //����ȯ ����
		System.out.println(str);

		System.out.println();
		
		MyArrayG<Integer> ma2=new MyArrayG<Integer>();
		ma2.add(new Integer(100));
		Integer num=ma2.get(0); //����ȯ ����
		System.out.println(num);
	}

}
/*���׸� Ŭ������
 * ���׸� ���α׷����̶� �Ϲ����� �ڵ带 �ۼ��ϰ� �� �ڵ带 �پ��� Ÿ���� ��ü�� ���Ͽ� ����
 * �ϴ� ��ü���� ����̴�.
 * ���ϴ� Ÿ���� ��ü�� �޾Ƶ��̱� ���� ����̴�.
 * �ݱ� �ϳ��� Ŭ�������� �������� Ÿ���� �ѹ��� �� �����ϴ� Ŭ������ ���׸�Ŭ�����̴�.
*/




