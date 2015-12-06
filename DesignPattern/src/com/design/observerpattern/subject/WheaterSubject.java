package com.design.observerpattern.subject;

import com.design.observerpattern.observer.Observer;

public interface WheaterSubject {
	
	public void registerObserver(Observer observer);
	public void unregisterObserver(Observer observer);
	public void notifyObserver();


}
