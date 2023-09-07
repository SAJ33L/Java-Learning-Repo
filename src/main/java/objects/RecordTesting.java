package objects;

public class RecordTesting {

    public static void main(String[] args) {

        Record record = new Record(1, 1, "Local", 5000);
        System.out.println("The id is: " + record.id() + " Customer id is: " + record.customerId()
                + " Type is: " + record.type() + " Balance is: " + record.balance());
    }
}
