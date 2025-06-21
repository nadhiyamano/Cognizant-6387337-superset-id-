package Implementing_the_Command_Pattern;

public class TestCommandPattern {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        System.out.println("Turning light ON:");
        remote.setCommand(lightOn);
        remote.pressButton();

        System.out.println("Turning light OFF:");
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}

