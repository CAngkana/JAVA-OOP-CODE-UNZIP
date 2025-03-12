package question1;

public class SimpleArithmeticExpression {
	private String operand1;
	private String operand2;
	private String operator;

	// Getter Method

	public String getOperand1() {
		return operand1;
	}

	public String getOperand2() {
		return operand2;
	}

	public String getOperator() {
		return operator;
	}

	public String getExpression() {
		return (operand1 + " " + operator + " " + operand2);
	}

	// Setter Method

	public void setOperand1(String operand1) {
		this.operand1 = operand1;
	}

	public void setOperand2(String operand2) {
		this.operand2 = operand2;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	// Compute Expression

	public String computeExpression() {
		{
			String result = null;
			if (operator.equals("+")) {
				result = add(operand1, operand2);
			} else if (operator.equals("-")) {
				result = subtract(operand1, operand2);
			}
			return result;
		}
	}

	private String subtract(String operand1, String operand2) {
		String result = null;
		// จำนวนหลักของ operand1 > จำนวนหลักของ operand2 หรือ จำนวนหลักเท่ากันแต่ digit
		// ทางซ้ายของ operand1 มากกว่า ให้คำนวณ operand1-operand2
		if (operand1.length() > operand2.length()) {
			result = computeSubtraction(operand1, operand2);
		} else if (operand1.length() == operand2.length() && operand1.charAt(0) > operand2.charAt(0)) {
			result = computeSubtraction(operand1, operand2);
		} else if (operand2.length() > operand1.length()) {
			result = "-(" + computeSubtraction(operand2, operand1) + ")";
		} else if (operand2.length() == operand1.length() && operand2.charAt(0) > operand1.charAt(0)) {
			result = "-(" + computeSubtraction(operand2, operand1) + ")";
		} else { // กรณี digit ซ้ายสุดเท่ากัน ให้ทำการตัด digit ซ้ายสุดของ opeand1 และ operand2
					// แล้วค่อยนำมาลบ
			result = subtract(operand1.substring(1), operand2.substring(1));
		}
		return result;
	}

	private String computeSubtraction(String operand1, String operand2) {
		// เป็นกรณีที่ operand1 มากกว่า operand2 แน่นอน คือจำนวน digit มากกว่า หรือ
		// ค่าหลักซ้ายสุดมากกว่า
		String result = "";
		// คำนวณจำนวนหลักที่ต้องวนลูปเพื่อบวก ลบ เลขทีละหลักจากขวาสุดไป
		int minIndex = (operand1.length() <= operand2.length()) ? operand1.length() : operand2.length();
		// k ไว้สำหรับนับทุก 3 digits ให้ใส่ ,
		boolean lessDigit = false; // เปรียบทีละหลัก หากค่าของ operand1 น้อยกว่า ค่าของ operand2
									// มีการยืมจากหลักที่อยู่ทางซ้าย ให้ lessDigit = true
		for (int i = operand1.length() - 1, j = operand2.length() - 1, k = 1; i >= 0; i--, j--, k++) {
			int x1 = Character.getNumericValue(operand1.charAt(i));
			// ครบจำนวนหลักที่ต้องคำนวณ minIndex ที่เหลือให้ลบเลขกับค่า 0
			int x2 = (j>=0) ? Character.getNumericValue(operand2.charAt(j)) : 0;
			// ถ้ามีการยืมทดมา จากการคำนวณ digit หลักก่อนหน้าทางขวา
			int x ;
			if (lessDigit == true) {
				if (x1 > x2) { //ถ้ามียืมทดมาจากการคำนวณก่อนหน้า x1 > x2 จึงจะไม่ต้องยืมหลักต่อไป
					x = x1 - x2 - 1;
					lessDigit = false ;
				} else { //ถ้ามียืมทดมาจากการคำนวณก่อนหน้า x1 <= x2 จะต้องยืมหลักต่อไป
					x = x1 + 10 - x2 - 1;
					lessDigit = true ;
				}
			}else {
				if (x1 >= x2) { //ถ้าไม่มีการยืมทดมาจากการคำนวณก่อนหน้า x1 >= x2 จึงจะไม่ต้องยืมหลักต่อไป
					x = x1 - x2 ;
					lessDigit = false ;
				} else {//ถ้าไม่มีการยืมทดมาจากการคำนวณก่อนหน้า x1 < x2  จะต้องยืมหลักต่อไป
					x = x1 + 10 - x2 ;
					lessDigit = true ;
				}
			}
			// ก่อนนำค่า x ไปต่อหน้า result ให้พิจารณาว่าครบ 3 digits และ
			// ไม่ใช่หลักสุดท้ายซ้ายสุด ถ้าครบให้ใส่ ,
			if (k % 3 == 0 && i != 0) {
				result = "," + x + result;
			}else {
				result = x + result ;
			}
		}
		// ก่อนคืนผลลัพธ์ กรณี digit ซ้ายสุดเป็น 0 ให้ ตัด 0 ซ้ายสุดออก
		return result.charAt(0) == '0' ? result.substring(1) : result;
	}

	private String add(String operand12, String operand22) {
		// TODO Auto-generated method stub
		return null;
	}
}