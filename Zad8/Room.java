
public class Room extends Location
{
	public Room (int bNo, int fNo, int rNo)
	{
		super.locationID.buildingNo = bNo;
		super.locationID.floorNo = fNo;
		super.locationID.roomNo = rNo;
	}
	
	@Override
	void Opis() 
	{
		System.out.println("		Pokój: " + super.locationID.roomNo);
	}
}