package pk08;

public class Guest {
	
	private String name;
	private String gender;
	
	public String getPoint(){
		return Guide.point;
	}//스테틱변수이므로 클래스명으로 외부에서 호출

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
