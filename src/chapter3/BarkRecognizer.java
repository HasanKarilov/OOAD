package chapter3;

import java.util.List;

public class BarkRecognizer {
    private DogDoor dogDoor;

    public BarkRecognizer(DogDoor dogDoor) {
        this.dogDoor = dogDoor;
    }

    public void recognize(Bark bark){
        System.out.println("   BarkRecognizer: Heard a '" + bark.getSound() + "'");
        List<Bark> barks = this.dogDoor.getAllowedBark();

        for (Bark bark1: barks) {
            if(bark1.equals(bark)){
                dogDoor.open();
                return;
            }

        }

        System.out.println("This dog is not allowed.");
    }
}
