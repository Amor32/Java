import  java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VehicleList {
	
	private static ArrayList<Vehicle> Collection;
	protected int total = 0;
	private static int collectionLimit = 10;
	private Scanner input = new Scanner(System.in);
	
	public VehicleList()
	{
		Collection = new ArrayList<Vehicle>();
	}
	
	public void add(Vehicle v)
	{
			Collection.add(v);
			total++;
	}
	
	public boolean isEmpty()
	{
		boolean isEmpty;
		if (total == 0)
		{
			isEmpty = true;
		}
		else
		{
			isEmpty = false;				
		}
		return isEmpty;
				
	}
	
	public boolean isFull(){
		boolean isFull;
		if (total == collectionLimit)
		{
			isFull = true;
		}
		else
		{
			isFull = false;	
		}
		return isFull;
	
	}
	
	public void remove(int i)
	{
		Collection.remove(i);
		total--;
	}
	
	public void remove()
	{
		int i = -1;
		if (total == 0){//Checks if fleet is empty
 		   System.out.println("Fleet is empty! ");
     }
		else
		{
			do 
			{
				try 
				{
					System.out.print("Please select a vehicle to remove  [1 to " + total + " ]");
					i = input.nextInt();
					i--;
					if (i < 0 || i > total)
					{//Prints error message if i is not in selection range
						System.out.print("Invalid choice. ");
					}
				} 
				catch (InputMismatchException e) 
				{
					System.out.print("Invalid choice. ");
				}
				input.nextLine(); // clears the buffer
			} while (i < 0 || i > total);
			Collection.remove(i);
			total--;
		}
	}
	
	
	public Vehicle getVehicle(int i)
	{
		return Collection.get(i);
	}
	
	public String toString()
	{
		String result ="";
		for( Vehicle v :Collection)
		{
			result += v.toString();
			result += "\n ";
	    }
	   result += "\nTotal: " + total;
	   result += "\nVehicle Limit: " + collectionLimit;
	   return result;
	}
	
	public int getTotal()
	{
		int totalCost = 0;
		for( Vehicle v :Collection)
		{
			totalCost += v.getCostOfHire();
		}
		return totalCost;
	}
	
	
}
