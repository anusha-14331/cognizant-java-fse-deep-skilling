public class FinancialForecast {

    public static double forecast(double amount, int years) {

        if(years == 0)
            return amount;

        return forecast(amount * 1.10, years - 1);
    }

    public static void main(String[] args) {

        double currentRevenue = 10000;

        int years = 5;

        double futureRevenue = forecast(currentRevenue, years);

        System.out.println("Future Revenue = " + futureRevenue);
    }
}
