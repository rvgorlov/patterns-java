package pizza_interface;

import java.util.ArrayList;

/**
 * Created by rvgorlov on 11.07.16.
 */
public abstract class Pizza {
    public String name, dough, sauce;
    public ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.printf("Prepare " + name + "\n");
        System.out.printf("Tossing dough \n");
        System.out.printf("Adding sauce...\n");
        System.out.printf("Adding toppings");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.printf(" " + toppings.get(i));
        }
        System.out.printf("\n");
    }
    public void bake(){
        System.out.printf("Bake for 25 minutes for 350\n");
    }
    public void cut() {
        System.out.printf("Cutting pizza\n");
    }
    public void box(){
        System.out.printf("Place Pizza in box");
    }

    public String getName() {
        return name;
    }
}
