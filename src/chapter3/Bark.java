package chapter3;


public class Bark {
    private String sound;

    public Bark(String sound){
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Bark){
            Bark bark = (Bark) obj;
            if(this.sound.equalsIgnoreCase(bark.getSound())){
                return true;
            }
        }
        return false;
    }
}
