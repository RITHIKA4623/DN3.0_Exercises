public class ForecastingApp {

    public static void main(String[] args) {
        FinancialData data = new FinancialData(1000, 0.05, 10);

        System.out.println("Initial Data: " + data);

        // Predict future value using simple recursion
        double futureValue = FinancialForecasting.predictFutureValue(
            data.getInitialValue(), data.getGrowthRate(), data.getYears());
        System.out.println("Predicted Future Value (Simple Recursion): " + futureValue);

        // Predict future value using memoization
        double[] memo = new double[data.getYears() + 1];
        double futureValueMemo = FinancialForecasting.predictFutureValueMemo(
            data.getInitialValue(), data.getGrowthRate(), data.getYears(), memo);
        System.out.println("Predicted Future Value (Memoization): " + futureValueMemo);
    }
}
