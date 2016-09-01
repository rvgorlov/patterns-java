/**
 * Created by rvgorlov on 01.09.16.
 */
public class tests {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDorOpen garageDorOpen = new GarageDorOpen();

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDorOpen);
        remote.buttonWasPressed();


    }
}
