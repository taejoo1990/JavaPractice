package pk06;

public class Can {
	
	private String canName;//음료 이름
	private int price;//가격
	
	//생성자
	Can(String canname, int price){
		this.canName=canname;
		this.price=price;
	}

	public String getCanName() {
		return canName;
	}

	public void setCanName(String canName) {
		this.canName = canName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
