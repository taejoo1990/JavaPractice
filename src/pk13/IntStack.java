package pk13;

public class IntStack {
	private int max; //���� �뷮
	private int ptr; //���� ������
	private int[] stk; //���� ��ü(�޸�)
	
	
	//���� �� ������ ���� ���� ó�� : �� ������ ����ִµ� ����Ϸ��� ���� (Underflow)
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	
	//���� �� ������ ���� ���� ó�� : ������ ���� �� -> �Է��Ϸ��� ���� (Overflow)
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	//������
	public IntStack(int capacity) {
		ptr=0;
		max=capacity;
		try {
			stk=new int[max];//�迭 �޸� ����
		}catch (OutOfMemoryError e) {
			max=0;
		}
	}//push �����͸� �ϳ� �ִ°�
	public int push(int x) throws OverflowIntStackException{
		if(ptr>=max)
			throw new OverflowIntStackException();
		return stk[ptr++]=x;
	}
	//pop �����͸� �ϳ� ���°�
	public int pop(int x) throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[--ptr]=x;
	}
	//peek �������� ���ͼ� ���� �ִ� �����͸� ���°�
	public int peek() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];//�迭�� 0���� �����ϹǷ� ������ ��ġ�� ptr-1�� Ȯ��
	}
	
	//���ÿ��� x�� ã�� �ε��� (������ -1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = ptr-1;i>=0;i--)//�����˻�
			if(stk[i]==x)
				return i;//�˻�����
		return-1;//ã������
	}
	//������ ���
	public void clear() {
		ptr=0;
	}
	//������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	//���ÿ� �׿��ִ� ������ ��
	public int size() {
		return ptr;
	}
	//������ ��� �ִ��� Ȯ��
	public boolean isEmoty() {
		return ptr<=0;
	}
	
	public boolean isfull() {
		return ptr>=max;
	}
	public void pop() {
		// TODO Auto-generated method stub
		
	}
	
}
