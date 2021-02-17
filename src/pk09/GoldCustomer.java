package pk09;

public class GoldCustomer extends Customer{

	//saleRatio 변수방
	double saleRatio;
	
	
	//생성자 customerID, customerName, customerGrade="GOLD"
	//bonusRatio : 0.02 saleRatio:0.1
	public GoldCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customeGrade="GOLD";
		bonusRatiol=0.02;
		saleRatio=0.1;
		
	}
	
	//caicPrice
	//bonusRatio만큼 bonusPoint에 적립하고
	//원래의 가격에서 seleRatio비율만큼 차감

	@Override
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatiol;
		return price-(int)(price*saleRatio);
	}

}
