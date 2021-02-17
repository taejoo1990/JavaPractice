package pk03;

public class Exampl06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for :
		/*
		 	*
		 	**
		 	***
		 	****
		 	*****
		*/

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (j == i) {
					System.out.println();
				}
			}
		}
		// for :
		/*
		 	*****
		 	****
		 	***
		 	**
		 	*
		*/
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");

			} // if colse
			System.out.println();
		} // for colse

	}// class colse

}
