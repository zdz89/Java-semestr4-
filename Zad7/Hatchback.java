
public class Hatchback extends Car
{
	int Year;
	double manufacturerDiscount;

	public Hatchback(int speed, double price, String color, int year, double mDiscount) 
	{
		super(speed, price, color);
		Year = year;
		manufacturerDiscount = mDiscount;
	}
	
	@Override
	public double getSalePrice()
	{
		return Price - (Price * (manufacturerDiscount / 100));
	}
}