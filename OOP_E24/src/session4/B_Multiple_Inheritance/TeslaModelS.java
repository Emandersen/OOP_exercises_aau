package session4.B_Multiple_Inheritance;

public class TeslaModelS extends SportsCar implements ElectricVehicle {
    private double battery = 20.0;

    public int speed() {
        return 0;
    }

    public boolean goFast() {
        System.out.println("Going fast");
        return false;
    }

    public double batteryLevel() {
        return battery;
    }

    public void charge() {
        this.battery += 10;
    }
}
