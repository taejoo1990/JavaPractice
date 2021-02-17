package pk14;

public class ExtendsEx1Main {

	public static void main(String[] args) {
		ExtendsEx1 v1=new ExtendsEx1();
		v1.setValue("TEST");
		//인자가 Object이지만 String이 Object를 상속 받았으므로 사용가능
		
		System.out.println("String : "+ v1.getValue());

		//정수(int)를 인자로 넣어봄
		ExtendsEx1 v2=new ExtendsEx1();
		v2.setValue(100);//(자동 형변환 : 기본자료형(int) ->객체(Object))AutoBoxing
		//v2는 형변환 했기에 클래스에서 객체로 변형됨
		
		//강제 형변환을 거쳐서 기본 자료형으로 변경(자바 8버전 미만)
		//int i=(Integer)v2.getValue();
		
		//지금은 캐스팅해도 사용할 수 있도록 바뀜
		//UnBoxing 객체 -> 기본 자료형
		int i=(int)v2.getValue();//언박싱과 다운캐스팅을 해줘야 엑박안남
		System.out.println("UnBoxing : "+i+1);
	}

}
