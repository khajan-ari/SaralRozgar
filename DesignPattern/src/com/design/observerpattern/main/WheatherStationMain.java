package com.design.observerpattern.main;

import com.design.observerpattern.observer.DisplayCurrentConditions;
import com.design.observerpattern.observer.DisplayForecast;
import com.design.observerpattern.observer.DisplayStatistics;
import com.design.observerpattern.subject.WheatherData;

public class WheatherStationMain {

	public static void main(String args[]) {
		
		WheatherData wd = new WheatherData();
		
		DisplayCurrentConditions dcc = new DisplayCurrentConditions(wd);
		DisplayForecast df = new DisplayForecast(wd);
		DisplayStatistics ds = new DisplayStatistics(wd);
		for(int x=0;x<=5;x++)
		{
			wd.setMesurement(x+3, x+4, x+2);
		}

	}
}
