package Exam1;

public class Advance extends Ticket{
    private int days;
    public Advance(int days){
        super();
    }
    public double getPrice() {
        if(days>10){
            return 30;
        }
        return 40;
    }
}
