package cwiczeniaJava;

public class AlarmTest {
    public static void main(String[] args) {
        Alarm alarm = new Alarm("Temperature is too high");
        alarm.turnOn();
        alarm.sendReport();
    }
}
