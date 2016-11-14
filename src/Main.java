public class Main {

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();

        sw.consumer = lamp;

        sw.switchOn();
    }

}
