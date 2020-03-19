public class Main {
    public static void main(String[] args){
       RemoteControl remoteControl = new RemoteControl();

       Light livingRoomLight = new Light("Living Room");
       Light kitchenLight = new Light("Kitchen");
       CeilingFan ceilingFan = new CeilingFan("Living Room");
       GarageDoor garageDoor = new GarageDoor("");
       Stereo stereo = new Stereo("Living Room");

       LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
       LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

       LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
       LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

       CeilingFanOnCommand livingRoomCeilingFanOn = new CeilingFanOnCommand(ceilingFan);
       CeilingFanOffCommand livingRoomCeilingFanOff = new CeilingFanOffCommand(ceilingFan);

       GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
       GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

       StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
       StereoOffCommand stereoOff = new StereoOffCommand(stereo);

       remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
       remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
       remoteControl.setCommand(2, livingRoomCeilingFanOn, livingRoomCeilingFanOff);
       remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
       remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

       System.out.println(remoteControl);

       for(int i = 0; i < 4; i++){
           remoteControl.onButtonWasPushed(i);
           remoteControl.offButtonWasPushed(i);
       }
    }
}
