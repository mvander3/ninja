package ninja.lesson.calculator;

import java.io.InvalidClassException;

public class Expression {
	
	private String rawText;
	
	private Expression leftSide;
	private Expression rightSide;
	
	public Expression() {
		
	}
	
	public Expression(String text) {
		this.rawText = text;
	}
	
	public Expression(Expression leftSide, Expression rightSide) {
		setLeftSide(leftSide);
		setRightSide(rightSide);
	}
	
	public void setLeftSide(Expression leftSide) {
		this.leftSide = leftSide;
	}
	
	public void setRightSide(Expression rightSide) {
		this.rightSide = rightSide;
	}
	
	public Expression getLeftSide() {
		return this.leftSide;
	}
	
	public Expression getRightSide() {
		return this.rightSide;
	}
	
	public Double execute() throws InvalidClassException {
		throw new InvalidClassException("This method must be override by a subclass, and should never be invoked");
	}

}
