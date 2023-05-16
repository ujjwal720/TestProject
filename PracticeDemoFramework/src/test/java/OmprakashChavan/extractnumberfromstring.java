package OmprakashChavan;

public class extractnumberfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String h = "This is an actual number 5057 and 98";
		String[] l = h.split(" ");
		for (int i = 0; i <= h.length() - 1; i++) {
			try {
				
				int x=Integer.parseInt(l[i]);
				System.out.println(x);

			} catch (Exception e) {

			}

		}

	}

}
