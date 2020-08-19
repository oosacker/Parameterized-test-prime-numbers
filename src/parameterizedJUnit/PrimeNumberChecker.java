package parameterizedJUnit;

public class PrimeNumberChecker {

	public boolean primeCheck( int val ) {
//		if (val == 2) 
//			return true;
//
//		if(val % 2 == 0 || val % 3 == 0) {
//			return false;
//		}
//
//		int i = 5;
//		while(i * i <= val) {
//			if(val % i == 0 || val % (i+2) == 0) {
//				return false;
//			}
//			i+=6;
//		}
//		return true;	
//	}
		
		for (int i = 2; i < (val / 2); i++) {
	         if (val % i == 0) {
	            return false;
	         }
	      }
	      return true;
	
	}
}
