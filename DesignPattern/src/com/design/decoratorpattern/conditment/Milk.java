package com.design.decoratorpattern.conditment;

import com.design.decoratorpattern.beverage.Beverage;

public class Milk extends CondimentDecorator {

	Beverage beverage;
	
	public Milk(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+23;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Milk"+ beverage.getDescription();
	}

}
