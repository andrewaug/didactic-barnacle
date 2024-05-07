package ParkingLotTest.ParkingLot;
import java.util.HashMap;
import java.util.Map;

public class ParkingFee {
	
	private boolean parkingFeedPaid = false;
	private int parkingFees = 0;
	Map<String,Integer> parkingVehiclesTypeFeePerHour = new HashMap<>();
	
	public ParkingFee(HashMap<String,Integer> parkingVehiclesTypeFeePerHour) {
		
		this.parkingVehiclesTypeFeePerHour = parkingVehiclesTypeFeePerHour;

	}
	
	//define vehicle type
	//define price for each vehicle type

	/**
	 * @return the parkingFees
	 */
	public int getParkingFees() {
		return parkingFees;
	}

	
	/**
	 * @return the parkingFeedPaid
	 */
	public boolean isParkingFeedPaid() {
		return parkingFeedPaid;
	}
	
	public boolean payParkingFee(int totalFeeToBeCharged ) {
		//CONNECT TO PAYSYSTEM and successful and return True
		parkingFeedPaid = true;
		return parkingFeedPaid;
	}
	

}
