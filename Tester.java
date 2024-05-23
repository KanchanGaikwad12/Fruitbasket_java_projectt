package com.app.fruits;

import java.util.Scanner;

public class Tester {
	
	 
	//Scanner sc=new Scanner(System.in);
	
	
	
	
	
	/*public static void accept()
	{
		Scanner sc=new Scanner(System.in);
	
		System.out.println("\n Enter name:-");
		name=sc.nextLine();
		System.out.println("\n Enter color:-");
		color=sc.nextLine();
		System.out.println("\n Enter weight:-");
		weight=sc.nextDouble();
		System.out.println("\n Fruit is fresh or not");
		fresh=sc.nextBoolean();
	}	*/
		
	
	public static void main(String args[])
	{
		String name,color;
		 double weight;
		 boolean fresh;
		 int index=0;
		 int k=0;
		
	
		int size,choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter size:-");
		size=sc.nextInt();
		
		Fruit[] f1=new Fruit[size];
		do
		{
			System.out.println("1. Add Apple");
			System.out.println("2. Add Mango");
			System.out.println("3. Add Orange");
			System.out.println("4. Display name of all fruits");
			System.out.println("5. Display name,color,weight , taste of all fresh fruits in the basket");
			System.out.println("6. Mark a fruit in a basket , as stale(=not fresh");
			System.out.println("7. Mark all sour fruits stale");
			System.out.println("8. Display fruit names which is not fresh");
			System.out.println("9.Invoke fruit specific functionality (pulp / juice / jam) ");
			System.out.println("\n Enter Choice:-");
			choice=sc.nextInt();
				
		switch(choice)
		{
		case 1:
			//2. Display names of all fruits in the basket.
				if( index<size)
				{
						System.out.println("For Apple Add name,color,weight and fresh ");
						//weight=sc.nextDouble();
						
						name=sc.next();
						color=sc.next();
						weight=sc.nextDouble();
						
						
						Fruit a=new Apple(name,color,weight);
					
						f1[index]=a;
						index++;
						System.out.println("Apple added in basket");
				}
				break;
		case 2:
				if(index<size)
				{
					
					System.out.println("For Mango Add name,color,weight ");	
					name=sc.next();
					color=sc.next();
					weight=sc.nextDouble();
					
					Fruit m=new Mango(name,color,weight);
					f1[index]=m;
					index++;
					System.out.println("Mango is added in basket");
				}
				break;
		case 3:
				if(index<size)
				{
					System.out.println("For Orange Add name,color,weight ");
					name=sc.next();
					color=sc.next();
					weight=sc.nextDouble();
					
					Fruit o=new Orange(name,color,weight);
					f1[index]=o;
					index++;
					System.out.println("Mango is added in the basket");
				}
				break;
				
		case 4:
				for(int i=0;i<index;i++)
				{
					
					System.out.println("Name of all fruits are:-"+f1[i].getName());
					
				}
				break;
		case 5:
				for(int i=0;i<index;i++)
				{
					// Display name,color,weight , taste of all fresh fruits in the basket");
					System.out.println("Name, color and taste of all fruits"+f1[i].getName()+f1[i].getColor()+f1[i].taste());
				}
				break;
		case 6:
				//Mark a fruit in a basket , as stale(=not fresh)
				  System.out.println("Enter the fruit which is not fresh");
				  int findex=sc.nextInt();
				  for(int i=0;i<=findex;i++)
				  {
					  if(findex>i)
					  {
						  System.out.println("Enter valid index");
						  
					  }
					  else
					  {
						  f1[findex].setFresh(false);
						  
					  }
				  }
	              
	             //System.out.println("This fruit not fresh");
	              break;
	              
		case 7 :
			 //Mark all sour fruits stale
			//Hint : Use equals() method of the String class.

			   // System.out.println("Enter the fruit which are sour and stale");
			    for(int i=0;i<index;i++)
			    {
			         if(f1[i].taste().equalsIgnoreCase("Sour"));
			         {
			        	 f1[i].setFresh(false);
			         }
			    }
			    break;

		case 8:
				for(int i=0;i<index;i++)
				{
					if(f1[i].getFresh()==false)
					{
						System.out.println("Fruit is not fresh:-"+f1[i].getName());
					}
				}
				break;
		
			
		case 9:
				for(int i=0;i<index;i++)
				{
					f1[i].toString();
					f1[i].taste();
					if(f1[i] instanceof Apple)
					{
						Apple a1=(Apple)f1[i];
						a1.jam();
					}
					if(f1[i] instanceof Mango)
					{
						Mango m1=(Mango)f1[i];
						m1.pulp();
					}
					if(f1[i] instanceof Orange)
					{
						Orange o1=(Orange)f1[i];
						o1.juice();
					}
				}
				break;
			 
		default :
			System.out.println("Enter a valid choice:-");
			break;
			
			
		}
		
		
		
		
					
			
		}while(choice!=10);

	}
}
	