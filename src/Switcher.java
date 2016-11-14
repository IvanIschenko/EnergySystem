
public class Switcher {

    public ElectricityConsumer consumer;

    public void switchOn() {
        System.out.println("The Switcher is on!");

        if (consumer != null) {
            consumer.electricityOn();
        }
    }

}
