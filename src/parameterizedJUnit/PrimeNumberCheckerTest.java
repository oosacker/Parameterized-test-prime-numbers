package parameterizedJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

	private Integer inputNum;
	private Boolean expectedRes;
	private PrimeNumberChecker primeNumberChecker;
	
	@Before
	public void initialize() {
		System.out.println("Initlialize");
		primeNumberChecker = new PrimeNumberChecker();
	}

	/**
	 * Constructor
	 */
	public PrimeNumberCheckerTest(Integer inputNum, Boolean expectedRes) {
		System.out.println("Constructor");
		this.inputNum = inputNum;
		this.expectedRes = expectedRes;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
		System.out.println("Generate test cases...");
		return Arrays.asList(new Object[][] {
			{2, false},
			{6, false},
			{19, true},
			{22, true},
			{20, false},
			{11, false}
		});
	}
	
	@Test
	public void testPrimeNumberChecker() {
		System.out.println("Parameterized number: " + inputNum);
		assertEquals(expectedRes, primeNumberChecker.primeCheck(inputNum));
	}
	
}
