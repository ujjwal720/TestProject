package RahulPractice;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Liteners basically listen to ur test
@Listeners(test.class)
public class test1 {
	
	

	@Test
	public void setup() {
	   Assert.assertEquals("Mam", "Mamo");
	}

}
