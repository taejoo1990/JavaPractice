package pk05;

import javax.swing.JOptionPane;

public class FunTest06 {
	
	//�ʵ�
	
	//������(��ü�� �ʱ�ȭ)
	//public FunTest06() {} ���������� ����(�⺻ Ŭ���� �����ڸ� �����ϰ� ������ �ݵ�� ����ؾ���)
	//Ŭ���� �̸��� �Ȱ����� ��� ������
	
	//�迭�� �Ű������� �����Ǵ� �޼ҵ�
	public static void Disp(String A[]) {
		String res="";
		int i;//for���� �ε���(�����ϴ� ����) ����
		
		for(i=0;i<A.length;i++) {
			res+=A[i]+"\n"; //res=res+A[i]+"\n"
		}//for close
		System.out.println(res);//consol ���
		
		JOptionPane.showMessageDialog(null,"�迭�� ���Ұ� \n" + res);
	}//Disp 
	
	
	

	public static void main(String[] args) {

		String str[]= {"ab2334","rt3435","kr1111","jk2365","op5689"};
		Disp(str);
		
	}

}
