package Multi;

public class Customer implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("판매하기");
		
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}
	//디폴트 메서드 구현
	@Override
	public void order() {
		System.out.println("고객 판매 주문");
		//Buy.super.order();
	}

}
