package pk18.HashMap;

public class Student {

	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		this.name=name;
		this.sno=sno;
	}
	
	//학번과 이름이 같으면 return 그렇지 않으면 false
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		//만약에//스튜던트를 오브젝에 상속하면
			Student st=(Student)obj;
			//오브젝 객체(다운캐스팅)를 스튜던트 객체에 담고
			return (st.name.equals(name))&&(st.sno==sno);
			//name와sno모두 같다면 되돌려(리턴)
		}else {
			return false;
		}
	}
	public int hashCode() {
		return name.hashCode()+sno;
	}//네임을 메인으로 해쉬코드를 사용할경우 위에 이프문에서 네임에 이퀄즈사용
	
}
