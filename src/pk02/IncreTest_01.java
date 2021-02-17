package pk02;

public class IncreTest_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=10;
		b=20;
		c=3;
		
		System.out.println("++a :" + (++a)); // a=a+1 or a+=1
		//++증감 연산으로인해 1더함
		System.out.println("a++ :" + (a++));
		//뒤에++이 있으면 출력후 계산
		System.out.println("후위계산 : " + a);//12
		System.out.println("c++ : " + (c++));
		System.out.println("후위계산 : " + c);
		System.out.println("++a + b++ : " + (++a + b++));//33
                                           //+13  +20
		System.out.println("후위계산 : " + b);
		//fir(int i=0; i<5;i++);
		//fir(int i=0; i<5;++i);
		
		
		
	}

}
