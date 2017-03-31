
public class Sedan extends Car
{
	int Length;

	public Sedan(int speed, double price, String color, int length) {
		super(speed, price, color);
		Length = length;
	}
	
	@Override
	public double getSalePrice()
	{
		if(Length < 4500)
			return Price * 0.9;
		return Price;
	}
}