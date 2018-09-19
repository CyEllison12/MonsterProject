package controller;

import model.MarshmallowMonster;
//import java.util.Scanner;
import javax.swing.JOptionPane;

public class Controller
{
	//Data member section
	//Declaration section
	//ALWAY PRIVATE!!!!
	private MarshmallowMonster myMonster;
	private MarshmallowMonster userMonster;
	
	//Constructors initialize data members!
	public Controller()//Call Parameter
	{
		myMonster = new MarshmallowMonster("Jeffery", 8, 3, "false", 4);	
		userMonster = new MarshmallowMonster();
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(null, myMonster);
		//System.out.println(myMonster);
		//System.out.println("What would you like to name your monster?");
		//JOptionPane.showMessageDialog(null, "How many arms?");
		//Scanner inputScanner = new Scanner(System.in);
		String userInput = JOptionPane.showInputDialog("What would you like to name your monster?");
		
		//input name
		//String setName = inputScanner.nextLine();
		
		userMonster.setName(userInput);
		
		//input legs
		//System.out.println("How many legs does he have(USE A DECIMAL)");
		//JOptionPane.showMessageDialog(null, "How many legs does he have(USE A DECIMAL)");
		//double setLegCount = inputScanner.nextDouble();
		String legs = JOptionPane.showInputDialog("How many legs does he have?");
		int userLegs = 0;
		if(validInt(legs))
		{
			userLegs = Integer.parseInt(legs);
			
		}
		userMonster.setLegCount(userLegs);
		
		//input eyes
		//System.out.println("How many eyes does he have?");
		String setEyeCount = JOptionPane.showInputDialog(null, "How many eyes does he have");
		//int setEyeCount = inputScanner.nextInt();
		int userEyes = 0;
		if(validInt(setEyeCount))
		{
			userEyes = Integer.parseInt(setEyeCount);
		}
		userMonster.setEyeCount(userEyes);
		
		//input Nose (boolean True/False)
		//System.out.println("Will he have a nose? (True/False)");
		String setHasNose = JOptionPane.showInputDialog(null, "Will he have a nose");
		//boolean setHasNose = inputScanner.nextBoolean();
		userMonster.setHasNose(setHasNose);
		
		//input arms
		//System.out.println("How many arms will he have?");
		String setArmCount = JOptionPane.showInputDialog(null, "How many arms will he have?");
		//int setArmCount = inputScanner.nextInt();
		int userArms = 0;
		if(validInt(setArmCount))
		{
			userArms = Integer.parseInt(setArmCount);
		}
		userMonster.setArmCount(userArms);
		
		//output all info entered above by user
		//ystem.out.println("This is what you named your monster:\n"
		//				+ userMonster.getName() 
		//				+"\nHe has " + userMonster.getLegCount() + " legs..."
		//				+"\nHe has " + userMonster.getEyeCount() + " eyes..."
		//				+"\nDoes he have a nose:  " + userMonster.getHasNose()
		//				+"\nHe has " + userMonster.getArmCount() + " arms...");
		//inputScanner.close();
		JOptionPane.showMessageDialog(null, "This is what you named your monster:\n"
				+ userMonster.getName() 
				+"\nHe has " + userMonster.getLegCount() + " legs..."
				+"\nHe has " + userMonster.getEyeCount() + " eyes..."
				+"\nDoes he have a nose:  " + userMonster.getHasNose()
				+"\nHe has " + userMonster.getArmCount() + " arms...");
		

		
		if (userMonster.getLegCount() > 5)
		{
			JOptionPane.showMessageDialog(null, userMonster.getName() + " has more the 5 legs!");
		}
		else if(userMonster.getLegCount() == 5)
		{
			JOptionPane.showMessageDialog(null, userMonster.getName() + " has 5 legs!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, userMonster.getName() + " has less then 5 legs!");
		}
		
		if (userMonster.getEyeCount() > 5)
		{
			JOptionPane.showMessageDialog(null, userMonster.getName() + " has more the 5 eyes!");
		}
		else if(userMonster.getEyeCount() == 5)
		{
			JOptionPane.showMessageDialog(null, userMonster.getName() + " has 5 eyes!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, userMonster.getName() + " has less then 5 eyes!");
		}
		if (userMonster.getArmCount() > 5)
		{
			JOptionPane.showMessageDialog(null, userMonster.getName() + " has more the 5 arms!");
		}
		else if(userMonster.getArmCount() == 5)
		{
			JOptionPane.showMessageDialog(null, userMonster.getName() + " has 5 arms!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, userMonster.getName() + " has less then 5 arms!");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	public boolean validInt(String maybeInt)
	{
		
		boolean isValid = false;
		
		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You need to type in a whole number :D");
		}
		return isValid;
	}
}
