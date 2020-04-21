import java.util.Scanner;
public class promtingUser{
   public static void main(String [] args){
      Scanner aman = new Scanner(System.in);
      int x;
      do{
         System.out.println("Please provide an  even integer:");
         x = aman.nextInt();
      }while(x % 2 != 0);
      System.out.println("Thank you for providing an even intrger.");
   }
}