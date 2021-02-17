package pk14;

public class IntegerTest {

	public static void main(String[] args) {
		//Integer i=new Integer(100);//deprecated : 사용을 권장하지 않음
		
		Integer num=100;
		int iNum=num.intValue(); //Integer에서 정수값만 가져옴(Unboxing)
		int jNum=200;
		
		int sum=iNum+jNum;
		System.out.println(sum);
		
		//언박싱
		int total=num+jNum;//num.inValue()+jNum
		System.out.println(total);
		
		//오토박싱
		Integer i=jNum;
		System.out.println(i);//Integer.valueOf(jNum)

	}

}
