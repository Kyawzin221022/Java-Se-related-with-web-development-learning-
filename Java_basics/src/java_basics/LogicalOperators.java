package java_basics;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 20 ;
		int y = 30;
		int z = 40;
		 
		boolean result1 = y > x && z < y;
		boolean result2 = x > y || z <y;
		boolean result3 = !(x > y);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		//short circuit
		
		boolean result4 = ++x < y && ++y < z && x < ++z;
		System.out.println(result4);
		
		boolean result5 = ++x > y || ++y > z || x < ++z;
		System.out.println(result5);
	}

}
