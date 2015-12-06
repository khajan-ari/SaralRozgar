package com.design.decoratorpattern.main;


import com.design.decoratorpattern.beverage.Beverage;
import com.design.decoratorpattern.beverage.HouseBlend;
import com.design.decoratorpattern.conditment.Mocha;

public class BeverageOrderMain {
	
	public static void main(String args[])
	{
		
		Beverage beverage = new HouseBlend(); 
		Beverage beverage1= new Mocha(beverage);
		Beverage beverage2= new Mocha(beverage1);
		System.out.println(beverage2.getDescription());
		System.out.println("Total cost of item"+beverage2.cost());
	}

}
