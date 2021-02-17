package pk09;

public class StrawBerry extends Berry{
	//베리와 과일을 상속받을거야(베리는 과일 상속)(딸기는 베리상속)
	private String color;
	private int price;
	
	public void set3(String a, int b) {
		color=a;
		price=b;
		
	}
	
	public void Disp3() {
		System.out.println("색상 : "+color);
		System.out.println("가격 : "+price);
	}

}
