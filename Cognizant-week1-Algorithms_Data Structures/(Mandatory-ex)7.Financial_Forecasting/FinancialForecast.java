package Financial_Forecasting;

public class FinancialForecast {

    public static double forecastRecursive(int years, double currentValue, double rate) {
        if (years == 0) {
            return currentValue;
        }
        return forecastRecursive(years - 1, currentValue, rate) * (1 + rate);
    }

    public static void main(String[] args) {
        double currentValue = 10000.0;  
        double growthRate = 0.08;       
        int years = 5;                 

        double futureValueRecursive = forecastRecursive(years, currentValue, growthRate);
        System.out.printf("Future Value after %d years: ₹%.2f\n", years, futureValueRecursive);

    }
}


