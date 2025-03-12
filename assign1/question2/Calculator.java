/*
 * ชัชภรณ์ อังคณารุ่งรัตน์ Chatchaporn Angkanrungrat
 * 6709616418
 */
package question2;
import java.util.Scanner;

public class Calculator {
    private String expression; // เก็บนิพจน์ที่ป้อน
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==============================================");
        System.out.println("         Simple Arithmetic Calculator         ");
        System.out.println("==============================================");
        System.out.println("Enter two positive numbers and an operator");
        System.out.println("(Supports only addition and subtraction)");
        System.out.println("Format: <number1> <operator> <number2>");
        System.out.println("Example: 10 + 20");
        System.out.println("Type \"q\" to exit.");
        
        // while ( condition )
        while (true) {
            System.out.print("\nInput: ");
            String input = scanner.nextLine().trim();
            
            if (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit")) {
                System.out.println("\n==============================================");
                System.out.println("             Thank you for using\n         Simple Arithmetic Calculator         ");
                System.out.println("==============================================");
                break;
            }
            
            //********************************************
            Calculator calculator = new Calculator();
            calculator.setExpression(input);
            
            if (calculator.isValidExpression()) {
                String operand1 = calculator.extractOperand1();
                String operand2 = calculator.extractOperand2();
                String operator = calculator.extractOperator();
                
                SimpleArithmeticExpression expr = new SimpleArithmeticExpression();
                expr.setOperand1(operand1);
                expr.setOperand2(operand2);
                expr.setOperator(operator);
                System.out.println("You entered: " + input);
                System.out.println("Result: " + expr.computeExpression());
                
            } else {
                System.out.println("Invalid format!");
                System.out.println("Correct format: <number1> <operator> <number2>");
                System.out.println("Supported operators: +, -\n");
            }
        } // จบ while
        
        scanner.close();
    } // จบ main
    
    
    
    public void setExpression(String exp) {
        this.expression = exp;
    }

    public boolean isValidExpression() {
        String[] parts = expression.split(" ");
        if (parts.length == 3) {
            return isBigInteger(parts[0]) && isOperator(parts[1]) && isBigInteger(parts[2]);
        }
        return false;
    }

    
    public String extractOperand1() {
        return expression.split(" ")[0];
    }

    public String extractOperand2() {
        return expression.split(" ")[2];
    }

    public String extractOperator() {
        return expression.split(" ")[1];
    }

    
    private boolean isBigInteger(String x) {
        if (x.matches("[1-9][0-9]*") || x.equals("0") ) { 
        	// ตัวเลขต้องไม่ขึ้นด้วย 0 มีแต่ 0-9 
        	// no 0123 098 
        	// yes 0 + 2000
            return true;
        }
        return false;
    }

    private boolean isOperator(String op) {
        return op.equals("+") || op.equals("-");
    }
    
}