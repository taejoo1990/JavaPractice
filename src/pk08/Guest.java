package pk08;

public class Guest {
	
	private String name;
	private String gender;
	
	public String getPoint(){
		return Guide.point;
	}//����ƽ�����̹Ƿ� Ŭ���������� �ܺο��� ȣ��

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
