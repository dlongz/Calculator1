package calculator;

public class Calculator {
	private double operandOne;
	private double operandTwo;
	private String operator;
	
	public Calculator() {
		this.operandOne = 0;
		this.operandTwo = 0;
		this.operator = "+";
	}
	
//	Setters
	public void setOperandOne(double num) {
		operandOne = num;
	}
	
	public void setOperandTwo(double num) {
		operandTwo = num;
	}
	
	public void setOperator(String opp) {
		operator = opp;
	}
	
//	Getters
	public double getOperandOne() {
		return operandOne;
	}
	
	public double getOperandTwo() {
		return operandTwo;
	}
	
	public String getOperator() {
		return operator;
	}
	
//	Methods
	public void performOperation() {
		System.out.printf("Performing Operation: %,.2f %s %,.2f%n", this.getOperandOne(), this.getOperator(), this.getOperandTwo());
	}
	
	public double getResults() {
		double result = 0;
		if (this.getOperator() == "+") {
			result = this.getOperandOne() + this.getOperandTwo();
		} else if (this.getOperator() == "-") {
			result = this.getOperandOne() - this.getOperandTwo();
		}	
		return result;
	}
}
