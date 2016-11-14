public class Main {

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // event subscribe
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        sw.switchOn();
    }

}
