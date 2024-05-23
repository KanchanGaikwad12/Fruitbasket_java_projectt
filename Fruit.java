package com.app.fruits;

public abstract class Fruit {
	
	private String name;
	private String color;
	private double weight;
	private boolean fresh=true;
	
	public Fruit()
	{
		name="Kashmiri Apple";
		color="Red";
		weight=30.8;
		//fresh=true;
	}
	
	public Fruit(String name,String color,double weight)
	{
		this.name=name;
		this.color=color;
		this.weight=weight;
		//this.fresh=true;
	}
	
	public void setName()
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	
	public void setColor()
	{
		this.color=color;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void setWeight()
	{
		this.weight=weight;
	
	}
	
	public Double getWeight()
	{
		return weight;
	}
	
	public boolean getFresh()
	{
		return fresh;
	}
	
	public void setFresh( boolean fresh)
	{
		this.fresh=fresh;
	}
	
	public String toString()
	{
		return "Name:-"+name+"Color:-"+color+"Weight:-"+weight;
	}
	
	public abstract String taste();
}
