package java_basics;

public class ComparableOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean result1 = 10 < 20 ;
		double x = 12.33;
		double y = 25.0;
		boolean result2 = y > x;
		
		boolean result3 = 23 <= 20;
		boolean result4 = 30 >= 30;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(x == y);
		System.out.println(x != y);
		
		boolean bol1 = true;
		boolean bol2 = true;
		
		boolean result5 = bol1 == bol2;
		boolean result6 = bol1 != bol2;
		System.out.println(result5);
		System.out.println(result6);
			
	}

}
