public class FinancialForecasting {

    // Recursive method to calculate the future value
    public static double predictFutureValue(double initialValue, double growthRate, int years) {
        // Base case: If no years are left, return the initial value
        if (years == 0) {
            return initialValue;
        }
        // Recursive case: Calculate the value for the next year
        return predictFutureValue(initialValue * (1 + growthRate), growthRate, years - 1);
    }

    // Optimized method using memoization to avoid excessive computation
    public static double predictFutureValueMemo(double initialValue, double growthRate, int years, double[] memo) {
        // Base case: If no years are left, return the initial value
        if (years == 0) {
            return initialValue;
        }
        // Check if the value for the current year is already computed
        if (memo[years] != 0) {
            return memo[years];
        }
        // Recursive case: Calculate the value for the next year
        memo[years] = predictFutureValueMemo(initialValue * (1 + growthRate), growthRate, years - 1, memo);
        return memo[years];
    }
}
