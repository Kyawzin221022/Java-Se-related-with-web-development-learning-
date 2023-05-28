package java_basics;

import java.util.Scanner;

public class NewSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your first Operand ");
		double firstOperand = userInput.nextDouble();
		
		System.out.println("Enter your second Operand ");
		double secondOperand = userInput.nextDouble();
		
		System.out.println("Enter your Operator : + - * / % ");
		char operator = userInput.next().charAt(0);
		
		// switch labled expression
		double result = switch (operator) {
		case '+' -> {
			double total =	firstOperand + secondOperand;
			yield total;
		}
		
		case '-' -> firstOperand - secondOperand ;
		
		case '*' -> firstOperand * secondOperand ;
		
		case '/' -> firstOperand / secondOperand ;
		
		case '%' -> firstOperand % secondOperand ;
		
		default -> 0.0;
		} ;	
		System.out.println("This is switch labelled expression");
		System.out.printf("Result is %.1f\n", result);
		
		// switch case expression
		double result1 = switch (operator) {
		case '+': {
			
			yield (firstOperand + secondOperand);
		}
		case '-': {
		
			yield (firstOperand - secondOperand);
		}
		case '*': {
			
			yield (firstOperand * secondOperand);
		}
		case '/': {
			
			yield (firstOperand / secondOperand);
		}
		default : {
			yield (0.0);
		}
		};
		System.out.println("This is switch case expression");
		System.out.printf("%.1f\n", result1);
		
		// case grouping in new switch
		
		System.out.println("Enter Your Favourite Number : 0 to 9 ");
		int number = userInput.nextInt();
		
		int result2 = switch (number) {
		case 0,3,5,8 -> 30;
		
		case 1,2,6 -> 60;
		
		case 4,9 -> 80;
		
		case 7 -> 100;
		
		default -> 0;
		};
		userInput.close();
		System.out.printf("Lucky peercent = %d\n", result2);
	}

}
