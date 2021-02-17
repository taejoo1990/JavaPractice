package pk05;

import javax.swing.JOptionPane;

public class FunTest06 {
	
	//필드
	
	//생성자(객체의 초기화)
	//public FunTest06() {} 묵시적으로 존재(기본 클래스 생성자를 제외하고 있을시 반드시 명시해야함)
	//클래스 이름과 똑같을시 모두 생성자
	
	//배열이 매개변수로 구현되는 메소드
	public static void Disp(String A[]) {
		String res="";
		int i;//for문의 인덱스(루프하는 순서) 변수
		
		for(i=0;i<A.length;i++) {
			res+=A[i]+"\n"; //res=res+A[i]+"\n"
		}//for close
		System.out.println(res);//consol 출력
		
		JOptionPane.showMessageDialog(null,"배열의 원소값 \n" + res);
	}//Disp 
	
	
	

	public static void main(String[] args) {

		String str[]= {"ab2334","rt3435","kr1111","jk2365","op5689"};
		Disp(str);
		
	}

}
