public class Main {

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // event subscribe. One event - different subscribers
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);
        sw.addElectricityListener(
                new ElectricityConsumer() {
                    @Override
                    public void electricityOn() {
                        System.out.println("Fire!");
                    }
                }
        );

        sw.switchOn();
    }

}
