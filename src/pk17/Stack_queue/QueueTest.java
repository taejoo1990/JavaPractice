package pk17.Stack_queue;

import java.util.ArrayList;

class MyQueue{
	
	private ArrayList<String> arrQueue=new ArrayList<>();
	//add,get말고 함수를 새로 만들어서 사용하기 위해서 프라이빗을 사용
	//어레이리스트의 장점을 활용하면서 큐의 장점을 같이 사용하기위해
	//입력
	public void enQueue(String data) {
		arrQueue.add(data);
		
	}
	//출력
	public String deQueue() {
		int len=arrQueue.size();
		if(len==0) {
			System.out.println("큐가 비어있습니다.");
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
