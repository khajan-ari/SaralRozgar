package com.design.observerpattern.observer;

import com.design.observerpattern.subject.WheatherData;

public class DisplayForecast implements Observer {

	private WheatherData wd;
	
	private int temprature;
	private int pressure;
	private int humidity;
	public DisplayForecast(WheatherData wd) {
		this.wd=wd;
		wd.registerObserver(this);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void update(int temprature,int pressure,int humidity) {
		// TODO Auto-generated method stub
		this.pressure=pressure;
		this.pressure=pressure;
		this.humidity=humidity;
		display();
	}
	
	public void display()
	{
		System.out.println(getClass()+">>temprature>>"+wd.getTemprature());
		System.out.println(getClass()+">>pressure"+wd.getPressure());
		System.out.println(getClass()+">>humidity"+wd.getHumidity());
	}
	public void registerWhether()
	{
		wd.registerObserver(this);
	}
	public void removeWhether()
	{
		wd.registerObserver(this);
	}

}
