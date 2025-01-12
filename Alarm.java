package cwiczeniaJava;

import java.time.LocalDateTime;

public class Alarm {
   private boolean active;
    private final String message;
    private LocalDateTime snoozeUntil;


    public Alarm(String message) {
        this.message = message;
        stopSnoozing();
    }

   public void snooze() {
        snoozeUntil = LocalDateTime.now().plusMinutes(5);
    }

   public boolean isSnoozing() {
        return (snoozeUntil.isAfter(LocalDateTime.now()));
    }

    public void turnOn() {
        this.active = true;
    }
    public void turnOff() {
        this.active = false;
    }
    public String getReport() { return getReport(false);}

   private void stopSnoozing() {snoozeUntil = LocalDateTime.now().minusSeconds(1);}
    public String getReport(boolean uppercase ) {
        if (active && !isSnoozing()) {
            if (uppercase)
                return message.toUpperCase();
            else
                return message;
        } else
            return "";
    }
    void sendReport() {
        System.out.println(getReport( true));
    }

}
