package pk03;

public class IfExample08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=(int)(Math.random()*6)+1;
		//앞에 int기에 Math.random는char이기에 앞에 (int)로 맞춰준다
		//Math.random 기본 double
		//double num1=(Math.random()*6);//실수인 숫자가 랜덤으로 추출됨
		//integer.parseInt : string ->int
		System.out.println("num : " + num);
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}

	}

}
