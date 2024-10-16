package session4.B_Multiple_Inheritance;

/**
 * Exercise:
 *  - Create a class called ElectricPetrolStation that provides a method chargeVehicle(ElectricVehicle vehicle). This method should:
 *      - Accept only instances of vehicles that implement the ElectricVehicle interface.
 *      - Call the batteryLevel() method to check the current battery level before charging.
 *      - Simulate charging the vehicle by increasing the battery level (for simplicity, assume charging adds 10% to the battery, but does not exceed 100%).
 *
 *  - Modify the ElectricVehicle interface to allow updating the battery level of a vehicle.
 *
 *  - Create a class to represent Electric Buses manufactured by Volvo.
 *
 *  - Add code below to simulate a scenario where both a TeslaS and a Volvo Electric Bus go to an ElectricPetrolStation and get charged.
 *
 */

public class Exercise2 {

    public static void main(String[] args) {
        ElectricPetrolStation eStation = new ElectricPetrolStation();

        TeslaModelS tesla = new TeslaModelS();

        System.out.println("tesla battery" + tesla.batteryLevel());

        eStation.chargeBattery(tesla);
    }
}
