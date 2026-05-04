import java.util.ArrayList;
import java.util.List;

public class AverageDataCalc extends AbstractDataCalc {
    public AverageDataCalc(DataSet set) {
        super(set);
    }

    public String getType() {
        return "AVERAGE";
    }
    public double calcLine(List<Double> line) {
        double sum = 0;
        for (double value : line) {
            sum += value;
        }
        return sum / line.size();
    }
}