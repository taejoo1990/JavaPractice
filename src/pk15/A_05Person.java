package pk15;

public class A_05Person {
	
	private String name;
	private int age;
	
	//���� ������
	public A_05Person() {
	}
	//������
	public A_05Person(String name) {
		this.name=name;
	}
	public A_05Person(String name, int age) {
		this.name=name;
		this.age=age;
	}

	//�޼ҵ�
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
