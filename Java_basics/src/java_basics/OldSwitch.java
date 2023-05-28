package java_basics;
import  java.util.Scanner;

public class OldSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Your Favourite Number : 1 to 7");
		int day = userInput.nextInt();
		/*
		 
		 // worst case scnario 
		switch(day)
		{
			
		case 1 : 
			System.out.println("Sad Monday");
			System.out.println("It's raining");
			break; // branching statement to terminate block
			
		case 2 : 
			System.out.println("Normal Tuesday");
			System.out.println("It's sunny");
			break;
		
		case 3 :
			System.out.println("Active Wednesday");
			System.out.println("It's a good day");
			break;
		
		case 4 :
			System.out.println("Good Thursday");
			System.out.println("What a nice weather");
			break;
		
		case 5 :
			System.out.println("Happy Friday");
			System.out.println("Happy Happy");
			break;
		
		case 6 :
			System.out.println("Drinking Saturday");
			System.out.println("It's a dizzy day");
			break;
		
		case 7 :
			System.out.println("Sleeping Sunday");
			System.out.println("Wow Wow Wow");
			break;
		
		default : 
			System.out.println("Invalid Data");
			System.out.println("I don't know your date");
			break;
		
		}
		*/
		
		//case grouping 
		
		switch(day)
		{
		case 1 : case 2: case 3 : case 4 : case 5 : 
			System.out.println("Sad Weekdays");
			break;
		
		case 6 : case 7 :
			System.out.println("Happy Weekends");
			break;
			
		default : 
			System.out.println("Invalid data");
			break;
		}
		
		System.out.println("Out of Switch");
		
		
		// switch case statement 
	}

}
