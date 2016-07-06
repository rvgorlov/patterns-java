package AbstractClass;

/**
 * Created by rvgorlov on 06.07.16.
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";

    public  String getDescription() {
        return description;
    }

    public abstract double cost();
}
