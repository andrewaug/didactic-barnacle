package ParkingLotTest.ParkingLot;

import java.time.Duration;
import java.time.Instant;

public class ParkingSpace {
	//PROVIDE FUNCTION ENTER AND EXIT PARKING LOT 
	//PARKING SPACE CLASS WITH ENTER EXIST FUNCTIONS, 
	//AVAILABLE SPACE, 
	//NOTIFICATION WHEN SPACE IS FULL 
	//PARKING DURATION
	int totalParkingSpace;
	int parkingDuration  = 0;
	private boolean isVehicleParked = false;
	private Instant parkStartTime;
	Duration totalDuration;
	
	/**
	 * @return the totalDuration
	 */
	public Duration getTotalDuration() {
		return totalDuration;
	}
	
	public void setStartTime() {
		this.parkStartTime = Instant.now();
	}


	/**
	 * @param totalDuration the totalDuration to set
	 */
	public void setTotalDuration(Duration totalDuration) {
		this.totalDuration = Duration.between(parkStartTime, Instant.now());
	}


	public void setTotalParkingSpace(int totalParkingSpace) {
		this.totalParkingSpace =  totalParkingSpace;
	}
	
	
	public String enterVehicleToParkingLot() {
		if (totalParkingSpace > 0) {
			isVehicleParked = true;
			totalParkingSpace -= 1;
			setStartTime();
			return "Vehicle Parked";
		}
		else
			return notificationWhenSpaceFull();
	}
	
	public void exitVehicleFromParkingLot() {
		
		isVehicleParked = false;
		totalParkingSpace += 1;
	
	}
	
	public boolean isSpaceAvailable() {
		if (totalParkingSpace > 0)
			return true;
		return false;
		
	}
	
	public String notificationWhenSpaceFull() {
		return "Parking Space is Full";
		
	}
	
	public void getparkingDuration() {
		
	}

}
