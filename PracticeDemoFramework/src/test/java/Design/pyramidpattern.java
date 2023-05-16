package Design;

public class pyramidpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		int m = 4;

		for (int i = 1; i <= 4; i++) {

			

			for (int j = 1; j <= 7; j++) {

				if (j >= n && j <= m) {

					System.out.print("*");

				} else {

					System.out.print(" ");

				}

			}
			n--;
			m++;
			System.out.println();
			
		

		}

	}

}
