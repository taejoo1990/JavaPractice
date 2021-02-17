package pk17.Stack_queue;

import java.util.LinkedList;
import java.util.Queue;


public class QueueuExample {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue=new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail","ȫ�α�"));
		messageQueue.offer(new Message("sendSMS","�ڼҿ�"));
		messageQueue.offer(new Message("sendKakaotalk","�̼���"));
		messageQueue.offer(new Message("sendKakaotalk","���ξ�"));
		messageQueue.offer(new Message("sendMsg","������"));
		
		while(!messageQueue.isEmpty()) {
			Message messge=messageQueue.poll();
			switch (messge.command) {
			case "sendMail":
				System.out.println(messge.to+"�Կ��� ������ ���½��ϴ�.");
				break;
			case "sendSMS":
				System.out.println(messge.to+"�Կ��� SMS�� ���½��ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(messge.to+"�Կ��� īī������ ���½��ϴ�.");
				break;
			case "sendMsg":
				System.out.println(messge.to+"�Կ��� Msg�� ���½��ϴ�.");
				break;
			
			}
			
		}
	}

}
