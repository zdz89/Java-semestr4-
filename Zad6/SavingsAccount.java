import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class SavingsAccount 
{	
	double savingsBalance;
	
	public SavingsAccount()
	{
		setSavingsBalance(0);
	}
	
	private void setSavingsBalance(double value)
	{
		this.savingsBalance = value;
	}
	
	public double getSavingsBalance()
	{
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("#.00");
		df.setDecimalFormatSymbols(dfs);
		return Double.parseDouble(df.format(this.savingsBalance));
	}
	
	public void Payment(double value)
	{
		setSavingsBalance(this.savingsBalance + value);
	}
	
	public void Payout(double value)
	{
		setSavingsBalance(this.savingsBalance - value);
	}
	
	public void calculateMonthlyInterest()
	{
		setSavingsBalance(this.savingsBalance + ((Zad6.annuallInterestRate * getSavingsBalance()) / 12));
	}
}
