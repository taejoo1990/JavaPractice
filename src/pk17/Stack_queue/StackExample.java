package pk17.Stack_queue;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<>();
		//���1
		//Coin ci=new Coin(100);
		//coinBox.push(ci);
		//���2 ��õ!
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {//�ȿ� �����Ͱ��� 0�� �ƴ϶�� 0�� �ɶ�����
				Coin ci=coinBox.pop();//����ڽ� int������ class�� �Ѱ���
				System.out.println("������ ���� : "+ci.getValue()+"��");
				
		}System.out.println(coinBox.isEmpty());//�ȿ� �����Ͱ�0�̳�
		System.out.println("���� �����ϴ�");
	}

}
