package com.design.decoratorpattern.conditment;

import com.design.decoratorpattern.beverage.Beverage;

public class Whip extends CondimentDecorator {
	
	Beverage beverage;
	

	public Whip(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "THIS IS A Whip WITH"+ beverage.getDescription();
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		
		return beverage.cost()+35;
	}

}
