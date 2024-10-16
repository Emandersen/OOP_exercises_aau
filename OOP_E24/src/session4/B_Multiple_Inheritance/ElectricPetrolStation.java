package session4.B_Multiple_Inheritance;

public class ElectricPetrolStation {
    public void chargeBattery(ElectricVehicle vehicle) {
        while (vehicle.batteryLevel() < 100) {
            vehicle.charge();
        }
    } 
}
