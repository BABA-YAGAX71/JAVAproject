import java.util.Scanner;

public class ElectricityBillSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Electricity Bill System");

        System.out.print("Enter your consumer number: ");
        int consumerNumber = scanner.nextInt();

        System.out.print("Enter the name of the consumer: ");
        String consumerName = scanner.next();

        System.out.print("Enter the units consumed: ");
        int unitsConsumed = scanner.nextInt();

        Consumer consumer = new Consumer(consumerNumber, consumerName, unitsConsumed);
        double totalBill = new ElectricityBillCalculator().calculateBill(consumer.getUnitsConsumed());

        displayBillDetails(consumer, totalBill);

        scanner.close();
    }

    private static void displayBillDetails(Consumer consumer, double totalBill) {
        System.out.println("\nElectricity Bill Details:");
        System.out.println("Consumer Number: " + consumer.getConsumerNumber());
        System.out.println("Consumer Name: " + consumer.getConsumerName());
        System.out.println("Units Consumed: " + consumer.getUnitsConsumed());
        System.out.println("Total Bill Amount: Rs. " + totalBill);
    }
}

