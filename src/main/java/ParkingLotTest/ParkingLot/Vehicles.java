package ParkingLotTest.ParkingLot;

public class Vehicles {
	
	//DESIGN FEATURES
	//ABLE TO HANDLE DIFFERENT VEHICLES //VEHICLE CLASS--Its done
	//PROVIDE FUNCTION ENTER AND EXIT PARKING LOT //PARKING SPACE CLASS WITH ENTER EXIST FUNCTIONS--its done
	//AVAILABLE SPACE, NOTIFICATION WHEN SPACE IS FULL--its done
	//PARKING DURATION--its done
	//VEHICLES SHOULD CHECK AVAIALBLE PARKING SPACES--its done
	//SHOULD SUPPORT CHARGING FEES BASED ON DURATION OF PARKING //PARKING FEES CLASS, FEES PER DURATION IN MINUTES PER VEHICLE TYPE
	//PROVIDE NOTIFICATION WHEN PARKING IF FULL
	
	private String vehicleType = "";
	/**
	 * @return the vehicleType
	 */
	public String getVehicleType() {
		return vehicleType;
	}
	/**
	 * @param vehicleType the vehicleType to set
	 */
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	/**
	 * @return the licensePlate
	 */
	public String getLicensePlate() {
		return licensePlate;
	}
	/**
	 * @param licensePlate the licensePlate to set
	 */
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	private String licensePlate = "";
	
	

}
