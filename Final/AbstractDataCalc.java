import java.util.ArrayList;
import java.util.List;


public abstract class AbstractDataCalc {


    public AbstractDataCalc(DataSet set) {
        setAndRun(set);
    }
    public void setAndRun(DataSet set) {
        if (set != null) {
            this.dataSet = set; // Initialize the DataSet reference
            runCalculations();
        }
    }
    private void runCalculations() {

    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Dataset Results (Method: ").append(getType()).append(")\n");
        for (int i = 0; i < dataSet.rowCount(); i++) {
            double value = calcLine(dataSet.getRow(i));
            result.append("Row ").append(i + 1).append(": ").append(String.format("%.1f", value)).append("\n");
        }
        return result.toString();
    }
    public abstract String getType();

    public abstract double calcLine(List<Double> line);

    private DataSet dataSet; // Add a reference to the DataSet
}