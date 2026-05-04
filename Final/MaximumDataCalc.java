import java.util.List;

public class MaximumDataCalc extends AbstractDataCalc {
    public MaximumDataCalc(DataSet set) {
        super(set);
    }

    public String getType() {
        return "MAX";
    }

    public double calcLine(List<Double> line) {
        double max = Double.NEGATIVE_INFINITY;
        for (double value : line) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}