package com.design.decoratorpattern.beverage;

public class Espresso extends Beverage {
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Espresso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 10;
	}

}
