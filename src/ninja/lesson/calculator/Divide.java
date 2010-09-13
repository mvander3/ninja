package ninja.lesson.calculator;

import java.io.InvalidClassException;

public class Divide extends Expression {
	
	public Divide(Expression leftSide, Expression rightSide) {
		super(leftSide, rightSide);
	}
	
	public Double execute() throws InvalidClassException {
		return getLeftSide().execute() / getRightSide().execute();
	}

}
