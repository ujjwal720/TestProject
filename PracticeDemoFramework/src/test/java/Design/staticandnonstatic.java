package Design;

public class staticandnonstatic {

	static staticandnonstatic a = new staticandnonstatic();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticandnonstatic b = new staticandnonstatic();
		System.out.println("Hello beautiful");

	}

	public staticandnonstatic() {
		
		System.out.println("The floowing is an default constructor");

	}

}
