package parkingLot.service.strategy.slotAllocationStrategy;

import parkingLot.models.Gate;
import parkingLot.models.ParkingLot;
import parkingLot.models.ParkingSlot;
import parkingLot.models.constants.VehicleType;

public interface SlotAllocationStrategy {
    ParkingSlot findPakingSlot(VehicleType vehicleType, ParkingLot parkingLot, Gate entryGate);
}
