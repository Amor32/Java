
public class Car extends Vehicle 
{
	
	protected int seatingCapacity;
	
	public Car(String make, String model, String regNumber, int seatingCapacity)
	{	
		super (make, model, regNumber);
		this.seatingCapacity = seatingCapacity;
	}
	
	
	public String toString()
	{
	   String result = super.toString();
	   result += "\nNumber of seats: " + seatingCapacity;
	   return result;
	}
	
	public int getCostOfHire(){
		int hireCost = seatingCapacity*100;
		return hireCost;
	}

}
