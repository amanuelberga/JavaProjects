public class stringAScII{
   public static void main(String [] args){
      String buildMe = "";

          /*** TODO: Write a for loop that constructs a String using the
                     ASCII characters 'P' through 'U'  ***/
          for( int x =80; x<=85; x++){
               buildMe = buildMe + (char)x;
          }
          System.out.println("String: " + buildMe + " ");
     }
   }
