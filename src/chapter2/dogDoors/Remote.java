package chapter2.dogDoors;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {
    private DogDoor dogDoor;

    public Remote(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void pressButton(){
        System.out.println("Pressing the remote control button...");
        if(dogDoor.isOpen()){
            dogDoor.close();
        }else{
            dogDoor.oper();

            /**
             * timer обьявлен final т.к. его метод cancel() мы вызываем в анонимном классе
             */
            final Timer timer = new Timer();
            timer.schedule(new TimerTask(){
                @Override
                public void run() {
                    dogDoor.close();
                    timer.cancel();
                }
            }, 5000);
        }
    }
}
