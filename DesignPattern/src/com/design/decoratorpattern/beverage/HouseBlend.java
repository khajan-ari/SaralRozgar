package com.design.decoratorpattern.beverage;

public class HouseBlend extends Beverage{

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		
		return "HouseBlend";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 250;
		
	}

}
