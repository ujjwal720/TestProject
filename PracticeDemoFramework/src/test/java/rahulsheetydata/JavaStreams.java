package rahulsheetydata;

import java.util.ArrayList;
import java.util.List;

public class JavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l=new ArrayList<String>();
		l.add("Man");
		l.add("Aman");
		long a=l.stream().filter(s->s.startsWith("M")).count();
		
		System.out.println(a);

	}

}
