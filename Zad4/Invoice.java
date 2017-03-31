import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class Invoice
{
	List<InvoiceItem> itemsList;
	
	public Invoice()
	{
		itemsList = new ArrayList<InvoiceItem>();
	}
	
	public double getInvoiceAmount()
	{
		if(itemsList == null || itemsList.size() < 1)
	        return 0;
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("####0.00");
		df.setDecimalFormatSymbols(dfs);
		return Double.parseDouble(df.format(itemsList.stream().mapToDouble(i -> i.getPrice()).sum()));
	}
	
	public void addInvoiceItem(InvoiceItem ii)
	{
		itemsList.add(ii);
	}
	
	public void removeInvoiceItem(int index)
	{
		itemsList.remove(index);
	}
	
	public int getInvoiceSize()
	{
		return itemsList.size();
	}
	
	public int getInvoiceItemsCount()
	{
		return itemsList.stream().mapToInt(i -> i.getCount()).sum();
	}
}
