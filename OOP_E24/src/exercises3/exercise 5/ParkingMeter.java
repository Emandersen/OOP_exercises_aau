package session3.Exercise5;
/*Write a class to represent a parking meter. The parking meter
should have a method to insert coins and pay for x minutes. The parking rate
depends on whether it is weekday or weekend. Write an interface to capture
the computation of the parking rate. Use the interface in the parking meter.
Write two classes, which implement the interface, one for the rate in weekdays
and one for the rate in weekends. */
public class ParkingMeter {

    private int coins;
    private int minutes;
    private boolean weekday;
    private WeekdayRate weekdayRate;
    private WeekendRate weekendRate;

    //Constructor
    public ParkingMeter(int minutes, boolean weekday){
        this.minutes = minutes;
        this.weekday = weekday;
        this.weekdayRate = new WeekdayRate(); // creates an instance (object) of the WeekdayRate class
        this.weekendRate = new WeekendRate(); // creates an instance (object) of the WeekendRate class
    }

    // Methods

    // Method for inserting coins
    public void insertCoins(int coins) { this.coins += coins; }

    /*Method to pay the parking fee depending on wether it's a week day or the weekend. 
     * The method is dynamic - it calls on the instances this.weekdayRate and this.weekendRate*/
    public void payPerMinute(){
        if(weekday) { this.coins -= this.weekdayRate.rate(this.minutes); }
        else { this.coins -= this.weekendRate.rate(this.minutes); } 
    }
    
    // Getters

    // Getter for seeing amount of coins 
    public int getCoins() { return this.coins; }

    // Getter for parking fee
    public int getParkingFee(){
        if(weekday) { return weekdayRate.rate(minutes); }
        else { return weekendRate.rate(minutes); } 
    }
}
