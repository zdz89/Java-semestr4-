
public class Zad2 {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println(args[0].substring(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
		}
		catch (NumberFormatException ex)
		{
			System.out.println("Format wprowadzonych argumentów jest nieprawid³owy");
		}
		catch (ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Podano za ma³¹ liczbê argumentów wejœciowych");
		}
	}
}
