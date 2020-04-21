public class Water implements Priceable{
   public final double PRICE_PER_PACKAGE = 3.00;
   private int Package;
   
   Water(int Package){this.Package = Package;}
   
   public double getPrice(){
      return Package*PRICE_PER_PACKAGE;
   }
}