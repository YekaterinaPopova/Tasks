package range;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getLength(double from, double to) {
        double lengthInterval;
        lengthInterval = to - from;
        return lengthInterval;
    }

    public boolean isInside(double lengthInterval) {
        boolean inInterval = true;
        if ((lengthInterval >= from) && (lengthInterval <= to)) {
            inInterval = true;
        } else {
            inInterval = false;
        }
        return inInterval;
    }
}
