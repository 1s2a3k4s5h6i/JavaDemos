package com.capgimini.SuperKeyword;

public class Vehicle {
	
	int maxSpeed = 120;
	}
	class Car extends Vehicle
	{
	int maxSpeed = 180;
	void display()
	{
	System.out.println("Maximum Speed: " +maxSpeed);
	}
	}
	class S
	{
	public static void main(String[] args)
	{
	Car small = new Car();
	small.display();
	}
	}

