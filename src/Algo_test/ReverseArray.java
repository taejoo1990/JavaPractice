package Algo_test;

public class ReverseArray {
	
	//�迭��� a[idx1]�� a[idx2]�� ���� �ٲ�
	
	static void swap(int[] a, int idx1,int idx2) {
		
		int	temp=a[idx1];
		//idx1��temp�� �ѱ�ž�
		a[idx1]=a[idx2];
		//idx2�� idx1�� �ѱ�ž�
		a[idx2]=temp;
		//temp�� idx2�� �ѱ�ž�
	}
	/*a[0]a[1]a[2]a[3]a[4]
	    5    2	 8   9   7*/
	
	
	//�迭 a�� ��Ҹ� �������� ����
	
	static void reverse(int[] a) {
		
		for(int i=0;i<a.length/2;i++)
		//a�迭�� ������ ���ݱ��� +1�ϸ鼭 �ν��Ұž�(����)a0~1(Ȧ���� 2.5�̱⿡ ����2)
			swap(a,i,a.length-i-1);//�޼ҵ忡�� �޼ҵ带 ȣ��
		//a�迭�� ������ �ڿ������� ���ݱ��� -1 �ϸ鼭 �ν��Ұž�(����)a4~3
	}//�������� ���� ù��°�� �ټ���°�� ��ġ�� �ٲٰ�
	//�ι�°�� �׹�°�� ��ġ�� �ٲ����� ���� �������� ����
	//[5<=>7][2<=>9]

}
