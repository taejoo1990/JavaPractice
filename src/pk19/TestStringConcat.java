package pk19;

public class TestStringConcat {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="World";
		
		//has a
		StringConcatImp1 con=new StringConcatImp1();
		con.maksString(s1, s2);
		
		//lambda//화살표를 꼭 사용해줘야한다
		StringConcat con2=(s,v)->System.out.println(s+", "+v);
		con.maksString("모르겠다", "람다식");
		
		//익명의 클래스
		StringConcat con3=new StringConcat() {
			
			@Override
			public void maksString(String s1, String s2) {
				System.out.println(s1+", "+s2);
				
			}
		};
		con3.maksString("익명의클래스", "귀찮네");
	}
}
