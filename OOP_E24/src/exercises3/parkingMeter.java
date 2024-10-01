package session3;

public class parkingMeter {
    public static void main(String[] args) {
        parkingFees weekend = new weekendRate();
        parkingFees weekday = new weekdayRate();

        System.out.println("Weekend rate: " + weekend.rate(60));
        System.out.println("Weekday rate: " + weekday.rate(60));
    }
}

interface parkingFees {
    public double rate(int minutes);
}

class weekendRate implements parkingFees {
    @Override
    public double rate(int minutes) {
        return minutes * 2;
    }
}

class weekdayRate implements parkingFees {
    @Override
    public double rate(int minutes) {
        return minutes * 1.5;
    }
}
