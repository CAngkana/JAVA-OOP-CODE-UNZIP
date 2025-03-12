/*
 * ชัชภรณ์ อังคณารุ่งรัตน์ Chatchaporn Angkanrungrat
 * 6709616418
 */
package question2;
import java.math.BigInteger;

public class SimpleArithmeticExpression {
    private String operand1;
    private String operand2;
    private String operator;

    public String computeExpression() {
        BigInteger num1 = new BigInteger(operand1);
        BigInteger num2 = new BigInteger(operand2);
        BigInteger result;

        if (operator.equals("+")) {
            result = num1.add(num2);
        } else {
            result = num1.subtract(num2);
        }

        return formatResult(result);
    }
    
    public String getExpression() {
        return formatNumber(operand1) + " " + operator + " " + formatNumber(operand2);
    }
    
    // ///////////////////////////////////////////////////////////////
    // ฟังก์ชัน คั่น , เลข 3 หลัก ,000
    private String formatNumber(String number) {
    	long num = Long.parseLong(number);
        return String.format("%,d", num);
    }
    
    private String formatResult(BigInteger number) {
        String formatted = formatNumber(number.toString());
        
        // ลบได้เลขลบใส่วงเล็บ ex. -(3)
        if (number.signum() < 0) {
            return "-(" + formatted.substring(1) + ")";
        }
        return formatted;
    }
    // ///////////////////////////////////////////////////////////////
    
    public String getOperand1() { 
    	return operand1; 
    }
    public String getOperand2() { 
    	return operand2; 
    }
    public String getOperator() { 
    	return operator; 
    }
    
    public void setOperand1(String operand1) { 
    	this.operand1 = operand1; 
    }
    public void setOperand2(String operand2) { 
    	this.operand2 = operand2; 
    }
    public void setOperator(String operator) { 
    	this.operator = operator; 
    }
    
}