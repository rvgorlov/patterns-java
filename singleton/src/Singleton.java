/**
 * Created by rvgorlov on 24.08.16.
 */
public class Singleton {
    private volatile static Singleton uniqueInstance;
    private int number;

    private Singleton () {
        number = 1;
    }

    public static Singleton getInstance () {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }
}
