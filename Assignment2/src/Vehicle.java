
abstract public class Vehicle 
{
	
	protected String make;
	protected String model;
	protected String regNumber;
	
	 public Vehicle (String make, String model, String regNumber)
	   {
	      this.make = make;
	      this.model = model;
	      this.regNumber = regNumber;
	   }
	 
	 public Vehicle()
	 {
		 
	 }
	 
	 public String toString()
	   {
	      String result = "\nMake: " + make + "\n";
	      result += "Model: " + model + "\n";
	      result += "Registration: " + regNumber;
	      return result;
	   }
	 
	 public abstract int getCostOfHire();
	 
	 public String getMake()
	 {
		 return this.make;
	 }
	 
	 public String getModel()
	 {
		 return this.model;
	 }
	 
	 public String getRegNumber()
	 {
		 return this.regNumber;
	 }


}
