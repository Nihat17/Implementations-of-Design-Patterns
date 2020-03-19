public class GarageDoor {
    String room;

    public GarageDoor(String room) {
        this.room = room;
    }

    public void up(){
        System.out.println("Garage door is up");
    }
    public void down(){
        System.out.println("Garage door is down");
    }
    public void stop(){
        System.out.println("action stopped");
    }
    public void lightOn(){
        System.out.println("Garage light is on");
    }
    public void lightOff(){
        System.out.println("Garage light is off");
    }
}
