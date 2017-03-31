
public class Truck extends Car
{
	int Weight;
	
	public Truck(int speed, double price, String color, int weight) {
		super(speed, price, color);
		Weight = weight;
	}
	
	@Override
	public double getSalePrice()
	{
		if(Weight > 3000)
			return Price * 0.9;
		return Price;
	}
}