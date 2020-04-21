import java.util.Scanner;
public class palidr{
   String reverse1(String s){
      String r = "";
      if(r==null)
         return "";
      for(int i=0; i<s.length(); i++){
         r = r+s.charAt(s.length()-1-i);
      }
      return r;
   }
   public boolean palidrome1(String s){
      if(s==null)
         return true;
      return s.equals(reverse1(s));
   }
   public static void main(String [] args){
      Reverse m = new Reverse();
      //use assert to check if any mistake 
      assert "".equals(m.reverse1(null)); 
      assert "meba".equals(m.reverse1("abem"));
      ///////////////////////////////////
      // take input form the user and checks if correct 
      Scanner aman = new Scanner(System.in);
      String user = aman.nextLine();
      String rev = m.reverse1(user);
      //boolean q = m.palidrome1(user);
      System.out.println(rev + q);
   }
}