import java.util.Scanner;

public class Zad6 {

	public static void main(String[] args) 
	{
//		System.out.println("Menu");
//        System.out.println("-------------------------\n");
//        System.out.println("1 - Stwórz konto");
//        System.out.println("2 - Wp³aæ pieni¹dze");
//        System.out.println("3 - Wyp³aæ");
//        System.out.println("4 - Wyjdz");
//		Scanner scanner = new Scanner(System.in);
//	    int choice = scanner.nextInt();
//
//	    switch (choice) {
//	        case 1:
//	            break;
//	        case 2:
//	            break;
//	        case 3:
//	            break;
//	        case 4:
//	            break;
//	    }
//	    
		SavingsAccount account = new SavingsAccount();
		System.out.println("Stworzono nowe konto");
		System.out.println("Stan konta: " + account.getSavingsBalance());
		account.Payment(303.50);
		System.out.println("Wp³ata 303.50");
		System.out.println("Stan konta: " + account.getSavingsBalance());
		account.Payout(102.50);
		System.out.println("Wyp³ata 102.50");
		System.out.println("Stan konta: " + account.getSavingsBalance());
		account.calculateMonthlyInterest();
		System.out.println("Przeliczono oprocentowanie");
		System.out.println("Stan konta: " + account.getSavingsBalance());
	}
	
	static double annuallInterestRate = 0.55;
	static void modifyInterestRate(double value)
	{
		annuallInterestRate = value;
	}
}