package controller;

import model.MarshmallowMonster;

public class Controller
{
	//Data member section
	//Declaration section
	//ALWAY PRIVATE!!!!
	private MarshmallowMonster myMonster;
	
	//Constructors initialize data members!
	public Controller()
	{
		myMonster = new MarshmallowMonster("Jeffery", 8.0, 3, false, 4);
	}
	
	public void start()
	{
		System.out.println(myMonster);
		
	}
}
