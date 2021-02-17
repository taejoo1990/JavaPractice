package pk08;

public class CompanyTest {
	
		public static void main(String[] args) {
		
				/*Company Company1=new Company();
				Company Company2=new Company();
				
				System.out.println(Company1);
				System.out.println(Company2);*/
			
			Company myCompany1=Company.getInstance();
			Company myCompany2=Company.getInstance();
				
			
			System.out.println(myCompany1==myCompany2);
			System.out.println(myCompany1);
			System.out.println(myCompany2);
			
			
		}

}
