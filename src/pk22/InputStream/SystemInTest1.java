package pk22.InputStream;

import java.io.IOException;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class SystemInTest1 {

	public static void main(String[] args) {
		
		System.out.print("알파벳 하나를 쓰고 [Enter]를 누르세요 : ");
		int i;
		try {
			i=System.in.read();
			System.out.println(i);//아스키코드
			System.out.println((char)i);//문자
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
