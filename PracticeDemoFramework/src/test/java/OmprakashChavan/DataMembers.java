package OmprakashChavan;

public class DataMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		axe a=new axe();
		a.setA(100);
		a.kl();
		
		
		
		
	
		

	}

}


class axe{
	private int a;
	private int b;
	public int getA() {
		return a;
	}



	public void setA(int a) {
		this.a = a;
	}



	public int getB() {
		return b;
	}



	public void setB(int b) {
		this.b = b;
	}




	
	
	
	public void kl() {
		
		System.out.println(a+1);
	}
}