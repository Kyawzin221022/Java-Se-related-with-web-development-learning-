package java_basics;

public class ExplictiCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// out of range
		
		int intVal = 1000;
		byte byteVal = (byte)intVal;
		System.out.println("This integer to byte conversion");
		System.out.println(intVal);
		System.out.println(byteVal);
		System.out.println("Out of Range");
		
		// truncation case
		
		double doubleVal = 23.4567;
		int intVal1 = (int)doubleVal;
		System.out.println("This is Truncation Case");
		System.out.println(doubleVal);
		System.out.println(intVal1);
		
		//Special Case
		// byte to int to char .
		
		
		byte byteVal1 = 120 ;
		char charVal1 = (char)byteVal1;
		System.out.println("This is Special Case");
		System.out.println(byteVal1);
		System.out.println(charVal1);
		
		
		
	}

}
