
public class Truck extends Vehicle 
{
	
	protected int loadCapacity;
	
	public Truck(String make, String model, String regNumber, int loadCapacity)
	{
		super (make, model, regNumber);
		this.loadCapacity = loadCapacity;
	}
	
	
	public String toString()
	{
	   String result = super.toString();
	   result += "\nLoad Capacity: " + loadCapacity;
	   return result;
	}
	
	public int getCostOfHire()
	{
		int hireCost = loadCapacity*25;
		return hireCost;
	}

}
