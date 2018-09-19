package model;

public class MarshmallowMonster
{
//--------------------Declaration section------------------------
	private String name;
	private int legCount;
	private int eyeCount;
	private String hasNoses;
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
	
	public MarshmallowMonster(String name, int legCount, int eyeCount, String hasNose, int arms)
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
	public int getLegCount()
	{
		return legCount;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public String getHasNose()
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
	public void setLegCount(int legs)
	{
		this.legCount = legs;
	}
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setHasNose(String hasNose)
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
