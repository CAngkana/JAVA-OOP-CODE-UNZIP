package ex1;
public class Calculator {
		// Calculate summation between x1 and x2 (series of x1 and x2)
		
	public void printSummationBetween(int x1, int x2) {
			//declare a local variable named "result" 
		int result=0;
			//instance variable will use private but local not need
			// Calculate series of x1 and x2 using for loop
		for(int i=x1;i<=x2;i++) {
				result=result+i;
				//result+=i;
		}
			
		System.out.println("Series of " + x1 + "," + x2 + "=" + result);
	}

	public int countOddNumbersBetween(int x1, int x2) {
		int oddNumbers=0;
		for(int i=x1;i<=x2;i++) {
			if (i%2==1) {
				oddNumbers++;
			}
		}
		return oddNumbers;
	}
	public int countEvenNumbersBetween(int x1, int x2) {
		int evenNumbers=0;
		for(int i=x1;i<=x2;i++) {
			if (i%2==0) {
				evenNumbers++;
			}
		}
		return evenNumbers;
	}
}
