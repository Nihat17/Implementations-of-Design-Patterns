public class RemoteLoader {
    public static void main(String[] args){

      RemoteControl remoteControl = new RemoteControl();

      Light livingRoomlight = new Light("Living Room");
      Light kithcenLight = new Light("Kitchen");
      CeilingFan ceilingFan = new CeilingFan("Living Room");
      GarageDoor garageDoor = new GarageDoor("Main house");
      Stereo stereo = new Stereo("Living Room");

      /*
       passing method reference
       instead of lambda expressions
       a method reference is same thing as lambda expressions
       it's just a shorthand for a lambda expression that calls
       just one method
       */
      remoteControl.setCommand(0, livingRoomlight::on, livingRoomlight::off);
      remoteControl.setCommand(1, kithcenLight::on, kithcenLight::off);
      remoteControl.setCommand(2, ceilingFan::high, ceilingFan::off);

      Command stereoOnWithCD = () -> {
          stereo.on(); stereo.setCd(); stereo.setVolume(11);
      };
      remoteControl.setCommand(3, stereoOnWithCD, stereo::off);
      remoteControl.setCommand(4, garageDoor::up, garageDoor::down);

      System.out.println(remoteControl);

      remoteControl.onButtonWasPushed(0);
      remoteControl.offButtonWasPushed(0);
      remoteControl.onButtonWasPushed(1);
      remoteControl.offButtonWasPushed(1);
      remoteControl.onButtonWasPushed(2);
      remoteControl.offButtonWasPushed(2);
      remoteControl.onButtonWasPushed(3);
      remoteControl.offButtonWasPushed(3);

    }
}
