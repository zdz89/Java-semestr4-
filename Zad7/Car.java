
public class Car 
{
	int Speed;
	double Price;
	String Color;
	
	public Car(int speed, double price, String color)
	{
		Speed = speed;
		Price = price;
		Color = color;
	}
	
	public double getSalePrice()
	{
		return Price;
	}
}
