package pk13;

public class IntStack {
	private int max; //스택 용량
	private int ptr; //스택 포인터
	private int[] stk; //스택 본체(메모리)
	
	
	//실행 시 오류로 인한 예외 처리 : 즉 스택이 비워있는데 출력하려는 현상 (Underflow)
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	
	//실행 시 오류로 인한 예외 처리 : 스택이 가득 참 -> 입력하려는 현상 (Overflow)
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	//생성자
	public IntStack(int capacity) {
		ptr=0;
		max=capacity;
		try {
			stk=new int[max];//배열 메모리 구현
		}catch (OutOfMemoryError e) {
			max=0;
		}
	}//push 데이터를 하나 넣는것
	public int push(int x) throws OverflowIntStackException{
		if(ptr>=max)
			throw new OverflowIntStackException();
		return stk[ptr++]=x;
	}
	//pop 데이터를 하나 빼는거
	public int pop(int x) throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[--ptr]=x;
	}
	//peek 마지막에 들어와서 남아 있는 데이터를 보는거
	public int peek() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];//배열이 0부터 시작하므로 현재의 위치는 ptr-1로 확인
	}
	
	//스택에서 x를 찾아 인덱스 (없으면 -1)를 반환
	public int indexOf(int x) {
		for (int i = ptr-1;i>=0;i--)//선형검색
			if(stk[i]==x)
				return i;//검색성공
		return-1;//찾지못함
	}
	//스택을 비움
	public void clear() {
		ptr=0;
	}
	//스택의 용량을 변환
	public int capacity() {
		return max;
	}
	//스택에 쌓여있는 데이터 수
	public int size() {
		return ptr;
	}
	//스택이 비어 있는지 확인
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
