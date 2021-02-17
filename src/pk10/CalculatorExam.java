package pk10;

public class CalculatorExam {
	
		//CalculatorExam클래스를 만들고
		//getResult()함수를 정의하세요. 반환형은 정수.
		//인자 두개(n1,n2)를 받고 -1로 리턴하게 만듭니다.
	
		//Calplus클래스를 만들어 CalculatorExam클래스를 상속받으세요.
		//오버라이딩을 이용하여 CalculatorExam의 getResult()함수를
		//인자로 받은 n1과 n2를 더해주는 함수로 만듭니다.
		//물론 리턴값도 -1이면 안되겠죠?
	
		//CalMinus클래스를 만들어 CalculatorExam클래스를 상속받으세요.
		//오버라이딜을 이용 하여 CalculatorExam의 getResult()함수를
		//인자로 받은 n1과 n2를 빼주는 함수로 만듭니다.
	
		//메소드에 return값
		//return 0 : 정상종료   예) return a+b;
		//return 1 이상의 숫자 : 정상종료가 되었으나 불안정한 상태여서 무언가가 있음을 나타냄
		//return -1 : 에러 발생 즉 바디({})가 있으나 구현이 되어있지 않음
						//줄 내용은 없으나 에러를 막기위해 -1을 이용해 대비
		//return -2 : 에러발생되고 구체적으로 무언가가 있을을 나타냄
	
	public int getResult(int n1, int n2) {   //{}<-이 블록을 바디라고 표현한다
		return -1;
	}

}
