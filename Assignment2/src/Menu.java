import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu 

{
	
	private static Scanner input = new Scanner(System.in);
	private static VehicleList fleet = new VehicleList();
	
	public static void main(String [] args)
	{
		
		char choice;

        do
        {
        System.out.println ();
        System.out.println ("1. Add a vehicle to the fleet");
        System.out.println ("2. Remove a vehicle from the fleet");
        System.out.println ("3. Check if the fleet is empty"); 
        System.out.println ("4. Check if the fleet is full");
        System.out.println ("5. Display total hire cost of the fleet");
        System.out.println ("6. Quit");
        System.out.println ();
        System.out.print (" Please enter a choice [1 to 6]? ");
        choice = input.next().charAt(0);;
        System.out.println ();
        switch (choice)
        {
           case '1' : 
        	   option1();
           break;   
        	   
           case '2' :
        	   option2();
           break;
           
           case '3' : 
        	   option3();
           break;
           
           case '4' : 
        	   option4();
           break;
           
           case '5' : 
        	   option5();
           break;
        	   
           case '6' : break;
           default  : System.out.println( "invalid entry");
         }
        } while (choice !='6');

        System.out.println ("Goodbye!");
        //System.out.print(fleet.toString());
	}
	
	private static void option1()
	{
		//Checks if fleet is full then adds a car or truck depending on user input.  
		if (fleet.isFull() == true)
		{
			System.out.println("Fleet is full! ");
		}
		else
		{
			char choice2;
			System.out.println("1. Add car");
			System.out.println("2. Add truck" );
			choice2 = input.next().charAt(0);
			if (choice2 == '1')
			{
				input.nextLine();
				System.out.print("Enter car make: ");
				String make = input.nextLine();
				System.out.print("Enter car model: ");
				String model = input.nextLine();
				System.out.print("Enter regestration number: ");
				String regNumber = input.nextLine();
				// Ensures only a positive int can be used.
				int seatingCapacity = -1;
				do 
				{
					try 
					{
							System.out.print("Enter seating capacity: ");
							seatingCapacity = input.nextInt();
							if (seatingCapacity <= 0)
							{
								System.out.print("Invalid amount. ");
						    }
					} 
					catch (InputMismatchException e) 
					{
						System.out.print("Invalid amount. ");
					}
					input.nextLine(); // clears the buffer
				} while (seatingCapacity <= 0 );
				Car v = new Car(make, model, regNumber, seatingCapacity);
				fleet.add(v);
			}
			else if (choice2 == '2')
			{
				input.nextLine();
				System.out.print("Enter truck make: ");
				String make = input.nextLine();
				System.out.print("Enter truck model: ");
				String model = input.nextLine();
				System.out.print("Enter regestration number: ");
				String regNumber = input.nextLine();
				// Ensures only a positive int can be used.
				int loadCapacity = -1;
				do {
					try {
							System.out.print("Enter load capacity: ");
							loadCapacity = input.nextInt();
							if (loadCapacity <= 0)
							{
								System.out.print("Invalid amount. ");
							}
						} catch (InputMismatchException e) 
							{
								System.out.print("Invalid amount. ");
							}
						input.nextLine(); // clears the buffer
 					} while (loadCapacity <= 0 );
				Truck v = new Truck(make, model, regNumber, loadCapacity);
				fleet.add(v);
			}
			else 
			{
				System.out.println("Invalid choice!");
			}
		}

	}
	
	private static void option2()
	{
		int i = -1;
		if (fleet.isEmpty() == true){//Checks if fleet is empty before trying to remove an object
 		   System.out.println("Fleet is empty! ");
 	    }
		else
		{
		 do 
		 {
			try 
			{
			    System.out.print("Please select a vehicle to remove  [1 to " + fleet.total + " ]");
			    i = input.nextInt();
			    if (i <=0 || i > fleet.total)
			    {//Prints error message if i is not in selection range
			    	System.out.print("Invalid choice. ");
			    }
			} 
			catch (InputMismatchException e) 
			{
			    System.out.print("Invalid choice. ");
			}
			input.nextLine(); // clears the buffer
		  } while (i <= 0 || i > fleet.total);
		   fleet.remove(--i);//decrements by one to compensate for zero indexing
	    }
	}
	
	private static void option3()
	{
		 //Calls isEmpty method on fleet
 	   if (fleet.isEmpty() == true)
 	   {
 		   System.out.println("The vehicle fleet is empty");
 	   }
 	   else
 	   {
 		   System.out.println("The vehicle fleet is not empty");
 	   }
	}
	
	private static void option4()
	{
		 //Calls isFull method on fleet
 	   if (fleet.isFull() == true)
 	   {
 		   System.out.println("The vehicle fleet is full");
 	   }
 	   else
 		   System.out.println("The vehicle fleet is not full");
	}
	
	private static void option5()
	{
		System.out.print("Total cost of fleet hire: " + fleet.getTotal());
 	    System.out.println(" ");
	}
}
