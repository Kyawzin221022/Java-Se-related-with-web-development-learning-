package oop;

public class Car {

	static int noOfWheels = 4;
	
	
	long id;
	String brand;
	String model;
	String color;
	double price;
	int speedHour;
	String engineType;
	boolean ev;
	
	void engineStart()
	{
		System.out.println(id + " Engine is starting");
	}
	void drive()
	{
		System.out.println(id +" Car is driving");
	}
	void changeGear()
	{
		System.out.println(id +" Gear is changed");
	}
	void breake()
	{
		System.out.println(id + " Car is breaked");
	}
	
}
