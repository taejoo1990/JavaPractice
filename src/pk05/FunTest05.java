package pk05;

//Call by Reference : '�ּ� ������ ���� ȣ��'
public class FunTest05 {

	//�ʵ�
	int value;
	
	//������ 
	public FunTest05(int value) {
		this.value=value;
	}//�ٸ� ������ Ŭ������ �ҷ��ֱ� ���ؼ���  publicŬ������ �����ش�
	//�ٸ� ������ ��Ű���� �ҷ��ֱ� ���ؼ��� ��Ű���� ����Ʈ �ؾߵȴ�
	
	//�޼ҵ�
	public static void swap(FunTest05 x, FunTest05 y) {
		int temp=x.value;//���� ������ �ν���Ʈ �������Ѵ�(���� ����Ҽ� �ִ� ��ü)
		x.value=y.value;
		y.value=temp;
	}
	
	public static void main(String[] args) {
		
		FunTest05 a=new FunTest05(10);//x�� ����� �ּ�
		FunTest05 b=new FunTest05(20);//y�� ����� �ּ�
		
		System.out.println("swap() ȣ���� : a="+a+" , b="+b);
		//��ü�� �ּ�
		System.out.println("swap() ȣ���� : a="+a.value+" , b="+b.value);
		//��ü�� �ּ� �ȿ� ���� ����ϱ� ���ؼ��� .value�� ��������Ѵ�
		swap(a,b);
		System.out.println("swap() ȣ���� : a="+a+" , b="+b);
		System.out.println("swap() ȣ���� : a="+a.value+" , b="+b.value);
	}

}
