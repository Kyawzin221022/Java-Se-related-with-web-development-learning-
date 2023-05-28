package oop;

public class CarObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println(new Car()); // instantiate - create object;
		// give heap memory of car created;
		
		System.out.println(new Car());
		*/
		
		Car car1 = new Car();
		System.out.println(car1);
		car1.id = 123456;
		car1.brand = "Toyata";
		car1.model = "Hilux 2023";
		car1.color = "white";
		car1.price = 20000.34;
		car1.engineType = "Toyota Engine";
		car1.ev = false;
		
		System.out.println("Car 1 informations");
		System.out.println(car1.id);
		System.out.println(car1.brand);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.price);
		System.out.println(car1.engineType);
		System.out.println(car1.ev);
		
		car1.engineStart();
		car1.drive();
		car1.changeGear();
		car1.breake();
		
		Car car2 = new Car();
		
		car2.id = 100003;
		car2.brand = "Suzuki";
		car2.model = "Suzuki Carry 2023";
		car2.color = "white";
		car2.price = 40000.34;
		car2.engineType = "Suzuki Engine";
		car2.ev = false;
		
		System.out.println("Car 2 informations");
		System.out.println(car2.id);
		System.out.println(car2.brand);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.price);
		System.out.println(car2.engineType);
		System.out.println(car2.ev);
		
		car2.breake();
		car2.engineStart();
		car2.drive();
		
	}

}
