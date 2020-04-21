package Commute;

public class BusCommuter extends PayCommuter {
    private final double MONTHLY_RATE;
    private boolean busPass;
    public BusCommuter(String name, double FARE, double MONTHLY_RATE){
        super(name, FARE);
        this.MONTHLY_RATE = MONTHLY_RATE;
        busPass=false;
    }
    public void buyBusPass(double FM){
        if(FM>MONTHLY_RATE){
            busPass=true;
        }
    }

    //@Override
    public void addMiles(int miles) {
        if(getPaid()==true || busPass==true){
            super.addMiles(getMiles());
            busPass=false;
        }
    }

    @Override
    public String toString() {
        return super.toString()+ " - Monthly pass: "+ MONTHLY_RATE;
    }
}
