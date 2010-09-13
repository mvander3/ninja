package ninja.lesson.calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the Ninja Caclulator Command Line Interface");
		Scanner in;
		
		while(true) {
			System.out.println("Please enter an operation:");
	
			in = new Scanner(System.in);
			String command = in.nextLine();
			if(command.equals("quit")) {
				break;
			}
			
			try {
				Expression expression = Parser.parse(command);
				String output = "= " + expression.execute();
				System.out.println(output);
			} catch (Exception e) {
				System.out.println("You entered an invalid expression");
			}
		}
		
		System.out.println("Thank you for using the Ninja Calculator.\nGoodbye");
		in.close();            

	}

}
