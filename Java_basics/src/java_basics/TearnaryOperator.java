package java_basics;
import java.util.Scanner;

public class TearnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Explanaition of TearnaryOperator
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Your Number : ");
		int number = userInput.nextInt();
		userInput.close();
		
		String message = ( number % 2 == 0 ) ? "Even Number" : "Odd Number";
	
		System.out.println(message);
		
		
		// nested teranary operator
		String message1 = ( number >= 10 ) ? ((number ==10) ? " Equal to 10" : " Greater than 10") : " Less than 10 " ;
		System.out.println(message1);
	}

}
