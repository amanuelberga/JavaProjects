package Phone;

public class PayPhone extends Phone {
    private double cost;
    protected double moneyInserted;
    public PayPhone(int ac, int p, int ln, double c) {
        super(ac, p, ln);
        cost = ((c >= 0) ? c : 0);
    }
    public void insertMoney(double money) {
        moneyInserted += money;
    }
    public String makeCall(Phone p) {
        if (moneyInserted >= cost) {
            moneyInserted -= cost;
            return super.makeCall(p);
        }
        return "Please insert more money to place a call";
    }

    Object o = new Phone(317, 555, 1000);
    Phone ph = new CellPhone(888, 555, 6642, 78.44, 66.3);
    Object p = new PayPhone(954, 555, 4242, .25);


}

