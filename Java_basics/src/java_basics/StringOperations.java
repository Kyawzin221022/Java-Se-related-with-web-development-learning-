package java_basics;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = " This is just test string";
		
		//Searching
		//contain method check if the string contains given string
		String test = "just";
		boolean result = s1.contains(test);
		System.out.println("This is contain method");
		System.out.println("Result = "+ result);
		
		//startswith method check if the string starts with the given string
		String test1 = "This";
		boolean result1 = s1.startsWith(test1);
		System.out.println("This is startswith method");
		System.out.println("Result = " + result1);
		
		//endswith method check if the string ends with given string
		String test2 = "string";
		boolean result2 = s1.endsWith(test2);
		System.out.println("This is endswith method");
		System.out.println("Result = "  + result2);
		
		//examining charactor
		
		//charAt method give charactor at the given syntax
		char smallU = s1.charAt(10);
		System.out.println("This is charAt method");
		System.out.println("small u = " + smallU);
		
		//indexOf method give the index of the given string in the string
		int jIndex = s1.indexOf('j');
		System.out.println("This is indexOf method");
		System.out.println("jIndex = " + jIndex);
		int testIndex = s1.indexOf("test");
		System.out.println("testIndex = " + testIndex);
		
		// lastIndexof method give the last index of the given string in the string;
		int sLastIndex = s1.lastIndexOf('s');
		System.out.println("This is lastIndexOf method");
		System.out.println("sLastIndex = " + sLastIndex);
		
		//length method give the length of the string
		int s1Length = s1.length(); 
		System.out.println("This is length method");
		System.out.println("s1 have " + s1Length + " charactors");
		
		// isEmpty method give boolean value if the string is empty or not;
		boolean s1Empty = s1.isEmpty();
		System.out.println("This is isEmpty method");
		System.out.println("isEmpty = " + s1Empty);
		
		// substring method give substring from the string staring from the given index
		String s1Sub = s1.substring(18,25);
		System.out.println("This is substring method");
		System.out.println("Substring = " + s1Sub);
		
		//case conversion
		
		//toLowerCase method give string of all lowercase for the given string
		String lowercase = s1.toLowerCase();
		System.out.println("This is toLowerCase method");
		System.out.println("lowerCase = "+ lowercase);
		
		//toUpperCase method give string with all uppercase for the give string
		String uppercase = s1.toUpperCase();
		System.out.println("This is toUpperCase method");
		System.out.println("upperCase" + uppercase);
		
		//replace method replace string with the given string
		String s1Replaced = s1.replace("test","sample");
		System.out.println("This is replace method");
		System.out.println("String after replacement = " + s1Replaced);
		
		//trim method give back the string with no whitespaces at the front and end;
		String spaceString = "      This is space      ";
		String trimed = spaceString.trim();
		System.out.println("This is trim method");
		System.out.println("Trimmed =" + trimed + "More String");
		
	}

}
