public class Consumer {
    private int consumerNumber;
    private String consumerName;
    private int unitsConsumed;

    public Consumer(int consumerNumber, String consumerName, int unitsConsumed) {
        this.consumerNumber = consumerNumber;
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    public int getConsumerNumber() {
        return consumerNumber;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }
}
