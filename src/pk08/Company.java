package pk08;

public class Company {
	
	//singleon
	private static  Company instance=new Company();
	//�ܺο����� ����� �� �����Ƿ� ���ο��� �����ڸ� �����ϰ� �װ��� getInstance�� ���ؼ� ������
	private Company() { }
		
	public static Company getInstance() {
		if(instance==null) {
			instance=new Company();
		}
		return instance;	
	}

}
