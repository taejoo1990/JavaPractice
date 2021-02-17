package pk20;

public class TravalCustomer {
	
	private String name;
	private int age;
	private int price;

	public TravalCustomer(String name, int age, int price) {
		this.name=name;
		this.age=age;
		this.price=price;
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		
		return "name : "+name+"age : "+age+"price : "+price;
	}
	
	
	
}
