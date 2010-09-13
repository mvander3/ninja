package ninja.lesson.calculator;

import java.io.InvalidClassException;

public class Value extends Expression {
	
	private Double value;
	
	public Value(String value) {
		this.value = Double.valueOf(value);
	}
	 
	public Double execute() throws InvalidClassException {
		return this.value;
	}

}
