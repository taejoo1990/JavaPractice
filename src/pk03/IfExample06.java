package pk03;

public class IfExample06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=10;
		int charge=0;
		int i=10;
		
		if(age<8) {
			charge=1000;
		}
		if(age<14) {
			charge=2000;
		}
		if(age<20 &&(i+=2)<0) {
			charge=2500;
		}//위에age는 true이고 i는 false이기에 결론은 false이므로 읽지 않는다
		System.out.println("입장료는 " +charge+ "원입니다");
		System.out.println(i);

	}

}
