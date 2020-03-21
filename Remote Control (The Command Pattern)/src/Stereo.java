public class Stereo {
    private String room;
    int volume = 0;

    public Stereo(String room) {
        this.room = room;
    }

    public void on(){
        System.out.println(room + " stereo is on");
    }
    public void setCd(){
        System.out.println(room + " CD is set");
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume is set to " + volume);
    }
    public void off(){
        System.out.println(room + " stereo is off");
    }
}
