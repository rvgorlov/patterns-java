/**
 * Created by rvgorlov on 24.08.16.
 */
public class test_code {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.printf(Integer.toString(singleton1.getNumber()) + '\n');
        Singleton singleton2 = Singleton.getInstance();
        singleton2.setNumber(500);
        System.out.printf(Integer.toString(singleton1.getNumber()) + '\n');
    }
}


