package controller;

import model.MarshmallowMonster;
import java.util.Scanner;

public class Controller
{
	//Data member section
	//Declaration section
	//ALWAY PRIVATE!!!!
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	private Scanner inputScanner;
	
	//Constructors initialize data members!
	public Controller()//Call Parameter
	{
		myMonster = new MarshmallowMonster("Jeffery", 8.0, 3, false, 4);	
		userMonster = new MarshmallowMonster();
	}
	
	public void start()
	{
		System.out.println(myMonster);
		System.out.println("What would you like to name your monster?");
		Scanner inputScanner = new Scanner(System.in);
		String setName = inputScanner.nextLine();
		userMonster.setName(setName);
		
		System.out.println("How many legs does he have(USE A DECIMAL)");
		double setLegCount = inputScanner.nextDouble();
		userMonster.setLegCount(setLegCount);
		
		System.out.println("How many eyes does he have?");
		int setEyeCount = inputScanner.nextInt();
		userMonster.setEyeCount(setEyeCount);
		
		System.out.println("Will he have a nose? (True/False)");
		boolean setHasNose = inputScanner.nextBoolean();
		userMonster.setHasNose(setHasNose);
		
		System.out.println("How many arms will he have?");
		int setArmCount = inputScanner.nextInt();
		userMonster.setArmCount(setArmCount);
		
		System.out.println("This is what you named your monster:\n"
						+ userMonster.getName() 
						+"\nHe has " + userMonster.getLegCount() + " legs..."
						+"\nHe has " + userMonster.getEyeCount() + " eyes..."
						+"\nDoes he have a nose:  " + userMonster.getHasNose()
						+"\nHe has " + userMonster.getArmCount() + " arms...");
		inputScanner.close();
		
		
		
		
		
		
		
		
		
		
	}
}
