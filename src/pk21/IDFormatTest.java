package pk21;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException{
		
		if(userID==null) {
			//Exception�� �߻���Ű�ڴ�. ���ο��� ����Ҷ� ó��
			throw new IDFormatException("���̵�� null�ϼ� �����ϴ�.");
		}
		else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("���̵�� 8���� �̻� 20���� ���Ͽ��� �մϴ�.");
		}
		this.userID=userID;
	}
	
	
	
	
	public static void main(String[] args) {
		
		IDFormatTest test=new IDFormatTest();
		String userID=null;
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		userID="1234567";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}

}
