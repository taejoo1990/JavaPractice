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
		System.out.println("�з� : "+sort);
		System.out.println("���� : "+season);
		System.out.println("�̸� : "+name);
		
	}
	
	public void Disp3() {
		System.out.println("���� : "+color);
		System.out.println("���� : "+price);
		System.out.println("�̸� : "+name);
	}

}
