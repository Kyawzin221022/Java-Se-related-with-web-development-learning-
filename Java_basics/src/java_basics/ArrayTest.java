package java_basics;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] numberArray = new int[5];  // declare 
		numberArray[0] = 10;
		numberArray[1] = 20;
		numberArray[2] = 30;
		numberArray[3] = 40;
		numberArray[4] = 50;
		
		// give the reference/address of the array not the value
		System.out.println(numberArray);
		
		System.out.println("Index 0 = " + numberArray[0]);
		System.out.println("Index 1 = " + numberArray[1]);
		System.out.println("Index 2 = " + numberArray[2]);
		System.out.println("Index 3 = " + numberArray[3]);
		System.out.println("Index 4 = " + numberArray[4]);
	
		
		//initialize array object
		
		int [] numberArray1 =  {10,20,30,40,50};
		
		// string object initialize
		
		String [] fruitArray = {"Mango","Banana","Papaya","Kiwi"};
		
		System.out.println("This is string array object");
		System.out.println(fruitArray[0]);
	}

}
