package com.capgimini.Instancejavaoperator;


	class Parent { }
	class Child extends Parent { }
	class S
	{
	public static void main(String[] args)
	{
	Child cobj = new Child();
	// A simple case
	if (cobj instanceof Child)
	System.out.println("cobj is instance of Child");
	else
	System.out.println("cobj is NOT instance of Child");
	// instanceof returns true for Parent class also
	if (cobj instanceof Parent)
	System.out.println("cobj is instance of Parent");
	else
	System.out.println("cobj is NOT instance of Parent");
	}
	}

