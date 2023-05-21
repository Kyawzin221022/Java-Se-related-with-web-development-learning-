package java_basics;

public class ImplicitCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// precision loss
		
		int a = Integer.MAX_VALUE;
		float floatVal = a;
		double doubleVal = a;
		System.out.println("This is precision Loss");
		System.out.println(a);
		System.out.println(floatVal);
		System.out.println(doubleVal);
		
		
		// character to integer
		char bigG = 'G';
		int intVal = bigG;
		System.out.println("This is character to integer conversion");
		System.out.println(bigG);
		System.out.println(intVal);
		
		
		
		
		// integer to long
		
		int x = 1000;
		long y = x; // compiler auto no data loss
		System.out.println("This is integer to long conversion");
		System.out.println(x);
		System.out.println(y);
		
		
		// long to float and double
		long longMax = Long.MAX_VALUE;
		float floatVal1 = longMax;
		double doubleVal1 = longMax;
		System.out.println("This is long to float conversion");
		System.out.println(longMax);
		System.out.println(floatVal1);
		System.out.println(doubleVal1);
		
		
	}

}
