import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class InvoiceItem 
{
	int id;
	String description;
	int count;
	double price;
	
	public InvoiceItem(int id, String description, int count, double price)
	{
		setId(id);
		setDescription(description);
		setCount(count);
		setPrice(price);
	}
	
	public int getId()
	{
		return this.id;
	}
	void setId(int value)
	{
		this.id = value;
	}
	public String getDescription()
	{
		return this.description;
	}
	void setDescription(String value)
	{
		this.description = value;
	}
	public int getCount()
	{
		return this.count;
	}
	void setCount(int value)
	{
		this.count = value;
	}
	public double getPrice()
	{
		return this.price;
	}
	void setPrice(double value)
	{
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("####0.00");
		df.setDecimalFormatSymbols(dfs);
		this.price = Double.parseDouble(df.format(value));
	}
}