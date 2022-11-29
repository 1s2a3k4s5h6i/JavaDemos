package com.capgimini.FinalMethod;

public class Super {
	
	
	void m1()
	{
	System.out.println("Super m1");
	}
	final void m2()
	{
	System.out.println("Super m2");
	}
	}

	public class S extends Super
	{
	void m1() // void m2() – cannot be called
	{
	System.out.println("S m1");
	}

	public static void main(String[] args)
	{
	S obj = new S();
	obj.m1();
	obj.m2();
	}
	}

