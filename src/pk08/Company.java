package pk08;

public class Company {
	
	//singleon
	private static  Company instance=new Company();
	//외부에서는 사용할 수 없으므로 내부에서 생성자를 구현하고 그것을 getInstance를 통해서 가져감
	private Company() { }
		
	public static Company getInstance() {
		if(instance==null) {
			instance=new Company();
		}
		return instance;	
	}

}
