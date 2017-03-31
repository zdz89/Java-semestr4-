import java.util.ArrayList;
import java.util.List;

public class Floor extends Location
{
	List<Room> rooms = new ArrayList<Room>();

	public Floor(int bNo, int fNo)
	{
		super.locationID.buildingNo = bNo;
		super.locationID.floorNo = fNo;
		super.locationID.roomNo = -1;
	}
	
	public void AddRoom(int value)
	{
		Room r = new Room(super.locationID.buildingNo, super.locationID.floorNo, value);
		rooms.add(r);
	}
	
	public Room getRoom(int index)
	{
		return rooms.get(index);
	}
	
	@Override
	void Opis() 
	{
		System.out.println("	Piêtro: " + super.locationID.floorNo);
		for(Room r : rooms)
           r.Opis();
	}
}