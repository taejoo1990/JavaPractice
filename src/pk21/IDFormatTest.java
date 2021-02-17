package pk21;

public class IDFormatTest {

	private String userID;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException{
		
		if(userID==null) {
			//Exception을 발생시키겠다. 메인에서 사용할때 처리
			throw new IDFormatException("아이디는 null일수 없습니다.");
		}
		else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8글자 이상 20글자 이하여야 합니다.");
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
