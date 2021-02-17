package pk13;

//개념정리
public class S {
	//객체가 있어야 사용
	int field1;//1  hip영역
	void method1() {}//2   hip영역
	//객체가 없어도 사용가능
	static int field2;//3  데이터 영역
	static void method2() {}//4   데이터 영역
	
	class B{//모든걸 가져온다   hip영역
		void method() {
			field1=10;//1
			method1();//2
			
			field2=20;//3
			method2();//4
		}
	}
	
	static class C{//스택틱은 사용   데이터 영역
		void method() {
			//int field1;//1
			//void method1() {}//2
			field2=30;//3
			method2();//4
		}
	}

}
