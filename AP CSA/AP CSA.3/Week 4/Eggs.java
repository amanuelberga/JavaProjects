public class Eggs implements Priceable{
   public static final double W_PRICE_PER_DOZEN = 7.00;
   public static final double B_PRICE_PER_DOZEN = 8.00;
   private int dozen;
   public boolean brown;
   
   public Eggs(int dozen, boolean brown){
   this.dozen = dozen;
   this.brown = brown;
   }
   
   public double getPrice(){
      if(brown)
         return dozen*B_PRICE_PER_DOZEN;
      else
         return dozen*W_PRICE_PER_DOZEN;
   }
   
}