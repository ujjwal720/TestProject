package Design;

public class inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		pop a=new poi();
	   a.m1();
	  System.out.println(a.a);
	}

}


class pop{
	public int a=10;
	public void m1() {
		System.out.println("Hellos");
	}
	
	public void m1(int j,String s) {
		System.out.println("This is method overloading");
	}
	public void m1(String j,int s) {
		System.out.println("This is method overloading");
	}
}

class poi extends pop{
	public int a=20;
	public void m1() {
		System.out.println("Hellos child");
	}
}