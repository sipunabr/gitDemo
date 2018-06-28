package selfLearning.gitBasics;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClasssAnnotations {
	
	@BeforeClass
	public void beforeClassMethod() {
		System.out.println("This is before class method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("This is test method1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("This is test method2");
	}

}
