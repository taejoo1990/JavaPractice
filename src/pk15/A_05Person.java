package pk15;

public class A_05Person {
	
	private String name;
	private int age;
	
	//奄段 持失切
	public A_05Person() {
	}
	//持失切
	public A_05Person(String name) {
		this.name=name;
	}
	public A_05Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	//五社球
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
}
