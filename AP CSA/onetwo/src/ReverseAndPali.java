import java.util.Scanner;
public class ReverseAndPali{
   String reverse1(String a){
      String rev = "";
      if(a==null)
         return "";
      int b = a.length();
      for(int i = 0; i < b; i++){
         rev = rev + a.chatAt(b-1-i);
      }
      return rev;
   }
   public boolean isPali(String a){
      if(a==null)
         return true;
      return a.equals(reverse1(a));
   }
   public static void main(String [] args){
      Scanner aman = new Scanner(System.in);  
   }
}