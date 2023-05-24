public class DummyTel {
    /*
    Calculates the net cost of a long-distance phone call.

    @param startTime the start time of the call in 24-hour format (integer between 0 and 23)

    @param duration the duration of the call in minutes (non-negative integer)

    @return the net cost of the call, rounded to the nearest percent
    */
    public static double calculateCost(int startTime, int duration) {
        double rate = 0.50;
        double cost = rate * duration;

// apply discount for calls between 18:00 and 08:00
        if (startTime >= 18 || startTime < 8) {
            cost *= 0.5;
        }

// apply discount for calls longer than 60 minutes
        if (duration > 60) {
            cost *= 0.85;
        }

// add tax
        cost *= 1.05;

// round cost to nearest percent
        cost = Math.round(cost * 100) / 100.0;

        return cost;
    }
}