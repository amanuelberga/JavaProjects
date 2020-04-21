/**created by Amanuel 10/27**/
import java.util.Scanner;
public class Prime{
   int x;
   public static boolean isPrime(int x){
      for(int i = 2; i < x; i++)
         if(x % i == 0 && x > 2){
            return false;
         }else if(x <= 1){
            return false;
         }
         return true; 
   }
   public static void main(String [] args){
      Scanner aman = new Scanner(System.in);
      int a = aman.nextInt();
      if(isPrime(a)==true){
         System.out.println("The number " + a + " is prime.");
      }else{
         System.out.println("The number "+ a + " is not prime.");
      }
   }
} 