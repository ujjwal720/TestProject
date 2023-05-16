package Design;

public class patternprintprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;

		for (int i = 1; i <= 7; i++) {

			if (i <=4) {
				n++;
			}
			if (i > 4) {

				n--;
			}

			for (int j = 1; j <= 4; j++) {

				if (j >= 1 && j <= n) {

					System.out.print("*");

				} else {

					System.out.print(" ");

				}

			}

			System.out.println();

		}

	}

}
