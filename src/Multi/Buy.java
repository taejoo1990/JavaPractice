package Multi;

public interface Buy {

	void buy();
	
	default void order() {//디폴트 : 인터페이스는 메서드를 구현하면 안되서 디폴트 사용
		System.out.println("구매 주문");
		
	}
}
