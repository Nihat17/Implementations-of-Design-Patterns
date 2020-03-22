public class RemoteLoader {
    public static void main(String[] args){

      RemoteControl remoteControl = new RemoteControl();

      Light light = new Light("Living Room");

      remoteControl.setCommand(0, () -> {light.on();}, () -> {light.off();});

      remoteControl.onButtonWasPushed(0);
      /*TV tv = new TV("Living Room");
      Stereo stereo = new Stereo("Living Room");
      Hottub hottub = new Hottub();

      LightOnCommand lightOn = new LightOnCommand(light);
      LightOffCommand lightOff = new LightOffCommand(light);

      StereoOnCommand stereoOn = new StereoOnCommand(stereo);
      StereoOffCommand stereoOff = new StereoOffCommand(stereo);

      TVOnCommand tvOn = new TVOnCommand(tv);
      TVOffCommand tvOff = new TVOffCommand(tv);

      HottubOnCommand hottubOn = new HottubOnCommand(hottub);
      HotttubOffCommand hotttubOff = new HotttubOffCommand(hottub);

      Command [] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
      Command [] partyOff = {lightOff, stereoOff, tvOff, hotttubOff};

      MacroCommand partyOnMacro = new MacroCommand(partyOn);
      MacroCommand partyOffMacro = new MacroCommand(partyOff);

      remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

      System.out.println(remoteControl);
      System.out.println("---Pushing Macro On---");
      remoteControl.onButtonWasPushed(0);
      System.out.println("---Pushing Macro Off---");
      remoteControl.offButtonWasPushed(0);
      remoteControl.undoButtonWasPushed();
       */
    }
}
