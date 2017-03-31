import java.util.ArrayList;
import java.util.List;

public class Building extends Location
{
	List<Floor> floors = new ArrayList<Floor>();
	
	public Building(int bNo)
	{
		super.locationID.buildingNo = bNo;
		super.locationID.floorNo = -1;
		super.locationID.roomNo = -1;
	}
	
	public void AddFloor(int value)
	{
		Floor f = new Floor(super.locationID.buildingNo, value);
		floors.add(f);
	}
	
	public Floor getFloor(int index)
	{
		return floors.get(index);
	}
	
	@Override
	public void Opis() 
	{
		System.out.println("Budynek: " + super.locationID.buildingNo);
		for(Floor f : floors)
           f.Opis();
	}
}