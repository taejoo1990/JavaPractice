package pk09;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	
	public VIPCustomer() {
		customeGrade="VIP";
		bonusRatiol=0.02;
		saleRatio=0.1;
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID,customerName);
		customeGrade="VIP";
		bonusRatiol=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		
	}
	//calcPrice override
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatiol;
		return price-(int)(price*saleRatio);
	}

	@Override
	public String showCustomerInfo() {
		// TODO Auto-generated method stub
		return super.showCustomerInfo()+"담당 상담원 아이디는 : "+agentID+"입니다.";
	}
	
}
