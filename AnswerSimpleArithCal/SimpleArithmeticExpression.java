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
		// �ӹǹ��ѡ�ͧ operand1 > �ӹǹ��ѡ�ͧ operand2 ���� �ӹǹ��ѡ��ҡѹ�� digit
		// �ҧ���¢ͧ operand1 �ҡ���� ���ӹǳ operand1-operand2
		if (operand1.length() > operand2.length()) {
			result = computeSubtraction(operand1, operand2);
		} else if (operand1.length() == operand2.length() && operand1.charAt(0) > operand2.charAt(0)) {
			result = computeSubtraction(operand1, operand2);
		} else if (operand2.length() > operand1.length()) {
			result = "-(" + computeSubtraction(operand2, operand1) + ")";
		} else if (operand2.length() == operand1.length() && operand2.charAt(0) > operand1.charAt(0)) {
			result = "-(" + computeSubtraction(operand2, operand1) + ")";
		} else { // �ó� digit �����ش��ҡѹ ���ӡ�õѴ digit �����ش�ͧ opeand1 ��� operand2
					// ���Ǥ��¹���ź
			result = subtract(operand1.substring(1), operand2.substring(1));
		}
		return result;
	}

	private String computeSubtraction(String operand1, String operand2) {
		// �繡óշ�� operand1 �ҡ���� operand2 ��͹ ��ͨӹǹ digit �ҡ���� ����
		// �����ѡ�����ش�ҡ����
		String result = "";
		// �ӹǳ�ӹǹ��ѡ����ͧǹ�ٻ���ͺǡ ź �Ţ������ѡ�ҡ����ش�
		int minIndex = (operand1.length() <= operand2.length()) ? operand1.length() : operand2.length();
		// k �������Ѻ�Ѻ�ء 3 digits ������ ,
		boolean lessDigit = false; // ���º������ѡ �ҡ��Ңͧ operand1 ���¡��� ��Ңͧ operand2
									// �ա������ҡ��ѡ�������ҧ���� ��� lessDigit = true
		for (int i = operand1.length() - 1, j = operand2.length() - 1, k = 1; i >= 0; i--, j--, k++) {
			int x1 = Character.getNumericValue(operand1.charAt(i));
			// �ú�ӹǹ��ѡ����ͧ�ӹǳ minIndex �����������ź�Ţ�Ѻ��� 0
			int x2 = (j>=0) ? Character.getNumericValue(operand2.charAt(j)) : 0;
			// ����ա��������� �ҡ��äӹǳ digit ��ѡ��͹˹�ҷҧ���
			int x ;
			if (lessDigit == true) {
				if (x1 > x2) { //�����������Ҩҡ��äӹǳ��͹˹�� x1 > x2 �֧������ͧ�����ѡ����
					x = x1 - x2 - 1;
					lessDigit = false ;
				} else { //�����������Ҩҡ��äӹǳ��͹˹�� x1 <= x2 �е�ͧ�����ѡ����
					x = x1 + 10 - x2 - 1;
					lessDigit = true ;
				}
			}else {
				if (x1 >= x2) { //�������ա��������Ҩҡ��äӹǳ��͹˹�� x1 >= x2 �֧������ͧ�����ѡ����
					x = x1 - x2 ;
					lessDigit = false ;
				} else {//�������ա��������Ҩҡ��äӹǳ��͹˹�� x1 < x2  �е�ͧ�����ѡ����
					x = x1 + 10 - x2 ;
					lessDigit = true ;
				}
			}
			// ��͹�Ӥ�� x 仵��˹�� result ���Ԩ�ó���Ҥú 3 digits ���
			// �������ѡ�ش���«����ش ��Ҥú������ ,
			if (k % 3 == 0 && i != 0) {
				result = "," + x + result;
			}else {
				result = x + result ;
			}
		}
		// ��͹�׹���Ѿ�� �ó� digit �����ش�� 0 ��� �Ѵ 0 �����ش�͡
		return result.charAt(0) == '0' ? result.substring(1) : result;
	}

	private String add(String operand12, String operand22) {
		// TODO Auto-generated method stub
		return null;
	}
}