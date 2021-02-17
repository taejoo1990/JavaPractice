package pk17.Stack_queue;

import java.util.ArrayList;

class MyQueue{
	
	private ArrayList<String> arrQueue=new ArrayList<>();
	//add,get���� �Լ��� ���� ���� ����ϱ� ���ؼ� �����̺��� ���
	//��̸���Ʈ�� ������ Ȱ���ϸ鼭 ť�� ������ ���� ����ϱ�����
	//�Է�
	public void enQueue(String data) {
		arrQueue.add(data);
		
	}
	//���
	public String deQueue() {
		int len=arrQueue.size();
		if(len==0) {
			System.out.println("ť�� ����ֽ��ϴ�.");
			return null;
		}
		return(arrQueue.remove(0));
	}
	
}

public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue queue=new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());

	}

}
