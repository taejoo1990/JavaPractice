package pk22.InputStream;

import java.io.IOException;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class SystemInTest1 {

	public static void main(String[] args) {
		
		System.out.print("���ĺ� �ϳ��� ���� [Enter]�� �������� : ");
		int i;
		try {
			i=System.in.read();
			System.out.println(i);//�ƽ�Ű�ڵ�
			System.out.println((char)i);//����
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
