public class Factorial{
   static int calculate(int a){
      if(a==0){
         return 1;
      }else{
         return a*calculate(a-1);
      }
   }
   public static void main(String [] args){
      int n = 5;
      System.out.println(n+ " = "+calculate(n));
   }
}