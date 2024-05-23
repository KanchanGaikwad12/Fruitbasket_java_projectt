package com.app.fruits;

public class Orange extends Fruit {
	
	public Orange(String name, String color,double weight)
	{
		super(name,color,weight);
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	public String taste()
	{
		return "\n Sour";
	}
	
	public void juice()
	{
		System.out.println("\nName:-"+super.getName()+"\nWeight:-"+super.getWeight()+"Need a 50 oranges");
	}

}
