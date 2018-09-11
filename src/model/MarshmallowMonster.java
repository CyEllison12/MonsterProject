package model;

public class MarshmallowMonster
{
//--------------------Declaration section------------------------
	private String name;
	private double legCount;
	private int eyeCount;
	private boolean hasNoses;
	private int armCount;
//---------------------------------------------------------------
	
	
	public MarshmallowMonster()
	{
		//Default constructor
		//Generally boring and not as helpful
	}
	
	public MarshmallowMonster(String name)
	{
		this.name = name; 
	}
	
	public MarshmallowMonster(String name, double legCount, int eyeCount, boolean hasNose, int arms)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.hasNoses = hasNose;
		this.armCount = arms;
	}
	
	public String toString()
	{
		String description = "This monster is named: " + name
							+ "and it has " + legCount + " legs...."
							+ "and it has " + eyeCount + " eyes...."
							+ "and it has " + armCount + " arms...."
							+ "does he have a nose? " + hasNoses
							+ "His favorite thing to say is:" 
							+ "F-R-E-E That spells free, FreeCreditReport.com baby!";
		
		return description;
	}
	
	
}
