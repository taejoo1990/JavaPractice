package pk17.ArrayList;

import java.util.ArrayList;

public class ArrayEx2 {

	public static void main(String[] args) {


		ArrayList<String> list=new ArrayList<>();
		System.out.println(list);
		list.add("��������");
		list.add("�������");
		list.add("�̼���");
		list.add("�ָ�");
		list.add("�����ҹ�");

		System.out.println(list);
		
		System.out.println("=============");
		System.out.println("list[0] : "+list.get(0));
		System.out.println("list[2] : "+list.get(2));
	}

}
