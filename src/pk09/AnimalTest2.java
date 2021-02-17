package pk09;

import java.util.ArrayList;

public class AnimalTest2 {

	ArrayList<Animal> aniList =new ArrayList<Animal>();
	
	
	public static void main(String[] args) {
		AnimalTest2 aTest=new AnimalTest2();//has - A (��ü����)
		System.out.println("��ü ������ �����ε��� move�� ���� ���");
		aTest.addAnimal();
		
	}

	public void addAnimal() {
		//ArrayList�� �迭 aniList�� �߰�(Animal type���� ����ȯ�Ǿ� �߰��Ǵ� ����)
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		//for������ �����ε��� move���
		for(Animal ani:aniList) {//������ �迭�� ��Ҹ� Animal������ ������ Move�� ȣ��
			ani.move();
			
		}
		
	}
	
	public void testCasting() {
		for(int i=0;i<aniList.size();i++) {
			
			Animal ani=aniList.get(i);
			
			if(ani instanceof Human) {
				Human h=(Human)ani;
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger t=(Tiger)ani;
				t.hunting();
			}else if(ani instanceof Eagle) {
				Eagle e=(Eagle)ani;
				e.fiying();
			}else
				System.out.println("�������� �ʴ� Ÿ���Դϴ�.");
			
		}
	}
}
