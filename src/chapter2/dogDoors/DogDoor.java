package chapter2.dogDoors;

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
    }

    public void close(){
        System.out.println("The dog door closes");
        this.open = false;
    }

}
