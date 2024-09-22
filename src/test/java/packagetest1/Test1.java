package packagetest1;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import package1.HelloWorld3;

public class Test1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}



	@Test
	public final void testMain() {
		
		String[] array1 = {"a", "b", "c", "d", "e"};
		HelloWorld3 hello = new HelloWorld3();
		hello.main(array1);
	
	
	}

}
