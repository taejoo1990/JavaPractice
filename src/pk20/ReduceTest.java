package pk20;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		
		if(s1.getBytes().length>=s2.getBytes().length)
			return s1;
		else
		return s2;
	}
}


public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings= {"귀찮구만","어렵구만","보자보자","다시보자~"};
		//방법 : reduce(초깃값, 전달되는 요소)
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->
							{if(s1.getBytes().length>=s2.getBytes().length)
									return s1;
							else
									return s2;}));
		
		//방법2 : class활용이므로 reduce문법에서 초깃값은 생략해야한다
		String str=Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
	}

}
