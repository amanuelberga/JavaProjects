public class OnlineOrder{

   String orderName;
   private double totalCost;
   private double tax;
   int numTurkey;
   int numItalian;
   int numVeggie;
   int numBLT;
   final double TAX_RATE = 0.07;
   
   public OnlineOrder(String orderName, int numTurkey, int numItalian, int numVeggie, int numBLT){
      this.orderName = orderName;
      this.numTurkey = numTurkey;
      this.numItalian = numItalian;
      this.numVeggie = numVeggie;
      this.numBLT = numBLT;
      totalCost = numTurkey*4.99 + numItalian*4.99 + numVeggie*3.99 + numBLT*4.99;
      tax = totalCost*TAX_RATE;
   }
   
   public void changeOrder(int a, int b, int c, int d){
   //if(d<0||c<0||b<0||a<0){return;}
      if(a>=0){
         this.numTurkey = a;
      }else this.numTurkey =0;
      if(b>=0){
         this.numItalian = b;
      }else this.numItalian =0;
      if(c>=0){
         this.numVeggie = c;
      }else this.numVeggie =0;
      if(d>=0){
         this.numBLT = d;
      }else this.numBLT =0;
      // if(d<0||c<0||b<0||a<0){return;}
      totalCost = numTurkey*4.99 + numItalian*4.99 + numVeggie*3.99 + numBLT*4.99;
      tax = (double)Math.round((totalCost*TAX_RATE)*100)/100;
   }
   
   public double getTax(){
      return tax;
   }
   
   public double getTotalCost(){
      return totalCost;
   }
   
   public String toString(){
      //OnlineOrder order = new OnlineOrder("Sarah",0,0,1,1);
      double f = (double)Math.round((totalCost + tax)*100)/100;
      return orderName + ", your order comes to $" + f;
   }
}