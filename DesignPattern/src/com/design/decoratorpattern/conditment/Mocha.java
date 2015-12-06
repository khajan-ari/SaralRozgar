package com.design.decoratorpattern.conditment;

import com.design.decoratorpattern.beverage.Beverage;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	public Mocha(Beverage beverage) {
		super();
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Mocha"+ beverage.getDescription();
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		 return beverage.cost()+23;
	}
}
