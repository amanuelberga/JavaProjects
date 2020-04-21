/**
 * Created by Administrator on 10/11/2017.
 */
import java.util.Scanner;
public class shotC {

        public static void main(String[] args) {
            String s1 = "", s2 = "alacazam", s3 = "abracadabra";
            firstLastCheck(s1);
            firstLastCheck(s2);
            firstLastCheck(s3);
            Scanner a = new Scanner(System.in);
            String d = a.nextLine();
            firstLastCheck(d);

        }
        public static void firstLastCheck(String s) {
            /*** TODO: Write an if statement to serve as the header for the conditional block below.
             Execute the following line if the length of String s is greater than 0 AND
             if the last letter of s is the same as the first letter of s. ***/
            if(s.length()>0){
                char a= 'a';
                System.out.println("nnn");
                if(s.substring(s.length() - 1)==String.valueOf(s.charAt(0)))
                    System.out.println(s + ": Same start and finish letter!");

            }
        }


}
