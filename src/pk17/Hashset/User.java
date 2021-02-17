package pk17.Hashset;

public class User {
	
	public String name;
	public int age;
	
	public User(String name,int age) {
		this.name=name;
		this.age=age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User user=(User)obj;
			return user.name.equals(name)&&(user.age==age);
			//���� �̸��� �Է��� �̸��� �����鼭 ���̿� ���̰� ���ٸ� �ǵ����Ŵ�
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age;
		//������ �ؽ��ڵ带 �������� ���̸� �߰��Ҷ� �ؽ��ڵ鸦 �߰��� ����� �ȴ�
	}


}
