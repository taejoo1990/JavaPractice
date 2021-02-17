package pk06;

import javax.swing.JOptionPane;

public class CarMain {

	public static void main(String[] args) {
		// Car 클래스의 객체생성(myCar)
		Car myCar = new Car();
		myCar.maxSpeed = 350;
		
		// 필드값 출력

		System.out.println("회사 :" + myCar.company + " 색상 :" + myCar.color + " 모델 :" + myCar.model + " 맥시멈스피드 :"
				+ myCar.maxSpeed + " 현재 스피드 :" + myCar.speed);

		// 필드값 변경
		myCar.company = "기아자동차";
		myCar.color = "하얀색";
		myCar.model = "K5";
		myCar.speed = 150;
		
		// 필드값 변경 후 출력(speed,company,model)
		System.out.println("회사 :" + myCar.company + " 색상 :" + myCar.color + " 모델 :" + myCar.model + " 맥시멈스피드 :"
				+ myCar.maxSpeed + " 현재 스피드 :" + myCar.speed);
		
	}

}
