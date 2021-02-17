package pk17.Stack_queue;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<>();
		//방법1
		//Coin ci=new Coin(100);
		//coinBox.push(ci);
		//방법2 추천!
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {//안에 데이터값이 0이 아니라면 0이 될때까지
				Coin ci=coinBox.pop();//오토박싱 int형에서 class로 넘겨줌
				System.out.println("꺼내온 동전 : "+ci.getValue()+"원");
				
		}System.out.println(coinBox.isEmpty());//안에 데이터값0이냐
		System.out.println("돈이 없습니다");
	}

}
