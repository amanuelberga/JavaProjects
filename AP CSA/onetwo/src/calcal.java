import java.util.Scanner;
public class calcal{
   int abem(int a){
      int c = 1;
      while(a>1){
         System.out.print(a + ", ");
         c++;
         if(a%2==0){
            a/=2;
         }else{
            a= a*3+1;
         }
      }
      System.out.println(a);
      return c;
   }
   public static void main(String [] args){
      calcal user = new calcal();
      Scanner aman = new Scanner(System.in);
      int a = aman.nextInt();
      System.out.println("the count is: " + user.abem(a));
      int [][] ar = new int[5][5];
      int ar1 [][] = new int [8][8];
   }
}