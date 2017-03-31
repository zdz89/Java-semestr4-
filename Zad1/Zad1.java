import java.util.*;

public class Zad1 {

	public static void main(String[] args) 
	{		
		Random rand = new Random();
		int liczba = rand.nextInt(100) + 0, strzal = -1, wynik = 0;
		char cont = 0;
		Scanner s = new Scanner(System.in);
		
		while (Character.toUpperCase(cont) != 'N') 
		{			
			while (strzal != liczba) 
			{
				try 
				{
					strzal = s.nextInt();
				}
				catch (java.util.InputMismatchException e)
				{
					System.out.println("Wprowadz poprawn¹ liczbê!");
					s.next();
					continue;
				}
				
				wynik++;
				
				if(strzal > liczba)
					System.out.println("Za du¿a...");
				else if(strzal < liczba)
					System.out.println("Za ma³a...");
			}
			
			liczba = rand.nextInt(100) + 0;
			System.out.println("Brawo! Uda³o siê za " + wynik + ". razem");
			wynik = 0;
			System.out.println("Jeszcze raz? (T/N)");
			cont = s.next().charAt(0);			
		}
		s.close();
	}
}
