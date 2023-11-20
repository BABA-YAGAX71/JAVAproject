public class ElectricityBillCalculator {
    public double calculateBill(int units) {
        // Electricity tariff rates
        final double BASE_CHARGE = 100.0;
        final double RATE_BELOW_100 = 1.5;
        final double RATE_100_TO_300 = 2.5;
        final double RATE_ABOVE_300 = 4.0;

        double bill = BASE_CHARGE;

        if (units <= 100) {
            bill += units * RATE_BELOW_100;
        } else if (units <= 300) {
            bill += 100 * RATE_BELOW_100 + (units - 100) * RATE_100_TO_300;
        } else {
            bill += 100 * RATE_BELOW_100 + 200 * RATE_100_TO_300 + (units - 300) * RATE_ABOVE_300;
        }

        return bill;
    }
}
