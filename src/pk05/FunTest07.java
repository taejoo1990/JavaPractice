package pk05;

public class FunTest07 {
	//Recursive call(재귀적 함수)
	public static int Recur1(int a) {
		int gop;
		System.out.println(a);
		if (a==1)
			return (1);//breck와 같은 개념
		else gop=a*Recur1(a-1);//자기가 자기 자신을 호출(재귀 함수)
		
		return (gop);
		//스택 메모리의 경우 한번 사용하고 본인의 자리로 돌아간다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int res, x=4;
		System.out.println("여기는 main()영역 입니다");
		res=Recur1(x);
		
		System.out.println();
		System.out.println("1 ~ 4 수의 곱 : "+ res+ "\n");
		
		System.out.println("스텍 메모리에서 함수가 소멸되는 시점 => 메인으로 돌어옴");

	}

}
