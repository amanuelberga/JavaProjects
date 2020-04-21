import java.util.Scanner;

public class ATade{
   public static String cal(int a){
      for(int i=2; i<a; i++){
         if(a%i==0){
            return a+" is a prime number.";
         }
      }
      return a+" is not a prime number.";
   }
   public static void main(String [] args){
     Scanner user = new Scanner(System.in);
     int value = user.nextInt();
     System.out.println(cal(value));
   }
}