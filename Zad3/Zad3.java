import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Zad3 {

	public static void main(String[] args) 
	{
		Scanner scanner = null;
		try
		{
			File f = new File(System.getProperty("user.dir") + '\\' + args[0]);
			if(f.exists() && !f.isDirectory())
			{			
				scanner = new Scanner(System.in);
				double A, B, C, delta;
		        double deltaSqrt, X0, X1, X2;
		        System.out.print("Funkcja kwadratowa ma postaæ f(x) = Ax^2+Bx+C\nPodaj A: ");
		        A = Double.parseDouble(scanner.next());
		        System.out.print("Podaj B: ");
		        B = Double.parseDouble(scanner.next());
		        System.out.print("Podaj C: ");
		        C = Double.parseDouble(scanner.next());
		        delta = (Math.pow(B, 2) - 4*A*C);
		        deltaSqrt = Math.sqrt(delta);
		        
		        if(delta > 0)
		        {
		            X1 = (-B - deltaSqrt) / (2*A);
		            X2 = (-B + deltaSqrt) / (2*A);
		            System.out.println("Delta: " + delta + "\nX1 wynosi: " + X1 + "\nX2 wynosi: " + X2);
		            FileWriter fw = new FileWriter(f.getPath(), true);
		            PrintWriter pw = new PrintWriter(fw);
		            pw.println("A: " + A);
		            pw.println("B: " + B);
		            pw.println("C: " + C);
		            pw.println("DELTA: " + delta);
		            pw.println("X1: " + X1);
		            pw.println("X2: " + X2);
		            pw.println("---------------------");
		            pw.close();
		        }
		        else if(delta == 0)
		        {
		            X0 = -B / (2*A);
		            System.out.println("Delta:" + delta + "\nX0 wynosi: " + X0);
		            FileWriter fw = new FileWriter(f.getPath(), true);
		            PrintWriter pw = new PrintWriter(fw);
		            pw.println("A: " + A);
		            pw.println("B: " + A);
		            pw.println("C: " + A);
		            pw.println("DELTA: " + delta);
		            pw.println("X0: " + X0);
		            pw.println("---------------------");
		            pw.close();
		        }
		        else
		        {
		            System.out.println("Delta: " + delta + ". Funkcja nie posiada miejsc zerowych");
		            FileWriter fw = new FileWriter(f.getPath(), true);
		            PrintWriter pw = new PrintWriter(fw);
		            pw.println("A: " + A);
		            pw.println("B: " + A);
		            pw.println("C: " + A);
		            pw.println("DELTA: " + delta);
		            pw.println("Funkcja nie posiada miejsc zerowych");
		            pw.println("---------------------");
		            pw.close();
		        }
		        scanner.close();
			}
			else
				throw new FileNotFoundException();
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Podano z³¹ liczbê argumentów wejœciowych!");
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("Nie znaleziono pliku!");
		}
		catch (NumberFormatException ex)
		{
			System.out.println("Wprowadzono niepoprawn¹ wartoœæ!");
		}
		catch (IOException ex)
		{
			System.out.println("B³¹d przy zapisie do pliku!");
		}
	}

}
