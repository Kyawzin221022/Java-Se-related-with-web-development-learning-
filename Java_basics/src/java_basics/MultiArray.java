package java_basics;

public class MultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declare form
		int [][] marks = new int [3][4];
		
		//Mg Mg's GED Marks
		//for row1
		marks[0][0] = 160;  // Literature
		marks[0][1] = 180;  // Language art 
		marks[0][2] = 200;	// Math
		marks[0][3] = 180;  // Science
		
		//MaSaspai's GED Marks
		
		//for row2
		
		marks[1][0] = 150;  //Literature
		marks[1][1] = 170;  // Language Art
		marks[1][2] = 160;  // Math
		marks[1][3] = 140;  // Science
		
		//Hein Kyaw's GED Marks
		
	
		marks[2][0] = 190;  //Literature
		marks[2][1] = 200;  // Language Art
		marks[2][2] = 170;  // Math
		marks[2][3] = 160;  // Science
		
		// Mg Mg 's marks
		
		System.out.println("MgMg's Marks");
		System.out.println("Literature = " + marks[0][0]);
		System.out.println("Language Art = " + marks[0][1]);
		System.out.println("Math = " + marks[0][2]);
		System.out.println("Science = " + marks[0][3]);
		
		// Ma Sapal 's marks
		System.out.println("Ma Sapal's Marks");
		System.out.println("Literature = " + marks[1][0]);
		System.out.println("Language Art = " + marks[1][1]);
		System.out.println("Math = " + marks[1][2]);
		System.out.println("Science = " + marks[1][3]);
		
		// Hein Kyaw's Marks
		
		System.out.println("Hein Kyaw's Marks");
		System.out.println("Literature = " + marks[2][0]);
		System.out.println("Language Art = " + marks[2][1]);
		System.out.println("Math = " + marks[2][2]);
		System.out.println("Science = " + marks[2][3]);
		
		// initialize form
		int [][] marks1 = {{160,180,200,180},{150,170,160,140},{190,200,170,160}};
		
		//three dimensional array
		
		//int [city][month][item] 	
		
		int [][][] saleRecord ={
			//Yangon
			{
					//April
					{
						200, //phone
						120, //power bank
						60 // laptop
					},
					//August
					{
						120, // phone
						50, // power
						40  // laptop
						
					},
					//December
					{
						300, //phone
						200, //power bank
						100 //laptop
					}
					
			},
			//Mandaly
			{
				//April
				{
					200, //phone
					120, //power bank
					60 // laptop
				},
				//August
				{
					120, // phone
					50, // power
					40  // laptop
					
				},
				//December
				{
					300, //phone
					200, //power bank
					100 //laptop
				}
			
			}
		};
		
		System.out.println("Yangon branch, December , Laptop = " + saleRecord[0][2][2]);
	}

}
