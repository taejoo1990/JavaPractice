package pk17.Stack_queue;

import java.util.Stack;

public class StackTest1 {
	
	public static void main(String[] args) {
		
		Object obj;
		//empty ���û���
		Stack<Object> st=new Stack<>();
		
		if (st.empty()) {
			for (int i=0;i<=3; i++) {
				st.push(new String("Hi-"+i));
				System.out.println("�Է� "+i+"���� : "+st.peek());
			}
		}//if
		System.out.println(st.pop());
		st.pop();
		System.out.println("���� Top�� ��ġ(peek) : "+st.peek());
		st.push(new String("everybody"));
		System.out.println(st.peek());
		st.push(new String("heppy"));
		System.out.println(st.peek());
		
		
	}

}
