package java_basics;
import java.util.Scanner;


public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;
		if ( x > 10)
		{
			System.out.println("x is greater than 10");
			System.out.println("I like x to be  greater than 10");
		}
		else
		{
			System.out.println("x is lesser than 10");
		}
		
		int age = 20;
		boolean nrc = false;
		// if with nested if
	/*	if (nrc == true)
		{

			if(age >= 18) 
			{
				System.out.println("You van vote");
			}
			else
			{
				System.out.println("You cannot vote");
			}
		}
		else System.out.println("You cannot vote");*/
		
		
		// Logical operators 
		
		if( nrc && age >=18)
		{
			System.out.println("You can vote");
		}
		else
		{
			System.out.println("You cannot vote");
		}
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter Your Favorite Number : 1  to 7");
		int day = userInput.nextInt();
		// switch case
		/*switch (day)
		{
		case 1 : 
			System.out.println("It's Monday");
			break;
		case 2 :
			System.out.println("It's Tuesday");
			break;
		case 3 : 
			System.out.println("It's Wednesday");
			break;
		case 4 : 
			System.out.println("It's Thursday");
			break;
		case 5 : 
			System.out.println("It's Friday");
			break;
		case 6 : 
			System.out.println("It's Saturday");
			break;
		case 7 : 
			System.out.println("It's Sunday");
			break;
			
		default :
			System.out.println("Invalid Data");
		}*/
		// worst case scenario 
		if (day == 1) {
			System.out.println("Sad Monday");
			System.out.println("Meeting and working");
		}else if(day ==2 ) {
			System.out.println("Active Tuesday");
			System.out.println("Meeting and working");
		}else if(day ==3 ) {
			System.out.println("Boring Wednesday");
			System.out.println("Meeting and working");
		}else if(day ==4 ) {
			System.out.println("Happy Thursday");
			System.out.println("Meeting and working ");
		}else if(day ==5 ) {
			System.out.println("Happy Friday");
			System.out.println("Meeting ");
		}else if(day ==6 ) {
			System.out.println("Drinking Saturaday");
			System.out.println("Drinking");
		}else if(day ==7 ) {
			System.out.println("Good Sunday");
			System.out.println("Visitng places");
		}else {
			System.out.println("Invalid Data");
		}
		
		
	
	}
	

}
