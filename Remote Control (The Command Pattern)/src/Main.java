public class Main {
    public static void main(String[] args){
      RemoteControl remoteControl = new RemoteControl();
      Light livinRoomLight = new Light("Living Room");

      LightOnCommand livingRoomLightOn = new LightOnCommand(livinRoomLight);
      LightOffCommand livingRoomLightOff = new LightOffCommand(livinRoomLight);

      remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

      remoteControl.onButtonWasPushed(0);
      remoteControl.offButtonWasPushed(0);
      System.out.println(remoteControl);
      remoteControl.undoButtonWasPushed();
      remoteControl.offButtonWasPushed(0);
      remoteControl.onButtonWasPushed(0);
      System.out.println(remoteControl);
      remoteControl.undoButtonWasPushed();
    }
}
