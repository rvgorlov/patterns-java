/**
 * Created by rvgorlov on 05.07.16.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private float statistics;
    private float numbers;
    private float sum;
    private Subject subject;

    public StatisticsDisplay(Subject sub) {
        statistics = 0;
        numbers = 0;
        sum = 0;
        this.subject = sub;
        sub.registerObserver(this);
    }

    public void update(float temperature,float humidity, float pressure) {
        this.sum += temperature;
        ++this.numbers;
        this.statistics = this.sum / this.numbers;
        display();
    }

    public void display() {
        System.out.printf("\n  " + statistics);
    }
}
