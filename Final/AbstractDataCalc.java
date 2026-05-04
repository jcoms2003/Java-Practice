public abstract class AbstractDataCalc {


    public AbstractDataCalc(DataSet set) {
        setAndRun(set);
    }
    public void setAndRun(DataSet set) {
        if(set != null) {
            runCalculations(set);
        }
    }
    public void runCalculations()
    @Override
    public String toString() {

    }
}