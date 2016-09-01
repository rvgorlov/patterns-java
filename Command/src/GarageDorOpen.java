/**
 * Created by rvgorlov on 01.09.16.
 */
public class GarageDorOpen implements Command{
    public GarageDorOpen() {}
    public void up() {
        System.out.printf("\nDor UP!\n");
    }

    public void down() {
        System.out.printf("\nDor DOWN!\n");
    }

    public void stop() {
        System.out.printf("\nDor STOP\n");
    }

    public void lightOn() {
        System.out.printf("\nGarage Light ON!\n");
    }

    public void lightOff() {
        System.out.printf("\nGarage Light OFF!\n");
    }

    public void execute() {
        this.lightOn();
        this.up();
        this.stop();
        this.lightOff();
        this.down();
    }
}
