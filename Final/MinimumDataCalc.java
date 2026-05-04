import java.util.List;

public class MinimumDataCalc extends AbstractDataCalc {
    public MinimumDataCalc(DataSet set) {
        super(set);
    }

    public String getType() {
        return "MIN";
    }

    public double calcLine(List<Double> line) {
        double min = Double.POSITIVE_INFINITY;
        for (double value : line) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}