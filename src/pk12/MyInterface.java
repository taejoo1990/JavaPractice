package pk12;
//interface = X+Y+MyInterface
public interface MyInterface extends X,Y{
//x와y는 활용할수 없지만 MyInterface호출시 x,y를 같이 호출
	void myMethod();
}
