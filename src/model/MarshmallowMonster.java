package model;

public class MarshmallowMonster
{
//--------------------Declaration section------------------------
	private String name;
	private String legCount;
	private String eyeCount;
	private String hasNoses;
	private String armCount;
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
	
	public MarshmallowMonster(String name, String legCount, String eyeCount, String hasNose, String arms)
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
	public String getLegCount()
	{
		return legCount;
	}
	public String getEyeCount()
	{
		return eyeCount;
	}
	public String getHasNose()
	{
		return hasNoses;
	}
	public String getArmCount()
	{
		return armCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public void setLegCount(String legs)
	{
		this.legCount = legs;
	}
	public void setEyeCount(String eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	public void setHasNose(String hasNose)
	{
		this.hasNoses = hasNose;
	}
	public void setArmCount(String armCount)
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
