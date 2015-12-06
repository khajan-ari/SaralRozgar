package com.design.observerpattern.subject;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.design.observerpattern.observer.Observer;

public class WheatherData implements WheaterSubject {

	private int temprature;
	private int pressure;
	private int humidity;
	private ArrayList<Observer> observers =  new ArrayList<Observer>();
	
	public int getTemprature() {
		return temprature;
	}

	public void setTemprature(int temprature) {
		this.temprature = temprature;
	}

	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
	public void setMesurement(int temp, int humidity,int pressure)
	{
		this.pressure=pressure;
		this.temprature=temp;
		this.humidity=humidity;
		mesurementChanged();
		
	}
	public void mesurementChanged()
	{
		notifyObserver();
		
	}

	@Override
	public void registerObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
		
	}
	@Override
	public void unregisterObserver(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(int i=0 ;i<observers.size();i++)
		{
			observers.get(i).update(temprature,pressure,humidity);
		}
		
	}
	
}
