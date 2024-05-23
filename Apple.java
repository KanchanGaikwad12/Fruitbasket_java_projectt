package com.app.fruits;

public class Apple extends Fruit{
	
	
	
	public Apple(String name,String color,double weight)
	{
		super(name,color,weight);

	}
	
	
	public String toString()
	{
		return super.toString();
	}
	
	public String taste()
	{
		return "\n Sweet and Sour";
	}
	
	public void jam()
	{
		System.out.println("\n Name:-"+super.getName()+"We need 50 Apples for making Jam");
	}

}
