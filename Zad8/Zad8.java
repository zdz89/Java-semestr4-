
public class Zad8 {

	public static void main(String[] args) 
	{
		Building b1 = new Building(1);
		b1.AddFloor(4);
		b1.AddFloor(2);
		b1.AddFloor(3);
		b1.AddFloor(0);
		b1.AddFloor(1);
		b1.floors.get(0).AddRoom(1);
		b1.floors.get(0).AddRoom(2);
		b1.floors.get(1).AddRoom(1);
		b1.floors.get(2).AddRoom(1);
		b1.floors.get(2).AddRoom(2);
		b1.floors.get(2).AddRoom(3);
		b1.floors.get(3).AddRoom(1);
		b1.floors.get(3).AddRoom(2);
		b1.floors.get(3).AddRoom(3);
		b1.floors.get(3).AddRoom(4);
		b1.Opis();
		
		Building b2 = new Building(0);
		b2.AddFloor(1);
		b2.AddFloor(0);
		b2.AddFloor(2);
		b2.floors.get(0).AddRoom(1);
		b2.floors.get(0).AddRoom(2);
		b2.floors.get(1).AddRoom(1);
		b2.floors.get(2).AddRoom(1);
		b2.floors.get(2).AddRoom(2);
		b2.floors.get(2).AddRoom(3);
		b2.Opis();
		
		System.out.println(b1.getFloor(0).getRoom(0).locationID.compareTo(b2.getFloor(0).getRoom(0).locationID));
		
	}
}