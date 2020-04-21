import java.util.Scanner;
public class oddOrEven{
   public static void main(String [] args){
      Scanner aman = new Scanner(System.in);
      int a =0;
      while(aman.hasNextInt()){
      a= aman.nextInt();
      if(a%2 ==0){
         System.out.println("Even");
      }else{
         System.out.println("odd");
      }
      }
   }
}