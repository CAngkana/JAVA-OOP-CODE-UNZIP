package ex1;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		//Declare x1, x2 as integer
		int x1,x2;
		//Declare result for series of x1 and x2
	
		//Enter an integer to x1 from keyboard using class Scanner
		Scanner sc = new Scanner(System.in);
		x1 = sc.nextInt() ; // receive input
		//Enter an integer to x2
		x2 = sc.nextInt() ;
		
		//Create an instance of Calculator 
		Calculator calc = new Calculator();
		//classname objectref = new classname();
		
		//using instance of Calculator to invoke method "printSummationBetween(3,5)"
		calc.printSummationBetween(3, 5);
		//using instance of Calculator to invoke method "printSummationBetween(x1,x2)"
		calc.printSummationBetween(x1, x2);
		
		//invoke method "countOddNumbersBetween(1,3)"
		//print the number of odd numbers here
		int oddNumbers = calc.countOddNumbersBetween(1, 3);
		System.out.printf("จำนวนคี่ทั้งหมด %d ถึง %d = %d", 1 ,3, oddNumbers);
		System.out.printf("\nจำนวนคี่ทั้งหมด %d ถึง %d = %d", 1, 3, calc.countOddNumbersBetween(x1, x2));
		//""=String format
		
		//invoke method countEvenNumbersBetween(5, 10)"
		//print the number of even numbers here
		int evenNumbers = calc.countEvenNumbersBetween(5, 10);
		System.out.printf("\nจำนวนคู่ทั้งหมด %d ถึง %d = %d\n", 5 ,10, evenNumbers);
		System.out.printf("จำนวนคู่ทั้งหมด %d ถึง %d = %d", 5, 10, calc.countEvenNumbersBetween(x1, x2));
		
		//Close Scanner After usage
		sc.close();
	}

}
