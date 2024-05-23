package com.app.fruits;

public class Mango extends Fruit {
	
	
	
	
	public Mango(String name, String color,double weight)
	{
		super(name,color,weight);
		
		
	}
	
	public String toString()
	{
		return super.toString();
		
	}
	
	public String taste()
	{
		return "\n Sweet";
	}
	
	public void pulp()
	{
		System.out.println("Name:-"+super.getName()+"Color:-"+super.getColor()+"Need a mangoes");
	}
	
	
	
	

}
