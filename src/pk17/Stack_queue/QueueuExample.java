package pk17.Stack_queue;

import java.util.LinkedList;
import java.util.Queue;


public class QueueuExample {

	public static void main(String[] args) {
		
		Queue<Message> messageQueue=new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail","È«µÎ±ú"));
		messageQueue.offer(new Message("sendSMS","¹Ú¼Ò¿¬"));
		messageQueue.offer(new Message("sendKakaotalk","ÀÌ¼öÁø"));
		messageQueue.offer(new Message("sendKakaotalk","Á¤¹Î¾Æ"));
		messageQueue.offer(new Message("sendMsg","À±±ÙÇõ"));
		
		while(!messageQueue.isEmpty()) {
			Message messge=messageQueue.poll();
			switch (messge.command) {
			case "sendMail":
				System.out.println(messge.to+"´Ô¿¡°Ô ¸ÞÀÏÀ» º¸³Â½À´Ï´Ù.");
				break;
			case "sendSMS":
				System.out.println(messge.to+"´Ô¿¡°Ô SMS¸¦ º¸³Â½À´Ï´Ù.");
				break;
			case "sendKakaotalk":
				System.out.println(messge.to+"´Ô¿¡°Ô Ä«Ä«¿ÀÅåÀ» º¸³Â½À´Ï´Ù.");
				break;
			case "sendMsg":
				System.out.println(messge.to+"´Ô¿¡°Ô Msg¸¦ º¸³Â½À´Ï´Ù.");
				break;
			
			}
			
		}
	}

}
