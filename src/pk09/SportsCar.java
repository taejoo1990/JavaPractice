package pk09;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		speed +=10;
	}
	/*	
 	//Car에 있는 final로인해 오버라이딩을 할수없음
	public void stop() {
		System.out.println("스포츠카를 멈춤");
		speed=0;

	}
	*/
	

}
