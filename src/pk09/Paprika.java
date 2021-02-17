package pk09;

public class Paprika extends Vegetable{
	private String color;
	private int price;
	private String name;
	
	public void set2(String color,int price, String name) {
		this.color=color;
		this.price=price;
		this.name=name;
	
	}
	
	public void Disp2() {
		System.out.println("분류 : "+sort);
		System.out.println("계절 : "+season);
		System.out.println("이름 : "+name);
		
	}
	
	public void Disp3() {
		System.out.println("색상 : "+color);
		System.out.println("가격 : "+price);
		System.out.println("이름 : "+name);
	}

}
