package Commute;
//Write the entire PayCommuter class which should extend the Commuter class.
// The class contains the following elements: a constant double variable FARE; a boolean variable paid; a constructor; and the methods described below.
//
//The PayCommuter constructor should take two arguments, a String representing the name of the commuter, and
// a double representing the fare they must pay to commute.  In the constructor, set the name and FARE based on these arguments, and then set paid to false.
//Write two accessors (getPaid and getFare), each simply returning their respective field values. Write a method
// called payFare that takes a double as an argument representing the paid fare. If the value is greater than the cost
// of the commute, set the paid variable to true. Write an overridden method for addMiles, checking to see if the commuter
// has paid his or her fare and then behaving like a typical Commuter and resetting the paid flag to false. Write an overridden method for
// toString which prints as shown below.
//
//Ex. PayCommuter p = new PayCommuter("Robyn",1.25);
//
//   System.out.println(p);     // "Robyn: 0 - Single ride: $1.25"

public class PayCommuter extends Commuter{
      private final double FARE;
      private boolean paid;


    public PayCommuter(String name, double FARE) {
        super(name);
        this.FARE = FARE;
        paid=false;
    }
    //@Override
    public void addMiles(int miles) {
        if(paid==true){
            super.addMiles(getMiles());
            paid=false;
        }
    }

    public void payFare(double p){
        if(p>FARE){
            paid=true;
        }
    }


    public double getFare() {
        return FARE;
    }

    public boolean getPaid() {
        return paid;
    }

   // @Override
    public String toString() {
        return super.toString() + " - Single ride: "+ FARE;
    }
}
