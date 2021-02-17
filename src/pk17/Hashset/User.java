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
			//유저 이름과 입력한 이름이 같으면서 나이와 나이가 같다면 되돌릴거다
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode()+age;
		//네임의 해쉬코드를 잡음으로 나이를 추가할때 해쉬코들를 추가로 안적어도 된다
	}


}
