import java.util.Scanner;
public class Summer{
   public static void main(String [] args){
      int x = 0, sum = 0 ,count = 0;
      Scanner abem = new Scanner(System.in);
      while(abem.hasNextInt()){
         x = abem.nextInt();
         sum +=x;
         ++count;
      }
      System.out.println("the sum of " + count + " values is " + sum);
   }
}