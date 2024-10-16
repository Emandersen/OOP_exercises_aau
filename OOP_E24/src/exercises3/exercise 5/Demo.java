package session3.Exercise5;
/*Write a class to represent a parking meter. The parking meter
should have a method to insert coins and pay for x minutes. The parking rate
depends on whether it is weekday or weekend. Write an interface to capture
the computation of the parking rate. Use the interface in the parking meter.
Write two classes, which implement the interface, one for the rate in weekdays
and one for the rate in weekends. */

public class Demo {
    public static void main(String[] args) {
       
        // Parking meter 1
        ParkingMeter parkingmeter1 = new ParkingMeter(30, true);
        parkingmeter1.insertCoins(100);
        System.out.println("Coins: " + parkingmeter1.getCoins());
        parkingmeter1.payPerMinute();
        System.out.println("Parking fee: " + parkingmeter1.getParkingFee());
        System.out.println("Coins remaining: " + parkingmeter1.getCoins() + "\n");

        // Parking meter 2
        ParkingMeter parkingmeter2 = new ParkingMeter(30, false);
        parkingmeter2.insertCoins(200);
        System.out.println("Coins: " + parkingmeter2.getCoins());
        parkingmeter2.payPerMinute();
        System.out.println("Parking fee: " + parkingmeter2.getParkingFee());
        System.out.println("Coins remaining: " + parkingmeter2.getCoins());
   
    }
}
