package pk14;

import java.util.Random;

public class MyLotto {

	public static void main(String[] args) {
		//�ζǹ�ȣ 6���� ���� �迭 �غ�
		int[] lotto=new int[6];
		System.out.print("������ �����ȣ : ");
		outer:for(int i=0;i<lotto.length;) {//i++����
			
			lotto[i] =new Random().nextInt(45)+1;
			
			//�ߺ����� ���ϴ� �ݺ���
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					continue outer;//������ ���� �ʰڴ�.
				}
			}//inner for
			System.out.print(lotto[i]+" ");
			i++;
		}//outer for
		
	}

}
