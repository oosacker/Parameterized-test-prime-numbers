package parameterizedJUnit;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);
			
		System.out.println("Test result:");
		
		for(Failure fail : result.getFailures()) {
			System.out.println("Error: "+fail.toString());
			
		}
		System.out.println("Test successful: " +result.wasSuccessful());
	}

}
