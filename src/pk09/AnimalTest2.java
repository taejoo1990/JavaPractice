package pk09;

import java.util.ArrayList;

public class AnimalTest2 {

	ArrayList<Animal> aniList =new ArrayList<Animal>();
	
	
	public static void main(String[] args) {
		AnimalTest2 aTest=new AnimalTest2();//has - A (객체생성)
		System.out.println("객체 생성후 오버로딩된 move를 각각 출력");
		aTest.addAnimal();
		
	}

	public void addAnimal() {
		//ArrayList의 배열 aniList에 추가(Animal type으로 형변환되어 추가되는 것임)
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		//for문으로 오버로딩된 move출력
		for(Animal ani:aniList) {//각각의 배열의 요소를 Animal형으로 꺼내서 Move를 호출
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
				System.out.println("지원되지 않는 타입입니다.");
			
		}
	}
}
