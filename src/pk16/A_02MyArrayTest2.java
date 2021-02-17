package pk16;

class MyArrayG<E>{
	private Object[] array=new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=obj;
	}
	
	public E get(int index) {
		return (E)array[index];//제네릭 배열화 시키는 초기화 할때 문법
	}
}

public class A_02MyArrayTest2 {

	public static void main(String[] args) {

		MyArrayG<String> ma1=new MyArrayG<String>();
		ma1.add(new String("test"));
		String str=ma1.get(0); //형변환 없음
		System.out.println(str);

		System.out.println();
		
		MyArrayG<Integer> ma2=new MyArrayG<Integer>();
		ma2.add(new Integer(100));
		Integer num=ma2.get(0); //형변환 없음
		System.out.println(num);
	}

}
/*제네릭 클래스란
 * 제네릭 프로그래밍이란 일반적인 코드를 작성하고 이 코드를 다양한 타입의 객체에 대하여 재사용
 * 하는 객체지향 기법이다.
 * 원하는 타입의 객체만 받아들이기 위한 방법이다.
 * 격국 하나의 클래스에서 여러가지 타입을 한번에 다 지원하는 클래스가 제네릭클래스이다.
*/




