
public class Lamp implements ElectricityConsumer{

    public void lightOn() {
        System.out.println("The Lamp is on!");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
