package com.naveenAutomantion;

public class ConstructorDemo
{
	public int a;
	private ConstructorDemo()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		ConstructorDemo a,b,c;
		a=new ConstructorDemo();
		b=new ConstructorDemo();
		c=new ConstructorDemo();
	}
}
