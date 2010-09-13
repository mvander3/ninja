package ninja.lesson.calculator;

import java.io.InvalidClassException;

public class Minus extends Expression {
	
	public Minus(Expression leftSide, Expression rightSide) {
		super(leftSide, rightSide);
	}
	
	public Double execute() throws InvalidClassException {
		return getLeftSide().execute() - getRightSide().execute();
	}

}
