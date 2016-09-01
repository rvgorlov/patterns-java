public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light)
    {
        this.light = light;
    }

    public void execute(){
        System.out.printf("\nLight on Command\n");
        this.light.on();
    }
}
