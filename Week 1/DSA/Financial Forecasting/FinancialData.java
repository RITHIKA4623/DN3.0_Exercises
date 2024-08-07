public class FinancialData {
    private double initialValue;
    private double growthRate;
    private int years;

    public FinancialData(double initialValue, double growthRate, int years) {
        this.initialValue = initialValue;
        this.growthRate = growthRate;
        this.years = years;
    }

    public double getInitialValue() {
        return initialValue;
    }

    public void setInitialValue(double initialValue) {
        this.initialValue = initialValue;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public String toString() {
        return "FinancialData{" +
                "initialValue=" + initialValue +
                ", growthRate=" + growthRate +
                ", years=" + years +
                '}';
    }
}
