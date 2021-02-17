package pk16;

class MyArray{
	private Object[] array=new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
	}
	
	public Object get(int index) {
		return array[index];
	}
}

public class A_01MyArrayTest {

	public static void main(String[] args) {
		
		MyArray ma1=new MyArray();
		ma1.add(new String("test"));
		String str=(String)ma1.get(0); //강제 형변환 (다운캐스팅)
		System.out.println(str);

		System.out.println();
		
		MyArray ma2=new MyArray();
		ma2.add(new Integer(100));
		Integer num=(Integer)ma2.get(0); //강제 형변환 (다운캐스팅)
		System.out.println(num);
	}

}
