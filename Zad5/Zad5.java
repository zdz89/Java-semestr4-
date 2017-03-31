import java.io.*;
import java.util.*;

public class Zad5 {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException 
	{
		boolean equals = false;
		Scanner s = new Scanner(System.in);
		while(!equals)
		{
			System.out.println("Podaj dwa wektory liczb double (oddzielonymi spacjami)");
			System.out.print("1.: " );	
			List<String> temp1 = Arrays.asList(s.nextLine().split(" "));
			System.out.print("2.: " );
			List<String> temp2 = Arrays.asList(s.nextLine().split(" "));
	
			for(String number : temp1)
			{
			    try
			    {
			        Integer.parseInt(number.trim());
			    } 
			    catch(Exception e)
			    {
			    	temp1.set(temp1.indexOf(number), "");
			    	System.out.print(e.getMessage());
			    }
			}
			
			for(String number : temp2) 
			{
			    try 
			    {
			        Integer.parseInt(number.trim());
			    } 
			    catch(Exception e)
			    {
			    	temp2.set(temp2.indexOf(number), "");
			    	System.out.print(e.getMessage());
			    }
			}
		
			try
			{
				if(temp1.size() != temp2.size())
					throw new DifferentVectorSizeException();
				else
				{
					equals = true;
					List<Integer> temp3 = new ArrayList<>();
					for(int i = 0 ; i < temp1.size() ; i++)
					{
						temp3.add(Integer.parseInt(temp1.get(i)) + Integer.parseInt(temp2.get(i)));
					}
					
					try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("file.txt"), "utf-8")))
					{
						writer.write(temp3.toString());
					}
				}
			}
			catch (DifferentVectorSizeException ex)
			{
				System.out.println("Nie mo¿na dodaæ wektorów, poniewa¿ maj¹ ró¿ne rozmiary");
				System.out.println("Rozmiar 1.: " + temp1.size());
				System.out.println("Rozmiar 2.: " + temp2.size());
				continue;
			}

		}
		s.close();
	}
}
