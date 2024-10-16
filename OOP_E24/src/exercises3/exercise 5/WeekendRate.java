package session3.Exercise5;

public class WeekendRate implements RateInterface {
    
    @Override
    public int rate(int minutes) { return 2 * minutes; }
}
