package pk17.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class PersonManger {
	
	public void personMgr() {
		int select;
		Person p; //p=new Person();
		
		
		//Person�� ��ü�� ������ �� �ִ� ArrayList ��ü����(persinArr)
		ArrayList<Person> persinArr=new ArrayList<>();
		
		//1. �����߰�(set,get)
		//2. ��������
		//3. ��ü�����˻�
		//4. ����
		
		while(true	) {
			System.out.println("1. �����߰�");
			System.out.println("2. ��������");
			System.out.println("3. ��ü�����˻�");
			System.out.println("4. ����");
			System.out.print("�׸��� �����ϼ��� : ");
			
			Scanner sc=new Scanner(System.in);
			select=sc.nextInt();
			
			
			switch(select) {
			
			case 1://�����߰�
				//������ �߰��Ҷ����� Person��ü�� ����
				p=new Person();
				System.out.println("------�����߰�------");
				System.out.print("�̸� : ");
				p.setName(sc.next());
				
				System.out.print("���� : ");
				p.setAge(sc.nextInt());
				
				System.out.print("��ȭ��ȣ : ");
				p.setTal(sc.next());
			
				persinArr.add(p);
				System.out.print("ȸ��������  �Ϸ�Ǿ����ϴ�.");
				break;
				
			case 2:	//���� ����
				System.out.println("------��������------");
				System.out.print("������ �̸� : ");
				String name=sc.next();
				for (int i = 0; i < persinArr.size(); i++) {
					
					if((persinArr.get(i).getName()).equals(name)){
						System.out.println(name+"�� ������ �����Ͽ����ϴ�.");
						break;
					}else {
						if(i+1==persinArr.size())
							System.out.println(name+"�� �������� �ʽ��ϴ�.");
					}
						
				}
				break;
				
			case 3://��ü�����˻�
				System.out.println("-----��ü ����-----");
				System.out.println("����ο�"+persinArr.size()+"��");
				for (int i = 0; i <persinArr.size(); i++) {
					System.out.println("�̸� : "+persinArr.get(i).getName());
					System.out.println("���� : "+persinArr.get(i).getAge());
					System.out.println("��ȭ��ȣ : "+persinArr.get(i).getTal());
					System.out.println("--------------------------------------");
					//for�� ��� �˻��ӵ��� ����ϱ� ���Ͽ� �ݺ���ȯ�� ������ ������Ʈ��
					//��ȯ�Ͽ� Iterator ��� 
					/*
					Iterator<Person> it=persinArr.iterator();
					
					while(it.hasNext()) {
						p=it.next();
						System.out.println("�̸� : "+p.getName());
						System.out.println("���� : "+p.getAge());
						System.out.println("��ȭ��ȣ : "+p.getTal());
					}*/
				}break;
				
				default:
					System.out.println("���α׷� ����");
					return;
			}//switch	
		}//while
	}//method
}//class
