import java.util.Scanner;
public class Alphabet{
   
   public static String whatsMissing(String s){
      String alpha = "abcdefghijklmnopqrstuvwxyz";
      String output="";
      int a;
      for(int i=0; i<alpha.length(); i++){
        a = s.indexOf(alpha.charAt(i));
         //alpha = substring(alpha.indexOf(s.charAt()));
         if(a==-1)
         output+=alpha.charAt(i);
      }
      return output ;
   }
   public static void main(String [] args){
      Scanner user = new Scanner(System.in);
      Alphabet aman = new Alphabet();
      System.out.println("Write a sentence");
      String input = user.nextLine();
      input.toLowerCase();
      String last = whatsMissing(input);
      System.out.println("The missing letters are:" + last);
   }
}