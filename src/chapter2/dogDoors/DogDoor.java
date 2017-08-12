package chapter2.dogDoors;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor
{
    private boolean open;

    public DogDoor() {
        this.open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void oper(){
        System.out.println("The dog door opens");
        this.open = true;

        /**
         * timer обьявлен final т.к. его метод cancel() мы вызываем в анонимном классе
         */
        final Timer timer = new Timer();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close(){
        System.out.println("The dog door closes");
        this.open = false;
    }

}
