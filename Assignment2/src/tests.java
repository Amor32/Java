import static org.junit.Assert.*;

import org.junit.Test;

public class tests
{

	@Test
	public void isEmptyTest() 
	{
		VehicleList test = new VehicleList();
		boolean output = test.isEmpty();
		assertEquals(true, output);
	}
	
	@Test
	public void isEmptyTest2() 
	{
		VehicleList test = new VehicleList();
		Car v = new Car("make","model","Reg Number",4); 
		test.add(v);
		boolean output = test.isEmpty();
		assertEquals(false, output);
	}
	
	@Test
	public void isFullTest() 
	{
		VehicleList test = new VehicleList();
		Car v = new Car("make","model","Reg Number",4); 
		test.add(v);
		boolean output = test.isFull();
		assertEquals(false, output);
	}

	@Test
	public void isFullTest2() 
	{
		VehicleList test = new VehicleList();
		Car v = new Car("make","model","Reg Number",4); 
		while(test.isFull() == false)
		{
			test.add(v);
		}
		boolean output = test.isFull();
		assertEquals(true, output);
	}
	
	@Test
	public void getTotalCar() 
	{
		VehicleList test = new VehicleList();
		Car v = new Car("make","model","Reg Number",4); 
		test.add(v);
		int output = test.getTotal();
		assertEquals(400, output);
	}
	
	@Test
	public void getTotalTruck() 
	{
		VehicleList test = new VehicleList();
		Truck v = new Truck("make","model","Reg Number",100); 
		test.add(v);
		int output = test.getTotal();
		assertEquals(2500, output);
	}
	
	@Test
	public void getTotalMulti() 
	{
		VehicleList test = new VehicleList();
		Car v = new Car("make","model","Reg Number",4); 
		Truck t = new Truck("make","model","Reg Number",100); 
		test.add(v);
		test.add(t);
		int output = test.getTotal();
		assertEquals(2900, output);
	}
	
	@Test
	public void totalTest1() 
	{
		VehicleList test = new VehicleList();
		Truck v = new Truck("make","model","Reg Number",100); 
		test.add(v);
		int output = test.total;
		assertEquals(1, output);
	}
	
	@Test
	public void totalTest2() 
	{
		VehicleList test = new VehicleList();
		Car v = new Car("make","model","Reg Number",4); 
		while(test.isFull() == false)
		{
			test.add(v);
		}
		int output = test.total;
		assertEquals(10, output);
	}
	
	@Test
	public void totalTest3() 
	{
		VehicleList test = new VehicleList();
		Car v = new Car("make","model","Reg Number",4); 
		while(test.isFull() == false)
		{
			test.add(v);
		}
		test.remove(1);
		int output = test.total;
		assertEquals(9, output);
	}
}
