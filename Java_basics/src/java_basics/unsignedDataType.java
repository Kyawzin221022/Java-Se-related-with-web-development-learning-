package java_basics;

public class unsignedDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// unsigned datatype
		
		char charVal = 'A';
		char charOp = (char) (charVal -1);
		
		System.out.println("This is charVal " + charVal);
		System.out.println("This is character testing with operator and converting integer to char " + charOp);
		
		// Special Case for char
		
		byte byteVal = 100;
		char charVal1 =(char)(byteVal);
		System.out.println("This is Special Case for character ");
		System.out.println("This is byte Value " + byteVal);
		System.out.printf("This is character Value " + charVal1);
		
		
		
		
	}

}
