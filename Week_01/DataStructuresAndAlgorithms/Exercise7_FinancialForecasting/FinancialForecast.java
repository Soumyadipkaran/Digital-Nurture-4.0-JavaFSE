public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double currentValue, double growthRate, int years) {
        // Base condition
        if (years == 0) {
            return currentValue;
        }
        // Recursive call
        return futureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 10000;    // Starting value
        double growthRate = 0.10;       // 10% annual growth rate
        int years = 3;                  // Number of years to forecast

        double result = futureValue(currentValue, growthRate, years);

        System.out.println("Current value: Rs " + currentValue);
        System.out.println("Annual growth rate: " + (growthRate * 100) + "%");
        System.out.println("Future value after " + years + " years: Rs " + result);
    }
}

