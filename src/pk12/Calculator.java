package pk12;

//상속받은 Calc 추상클래스에서 일부만 구현되므로 추상클래스
//타입상속 
public abstract class Calculator implements Calc{
//interface의 경우 상속을 할경우 extends를 사용 못하고 implements를 사용해
//implements를 extends로 상속 받을수는 있아
	
	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1-num2;
	}

}
