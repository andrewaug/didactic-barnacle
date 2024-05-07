package FreightServicesTest.FreightServices;

import ParkingLotTest.ParkingLot.FreightServicesTest;

public interface FlightsToSchedule {
	void getInventoryToPrepareFlightSchedule();
	void prepareFlightSchedule(String orderKey, String date);
}
