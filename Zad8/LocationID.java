
public class LocationID implements Comparable<LocationID>
{
	Integer buildingNo;
	Integer floorNo;
	Integer roomNo;
	
	@Override
	public int compareTo(LocationID o)
	{
		if (buildingNo.compareTo(o.buildingNo) != 0)
		{
			return buildingNo.compareTo(o.buildingNo);
		}
		else
		{
			if(floorNo.compareTo(o.floorNo) != 0)
			{
				return floorNo.compareTo(o.floorNo);
			}
			else
			{
				if(roomNo.compareTo(o.roomNo) != 0)
				{
					return floorNo.compareTo(o.floorNo);
				}
			}				
		}
		
		return 0;
	} 
}