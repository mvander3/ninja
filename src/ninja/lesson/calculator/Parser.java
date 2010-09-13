package ninja.lesson.calculator;

public class Parser {

	public static Expression parse(String text) {
		
		int index;
		text = text.trim();
		
		for(Operator operator : Operator.values()) {
			if((index = text.indexOf(operator.getCharacter())) != -1) {
				
				Expression leftSide = Parser.parse(text.substring(0, index));
				Expression rightSide = Parser.parse(text.substring(index + 1));
				
				return Parser.expressionFactoryMethod(operator, leftSide, rightSide);
			}
		}
		
		return new Value(text);
	}
	
	private static Expression expressionFactoryMethod(Operator operator, Expression leftSide, Expression rightSide) {
		if(operator == Operator.MULTIPLY) {
			return new Multiply(leftSide, rightSide);
		} else if(operator == Operator.DIVIDE) {
			return new Divide(leftSide, rightSide);
		} else if(operator == Operator.PLUS) {
			return new Plus(leftSide, rightSide);
		} else if(operator == Operator.MINUS) {
			return new Minus(leftSide, rightSide);
		}
		
		throw new UnsupportedOperationException("Operator " + operator.getCharacter() + " has not been integrated into the factory method." );
	}
	
	private enum Operator {
		PLUS('+'), 
		MINUS('-'),
		
		MULTIPLY('*'),
		DIVIDE('/');
		
		private Character character;
		
		private Operator(Character operatorChar) {
			this.character = operatorChar;
		}
		
		public Character getCharacter() {
			return character;
		}
	}
	
}
