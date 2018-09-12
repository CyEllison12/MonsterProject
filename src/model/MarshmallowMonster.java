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
	
	public String getName()
	{
		return name;//return should always be last statement
	}
	public double getLegCount()
	{
		return legCount;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public boolean getHasNose()
	{
		return hasNoses;
	}
	public int getArmCount()
	{
		return armCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setLegCount(double legCount)
	{
		this.legCount = legCount;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setHasNose(boolean hasNose)
	{
		this.hasNoses = hasNose;
	}
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public String toString()//formal parameter
	{
		String description = "This monster is named: " + name
							+ "\nand he has " + legCount + " legs...."
							+ "\nand he has " + eyeCount + " eyes...."
							+ "\nand he has " + armCount + " arms...."
							+ "\ndoes he have a nose? " + hasNoses
							+ "\nHis favorite thing to say is:" 
							+ "\n'F-R-E-E That spells free, FreeCreditReport.com baby!'";
		
		return description;
	}
	
	
}
