import java.util.*;

public class AutoShop
{
	List<Car> vehicleList = null;
	
	public AutoShop()
	{
		vehicleList = new ArrayList<Car>();
		vehicleList.add(new Car(120, 84523.58, "White"));
		vehicleList.add(new Truck(60, 45120.20, "Black", 4000));
		vehicleList.add(new Sedan(90, 15945.50, "Yellow", 200));
		vehicleList.add(new Hatchback(150, 37845.00, "Yellow", 200, 15));
	}
	
	public void getPrices()
	{
		for(Car car : vehicleList)
		{
			System.out.println(car.getSalePrice());
		}					
	}
}