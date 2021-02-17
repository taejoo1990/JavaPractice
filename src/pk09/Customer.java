package pk09;

public class Customer {
	//상속 안됨
	//private int customerID;
	//private String customerName;
	//private String customeGrade;
	
	//protected는 
	
	protected int customerID;
	protected String customerName;
	protected String customeGrade;
	
	public int bonusPoint;
	double bonusRatiol;
	
	
	public Customer() {
		
		customeGrade="SILVER";
		bonusRatiol=0.01;
	}
	//생성자의 오버로딩
	public Customer(int customerId, String customerName) {
		this.customerID=customerID;
		this.customerName=customerName;
		customeGrade="SILVER";
		bonusRatiol=0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint+= price*bonusRatiol;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName+"님의 등급은"+customeGrade+"이며, 보너스 포인트는"+bonusPoint+"입니다.";
	}
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomeGrade() {
		return customeGrade;
	}
	public void setCustomeGrade(String customeGrade) {
		this.customeGrade = customeGrade;
	}
	

}
