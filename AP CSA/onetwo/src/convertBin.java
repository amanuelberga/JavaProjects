import java.util.Scanner;
public class convertBin{
   String convertToBinary(int n){
      String result = "";
      if(n==0){
         return "0";
      }
      if(n < 0){
         return "wrong number";
      }
      while(n>0){
      if(n%2==0){
         result = "0" +result;
      }else{
         result = "1"+result;
      }
      n=n/2;
      }
      return result;
   }
   public static void main(String [] args){
      convertBin a = new convertBin();
      System.out.println("provide a number");
      Scanner aman = new Scanner(System.in);
      int user = aman.nextInt();
      System.out.println("Here is your binary number: " + a.convertToBinary(user));
   }
}
//// 