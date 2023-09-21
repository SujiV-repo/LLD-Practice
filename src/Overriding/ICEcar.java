package Overriding;

public class ICEcar extends Vehicle{
    int carwheels;

    @Override
    public void startVehicle() {
        System.out.println("Combustion types vehicle started");
    }
}
