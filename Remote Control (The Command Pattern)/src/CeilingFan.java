public class CeilingFan {
    String roomName;

    public CeilingFan(String roomName) {
        this.roomName = roomName;
    }

    public void on(){
        System.out.println(roomName +" ceiling fan is on");
    }
    public void off(){
        System.out.println(roomName +" ceiling fan is off");
    }
}
