package pk09;

public class GoldCustomer extends Customer{

	//saleRatio ������
	double saleRatio;
	
	
	//������ customerID, customerName, customerGrade="GOLD"
	//bonusRatio : 0.02 saleRatio:0.1
	public GoldCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customeGrade="GOLD";
		bonusRatiol=0.02;
		saleRatio=0.1;
		
	}
	
	//caicPrice
	//bonusRatio��ŭ bonusPoint�� �����ϰ�
	//������ ���ݿ��� seleRatio������ŭ ����

	@Override
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatiol;
		return price-(int)(price*saleRatio);
	}

}
