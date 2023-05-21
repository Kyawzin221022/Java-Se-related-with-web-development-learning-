package java_basics;

public class ArithmeticsOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// increment /decrement
		//pre
		
		int x = 10,y=20;
		System.out.println("This is pre increment and decrement");
		System.out.println(++x);
		System.out.println(--y);
		
		//post
		
		int a = 10 , b =20;
		System.out.println("This is post increment and decrement");
		System.out.println(a++);
		System.out.println(a);
		System.out.println(b--);
		System.out.println(b);
		
		int c=10;
		int result = c++ + c ; // 11 + 11
		System.out.println("This is c " + result);
		
		
		int result1 = 20 + 40;
		double result2 = 43.55 - 20.34;
		int result3 = 20 * 40;
		int result4 = 10/3;
		double result5 = 10.0/3.0;
		int result6 = 20%7;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
	}

}
