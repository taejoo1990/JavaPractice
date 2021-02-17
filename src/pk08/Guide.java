package pk08;

public class Guide {
	
	static String point;
	Guest[] guest;//배열의 객체 선언
	
	//생성자를 이용하여 초기화
	public Guide(int n) {
		point="제주도";
		guest=new Guest[n];//필요한 수만큼 배열 선언
		
		for(int i=0;i<guest.length;i++) {
			guest[i]=new Guest();//배열 초기화
		}

	}
	

}
