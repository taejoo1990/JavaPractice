package pk09;

public class Customer {
	//��� �ȵ�
	//private int customerID;
	//private String customerName;
	//private String customeGrade;
	
	//protected�� 
	
	protected int customerID;
	protected String customerName;
	protected String customeGrade;
	
	public int bonusPoint;
	double bonusRatiol;
	
	
	public Customer() {
		
		customeGrade="SILVER";
		bonusRatiol=0.01;
	}
	//�������� �����ε�
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
		return customerName+"���� �����"+customeGrade+"�̸�, ���ʽ� ����Ʈ��"+bonusPoint+"�Դϴ�.";
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
