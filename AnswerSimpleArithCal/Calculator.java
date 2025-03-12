package question1;
import java.util.Scanner;

public class Calculator {
	private String expression;

	public void setExpression(String expression) {
		this.expression = expression ;
	}
	
	public String getExpression() {
		return expression ;
	}
	
	private boolean isBigInteger(String x) {
		boolean isValid = false ;
		if (x == null || x.length() == 0) {
			isValid = false ;
		}else if(x.charAt(0) == '0') {
				isValid = false ;
		}else {
			isValid = switch (x.charAt(0)) {
				case '1','2','3','4','5','6','7','8','9' -> true ;
				default -> false;
			};
			for(int i=1 ; i <= x.length()-1 && isValid ; i++) {
				isValid = switch (x.charAt(i)) {
					case '0','1','2','3','4','5','6','7','8','9' -> true ;
					default -> false;
				} ;
			}
		}
		return isValid ;
	}

	private boolean isOperator(String op) {
		return switch (op) {
					case "+", "-" -> true;
					default -> false;
			   };
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner scanner = new Scanner(System.in);
		calculator.printHeader();
		boolean isContinued = true;

		while (isContinued) {
			String expression = calculator.inputExpression(scanner);

			if (expression.equalsIgnoreCase("q") || expression.equalsIgnoreCase("quit")) {
				isContinued = false;
				calculator.printFooter();
				break;
			} else {
				boolean isValidExpression = calculator.isValidExpression(expression);
				if (!isValidExpression) {
					calculator.printInvalidMessage();
					continue;
				} else {
					String operand1 = calculator.extractOperand1(expression);
					String operand2 = calculator.extractOperand2(expression);
					String operator = calculator.extractOperator(expression);

					SimpleArithmeticExpression expr = new SimpleArithmeticExpression();
					expr.setOperand1(operand1);
					expr.setOperator(operator);
					expr.setOperand2(operand2);

					System.out.println("You entered: " + expr.getExpression());

					System.out.println("Result: " + expr.computeExpression());
				}

			}
		}

		scanner.close();

	}

	private String inputExpression(Scanner scanner) {
		System.out.println("------------------------------------------");
		System.out.print("Input: ");
		String expression = scanner.nextLine();
		expression = expression.trim();
		return expression;
	}

	private void printHeader() {
		System.out.println("==========================================");
		System.out.println("          Simple Arithmetic Calculator");
		System.out.println("==========================================");
		System.out.println();
		System.out.println("Enter two positive numbers and an operator");
		System.out.println("(Supports only addition and subtraction)");
		System.out.println();
		System.out.println("Format: <number1> <operator> <number2>");
		System.out.println("Example: 10 + 20");
		System.out.println("         30 - 15");
		System.out.println();
		System.out.println("Type \"q\" or \"quit\" to exit.");
	}

	private void printFooter() {
		System.out.println("==========================================");
		System.out.println("Thank you for using");
		System.out.println("Simple Arithmetic Calculator");
		System.out.println("==========================================");
	}
	
	private void printInvalidMessage() {
		System.out.println("Invalid expression format.");
		System.out.println("Correct format: <number1> <operator> <number2>");
		System.out.println("Supported operators: +, -");
	}

	public String extractOperand1(String expr) {
		String[] parts = expr.split("[-+]");
		if (parts.length >= 1) {
			return parts[0].trim();
		}
		return null;
	}

	public String extractOperand2(String expr) {
		String[] parts = expr.split("[-+]");
		if (parts.length >= 2) {
			return parts[1].trim();
		}
		return null;
	}

	public String extractOperator(String expr) {
		if (expr.contains("+")) {
			return "+";
		} else if (expr.contains("-")) {
			return "-";
		} else {
			return null;
		}
	}

	public boolean isValidExpression(String expr) {

		if (expr == null || expr.isEmpty()) {
			return false;
		}

		String[] parts = expr.split("[-+]");
		if (parts.length != 2) {
			return false;
		}

		String operand1 = extractOperand1(expr);
		String operand2 = extractOperand2(expr);
		String operator = extractOperator(expr);

		return isBigInteger(operand1) && isBigInteger(operand2) && isOperator(operator);
	}
}